/*
Given an absolute pathname that may have . or .. as part of it, return the shortest standardized path.

For example, given "/usr/bin/../bin/./scripts/../", return "/usr/bin/".
*/

import java.util.*;
public class SimplifyPath {
    public static String simplifyPath(String path) {
        String simplePath = "";
        Stack<String> nameStack = new Stack<String>();
        String[] names = path.split("/");
        for(String s : names){
            if(s.length() >= 1 && !s.equals(".")){
                if(s.equals("..")){
                    if(nameStack.size() >= 1) nameStack.pop();
                }
                else nameStack.push(s);
            }
        }
        for(String s : nameStack) simplePath = simplePath + "/" + s;
        if(simplePath.equals("")) simplePath = "/";
        return simplePath;
    }
    public static void main(String[] args){
        String input = "/a//b////c/d//././/..";
        System.out.println(simplifyPath(input));
    }
}


/*
Extra examples:

Example 1:
Input: "/home/"
Output: "/home"
Explanation: Note that there is no trailing slash after the last directory name.

Example 2:
Input: "/../"
Output: "/"
Explanation: Going one level up from the root directory is a no-op, as the root level is the highest level you can go.

Example 3:
Input: "/home//foo/"
Output: "/home/foo"
Explanation: In the canonical path, multiple consecutive slashes are replaced by a single one.

Example 4:
Input: "/a/./b/../../c/"
Output: "/c"

Example 5:
Input: "/a/../../b/../c//.//"
Output: "/c"

Example 6:
Input: "/a//b////c/d//././/.."
Output: "/a/b/c"
*/