package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Dmitry on 22.11.2016.
 */
public class HmTm {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map_hash = new HashMap<>();
        TreeMap<Integer, Integer> map_tree = new TreeMap<>();

        /*Filling the Maps*/

        System.out.println("--------Filling the maps--------");
        long start = System.nanoTime();
        for (int i = 0; i < 20; i++) {
            map_hash.put((int) (Math.random() * 20), (int) (Math.random() * 20));
        }
        long end = System.nanoTime();
        long estimateTime = end - start;
        long start1 = System.nanoTime();
        for (int i = 0; i < 20; i++) {
            map_tree.put((int) (Math.random() * 20), (int) (Math.random() * 20));
        }
        long end1 = System.nanoTime();
        long estimateTime1 = end1 - start1;
        System.out.println("Filling the HashMap =" + estimateTime + " nanosec\n"
                + "Filling the TreeMap = " + estimateTime1 + " nanosec\n");
        if (estimateTime < estimateTime1) {
            System.out.println("HashMap is faster\n");
        } else {
            System.out.println("TreeMap is faster\n");
        }

        /*Get keys/values */

        System.out.println("-----Get-----");
        long startGet = System.nanoTime();
        for (Map.Entry<Integer, Integer> e : map_hash.entrySet()) {
            e.getKey();
            e.getValue();
        }
        long endGet = System.nanoTime();
        long estimateTimeGet = endGet - startGet;
        long startGet1 = System.nanoTime();
        for (Map.Entry<Integer, Integer> e : map_tree.entrySet()) {
            e.getKey();
            e.getValue();
        }
        long endGet1 = System.nanoTime();
        long estimateTimeGet1 = endGet1 - startGet1;
        System.out.println("Get keys/values HashMap =" + estimateTimeGet + " nanosec\n"
                + "Get keys/values TreeMap = " + estimateTimeGet1 + " nanosec\n");
        if (estimateTimeGet < estimateTimeGet1) {
            System.out.println("HashMap is faster\n");
        } else {
            System.out.println("TreeMap is faster\n");
        }

        /*Simple Get*/

        System.out.println("------Simple Get-------");
        long startSget = System.nanoTime();
        map_hash.get(10);
        long endSget = System.nanoTime();
        long estimateTimeSget = endSget - startSget;
        long startSget1 = System.nanoTime();
        map_tree.get(10);
        long endSget1 = System.nanoTime();
        long estimateTimeSget1 = endSget1 - startSget1;
        System.out.println("Getting the element from HashMap =" + estimateTimeSget + " nanosec\n"
                + "Getting the element from TreeMap = " + estimateTimeSget1 + " nanosec\n");
        if (estimateTimeSget < estimateTimeSget1) {
            System.out.println("HashMap is faster\n");
        } else {
            System.out.println("TreeMap is faster\n");
        }

        /*Remove*/

        System.out.println("------Remove-------");
        long startRem = System.nanoTime();
        map_hash.remove(10);
        long endRem = System.nanoTime();
        long estimateTimeRem = endRem - startRem;
        long startRem1 = System.nanoTime();
        map_tree.remove(10);
        long endRem1 = System.nanoTime();
        long estimateTimeRem1 = endRem1 - startRem1;
        System.out.println("Removing the element from HashMap =" + estimateTimeRem + " nanosec\n"
                + "Removing the element from TreeMap = " + estimateTimeRem1 + " nanosec\n");
        if (estimateTimeRem < estimateTimeRem1) {
            System.out.println("HashMap is faster\n");
        } else {
            System.out.println("TreeMap is faster\n");
        }
    }
}
