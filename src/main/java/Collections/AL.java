package Collections;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by Dmitry on 22.11.2016.
 */
public class AL {
    public static void main(String[] args) {
        System.out.println("Compare ArrayList and LinkedList performance\n");
        ArrayList<Integer> list_array = new ArrayList<>();
        LinkedList<Integer> list_linked = new LinkedList<>();
        for (int i = 0; i < 100; i++) {
            list_array.add((int) (Math.random() * 100));
        }
        for (int i = 0; i < 100; i++) {
            list_linked.add((int) (Math.random() * 100));
        }

        /*GET*/

        System.out.println("-------------GET--------------");
        long start = System.nanoTime();
        list_array.get(50);
        long end = System.nanoTime();
        long traceTime = end - start;
        long start1 = System.nanoTime();
        list_linked.get(50);
        long end1 = System.nanoTime();
        long traceTime1 = end1 - start1;
        System.out.println("ArrayList get perfomance =" + traceTime + " nanosec\n" +
                "LinkedList get perfomance =" + traceTime1 + " nanosec\n");
        if (traceTime < traceTime1) {
            System.out.println("ArrayList is faster\n");
        } else {
            System.out.println("LinkedList is faster\n");
        }

        /*ADD*/

        System.out.println("-------------ADD--------------");
        long addStart = System.nanoTime();
        list_array.add(50, 100);
        long addEnd = System.nanoTime();
        long addTime = addEnd - addStart;
        long addStart1 = System.nanoTime();
        list_linked.add(50, 100);
        long addEnd1 = System.nanoTime();
        long addTime1 = addEnd1 - addStart1;
        System.out.println("ArrayList add value perfomance =" + addTime + " nanosec\n"
                + "LinkedList add value perfomance =" + addTime1 + " nanosec\n");
        if (addTime < addTime1) {
            System.out.println("ArrayList is faster\n");
        } else {
            System.out.println("LinkedList is faster\n");
        }

        /*SET*/

        System.out.println("-------------SET--------------");
        long setStart = System.nanoTime();
        list_array.set(50, 100);
        long setEnd = System.nanoTime();
        long setTime = setEnd - setStart;
        long setStart1 = System.nanoTime();
        list_linked.add(50, 100);
        long setEnd1 = System.nanoTime();
        long setTime1 = setEnd1 - setStart1;
        System.out.println("ArrayList set value perfomance =" + setTime + " nanosec\n"
                + "LinkedList set value perfomance =" + setTime1 + " nanosec\n");
        if (setTime < setTime1) {
            System.out.println("ArrayList is faster\n");
        } else {
            System.out.println("LinkedList is faster\n");
        }

        /*REMOVE*/

        System.out.println("-------------Remove--------------");
        long removeStart = System.nanoTime();
        list_array.remove(0);
        long removeEnd = System.nanoTime();
        long removeTime = removeEnd - removeStart;
        long removeStart1 = System.nanoTime();
        list_linked.removeFirst();
        long removeEnd1 = System.nanoTime();
        long removeTime1 = removeEnd1 - removeStart1;
        System.out.println("ArrayList remove value from the middle perfomance =" + removeTime + " nanosec\n"
                + "LinkedList remove value from the middle perfomance =" + removeTime1 + " nanosec\n");
        if (removeTime < removeTime1) {
            System.out.println("ArrayList is faster\n");
        } else {
            System.out.println("LinkedList is faster\n");
        }


    }
}