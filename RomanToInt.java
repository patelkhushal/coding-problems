import java.util.*;

public class RomanToInt{

    public static final Map<String, Integer> ROMAN_MAP = new HashMap<String, Integer>() {{
        put("M", 1000);
        put("D", 500);
        put("C", 100);
        put("L", 50);
        put("X", 10);
        put("V", 5);
        put("I", 1);
    }};
    public static int romanToInt(String s) {
        if(s.isEmpty()) return 0;
        int last = ROMAN_MAP.get(Character.toString(s.charAt(s.length() - 1)));
        int runningNum = last;
        for(int i = s.length() - 2; i >= 0; i--){
            int currentNum = ROMAN_MAP.get(Character.toString(s.charAt(i)));
            if(currentNum < last){
                runningNum = runningNum - currentNum;
            }
            else{
                runningNum = runningNum + currentNum;
            }
            last = currentNum;
        }
        return runningNum; 
    }
    public static void main(String[] args){

        String input = "IX";
        input = "LVIII";
        input = "MCMXCIV";
        System.out.println(romanToInt(input));
    }
}