import java.util.ArrayList;
import java.util.Arrays;
public class ArrayDiff {
    public static int[] arrayDiff(int[] a, int[] b) {
        ArrayList<Integer> arrayListA = new ArrayList<>();                 // new arrayLists
        ArrayList<Integer> arrayListB = new ArrayList<>();

        for (int i : a) { arrayListA.add(i); }                             // populate arrayLists
        for (int j : b) { arrayListB.add(j); }

        arrayListA.removeAll(arrayListB);                                  // remove difference

        int[] modified = arrayListA.stream().mapToInt(i -> i).toArray();   // convert back to simple array using stream

        return modified;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(ArrayDiff.arrayDiff(new int[]{1, 2, 2, 2, 3}, new int[]{2})));
        ;

    }

}
