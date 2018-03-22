import java.util.Scanner;

public class SumColumn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row, col;

        System.out.println("Enter row: ");
        row = input.nextInt();
        System.out.println("Enter colum: ");
        col = input.nextInt();

        int[][] matrix = new int[row][col];
        for (row = 0; row < matrix.length; row++) {
            for (col = 0; col < matrix[row].length; col++) {
                System.out.println("Element row " + row + " colum " + col);
                matrix[row][col] = input.nextInt();
            }
        }
        System.out.println("Enter column to calculate the sum: ");
        int sumCol = input.nextInt();
        int sum = 0;

        if (sumCol > matrix.length)
            System.out.println("Wrong column!");
        else {
            for (row = 0; row < matrix.length; row++) {
                sum += matrix[row][sumCol];
            }
        }
        for (row = 0; row < matrix.length; row++) {
            for (col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println("Sum column " + sumCol + " is : " + sum);
    }
}

