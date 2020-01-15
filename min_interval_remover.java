/*
Given a collection of intervals, find the minimum number of intervals you need to remove to make the rest of the intervals non-overlapping.

Intervals can "touch", such as [0, 1] and [1, 2], but they won't be considered overlapping.

For example, given the intervals (7, 9), (2, 4), (5, 8), return 1 as the last interval can be removed and the first two won't overlap.

The intervals are not necessarily sorted in any order.
*/

import java.awt.Point;
import java.util.ArrayList;
import java.util.Arrays;

public class min_interval_remover{

    public static int minIntervalRemover(Point[] intervals){
        int remove = 0;
        Point last = intervals[0];
        for(int i = 1; i < intervals.length; i++){
            if(intervals[i].getX() < last.getY()){ //if the intervals overlap then remove the longest interval
                if (!(getLength(intervals[i]) > getLength(last))){ //check which one is the longest. if intervals[i] is shorter than last, update last i.e., remove last
                    last = intervals[i];
                }
                remove ++;
            }
            else{
                last = intervals[i];
            }

        }
        return remove;
    }

    public static int getLength(Point a){
        return ((int) a.getY() - (int)a.getX());
    }

    public static void main(String[] args){
        // Point interval1 = new Point(2,4);
        // Point interval2 = new Point(3,8);
        // Point interval3 = new Point(4,7);
        // Point interval4 = new Point(5,6);
        // Point interval5 = new Point(6,7);

        Point interval1 = new Point(2,3);
        Point intervalx = new Point(2,4);
        Point intervaly = new Point(4,5);
        Point interval2 = new Point(5,7);
        Point interval3 = new Point(7,8);
        Point interval4 = new Point(8,9);
        Point interval5 = new Point(9,10);

        Point[] intervals = new Point[] {interval1, intervalx, intervaly, interval2, interval3, interval4, interval5};
        

        // Arrays.sort(intervals, new Comparator<Point>() {
        //     int compare(Point a, Point b) {
        //         int xComp = Integer.compare(a.x, b.x);
        //         if(xComp == 0)
        //             return Integer.compare(a.y, b.y);
        //         else
        //             return xComp;
        //     }
        // });

        System.out.println(minIntervalRemover(intervals));

    }
}