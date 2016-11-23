package Collections;


import java.util.HashSet;
import java.util.TreeSet;

/**
 * Created by Dmitry on 22.11.2016.
 */
public class HsTs {
    public static void main(String[] args) {
        System.out.println("Compare HashSet and TreeSet performance\n");
        HashSet<Integer> set_hash = new HashSet<>();
        TreeSet<Integer> set_tree = new TreeSet<>();

        /*Filling the Sets*/

        System.out.println("-----------Filling the sets---------");
        long addStart = System.nanoTime();
        for (int i = 0; i < 100; i++) {
            set_hash.add((int) (Math.random() * 100));
        }
        long addEnd = System.nanoTime();
        long estimateTime = addEnd - addStart;
        long addStart1 = System.nanoTime();
        for (int i = 0; i < 100; i++) {
            set_tree.add((int) (Math.random() * 100));
        }
        long addEnd1 = System.nanoTime();
        long estimateTime1 = addEnd1 - addStart1;
        System.out.println("Filling the HashSet =" + estimateTime + " nanosec\n"
                + "Filling the TreeSet = " + estimateTime1 + " nanosec\n");
        if (estimateTime < estimateTime1) {
            System.out.println("HashSet is faster\n");
        } else {
            System.out.println("TreeSet is faster\n");
        }

        /*CONTAINS*/

        System.out.println("-------------Contains--------------");
        long startContains = System.nanoTime();
        set_hash.contains(10);
        long end = System.nanoTime();
        long traceTimeContains = end - startContains;
        long start1Contains = System.nanoTime();
        set_tree.contains(50);
        long end1Contains = System.nanoTime();
        long traceTime1Contains = end1Contains - start1Contains;
        System.out.println("HashSet contains perfomance = " + traceTimeContains + " nanosec\n" +
                "TreeSet contains perfomance = " + traceTime1Contains + " nanosec\n");
        if (traceTimeContains < traceTime1Contains) {
            System.out.println("HashSet is faster\n");
        } else {
            System.out.println("TreeSet is faster\n");
        }

        /*ToArray*/

        System.out.println("-------------To Array--------------");
        long startToArray = System.nanoTime();
        set_hash.toArray();
        long endToArray = System.nanoTime();
        long traceTimeToArray = endToArray - startToArray;
        long start1ToArray = System.nanoTime();
        set_tree.toArray();
        long end1ToArray = System.nanoTime();
        long traceTime1ToArray = end1ToArray - start1ToArray;
        System.out.println("HashSet ToArray perfomance = " + traceTimeToArray + " nanosec\n" +
                "TreeSet ToArray perfomance = " + traceTime1ToArray + " nanosec\n");
        if (traceTimeToArray < traceTime1ToArray) {
            System.out.println("HashSet is faster\n");
        } else {
            System.out.println("TreeSet is faster\n");
        }

        /*AddAll*/

        System.out.println("-------------AddAll--------------");
        long startAddAll = System.nanoTime();
        set_hash.addAll(set_tree);
        long endAddAll = System.nanoTime();
        long traceTimeAddAll = endAddAll - startAddAll;
        long start1AddAll = System.nanoTime();
        set_tree.addAll(set_hash);
        long end1AddAll = System.nanoTime();
        long traceTime1AddAll = end1AddAll - start1AddAll;
        System.out.println("HashSet AddAll perfomance =" + traceTimeAddAll + " nanosec\n" +
                "TreeSet AddAll perfomance =" + traceTime1AddAll + " nanosec\n");
        if (traceTimeAddAll < traceTime1AddAll) {
            System.out.println("HashSet is faster\n");
        } else {
            System.out.println("TreeSet is faster\n");
        }

        /*Add*/

        System.out.println("-------------Add--------------");
        long startAdd = System.nanoTime();
        set_hash.add(105);
        long endAdd = System.nanoTime();
        long traceTimeAdd = endAdd - startAdd;
        long start1Add = System.nanoTime();
        set_tree.add(111);
        long end1Add = System.nanoTime();
        long traceTime1Add = end1Add - start1Add;
        System.out.println("HashSet Add perfomance =" + traceTimeAdd + " nanosec\n" +
                "TreeSet Add perfomance =" + traceTime1Add + " nanosec\n");
        if (traceTimeAdd < traceTime1Add) {
            System.out.println("HashSet is faster\n");
        } else {
            System.out.println("TreeSet is faster\n");
        }
        System.out.println(set_hash + "\n" + set_tree);
    }
}
