package exercises.arrays;

public class NonSquareArray12 {
    public static void main(String[] args) {
        int[][] array = new int[][]{{1}, {2, 3}, {4, 5, 6}};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i].length + " - ");
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.print(array[i].length + " - {");
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(" " + array[i][j] + " ");
            }
            System.out.println("}");
            System.out.println();
        }
    }
}
