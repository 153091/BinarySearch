import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class BinarySearch {

    public static int indexOf(int[] a, int key) {
    int lo = 0;
    int hi = a.length - 1;

    while (lo <= hi) {
        int mid = lo + (hi - lo)/2 ;

        if (key > a[mid]) lo = mid + 1;
        else if (key < a[mid]) hi = mid -1;
        else if (key == a[mid]) return mid;
    }
    return -1; //если фигня с массивом
    }

    public static void main(String[] args) {
        In in = new In(args[0]);
        int[] input = in.readAllInts();
        Arrays.sort(input);

        while (!StdIn.isEmpty()) {
            int goal = StdIn.readInt();
            StdOut.println(BinarySearch.indexOf(input, goal));
        }
    }
}
