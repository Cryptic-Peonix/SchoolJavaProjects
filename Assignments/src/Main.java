import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        ItemHolder<Person> personItemHolder = new ItemHolder<>(person);
        System.out.println(personItemHolder.getItem());
    }

    private static void arrayStuffThree() {
        int[][] values = {{3,4,5,1}, {33,6,1,2}};

        for (int row = 0; row < values.length; row++) {
            java.util.Arrays.sort(values[row]);
            for (int column = 0; column < values[row].length; column++) {
                System.out.print(values[row][column] + " ");
            }
            System.out.println();
        }
    }

    private static void arrayStuffTwo() {
        double[][] matrix =
                {{1,2,3,4,5},
                        {4,5,6,4,7},
                        {8,9,10,11},
                        {12,13,14,15}
                };
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(matrix[i][3] + " ");
        }
    }

    private static void arrayTest() {
        int[][] matrix = new int[5][5];
        for (int i = 0; i < matrix[4].length; i++) {
            matrix[4][i] = 10;
        }
        for (int[] ints : matrix) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(ints[j] + ", ");
            }
            System.out.println(" ");
        }
    }
}