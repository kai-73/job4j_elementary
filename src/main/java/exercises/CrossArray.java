package exercises;

public class CrossArray {
    public static void printCrossEl(int[] left, int[] right) {
        for (int k : left) {
            for (int i : right) {
                if (k == i) {
                    System.out.println(k);
                }
            }
        }
    }
}
