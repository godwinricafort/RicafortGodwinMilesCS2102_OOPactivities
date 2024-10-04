import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner Size = new Scanner(System.in);
        System.out.print("Enter the size of the multiplication table: ");
        
        int n = Size.nextInt();
        int[][] Array = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                Array[i][j] = (i + 1) * (j + 1);
            }
        }

        System.out.println("Multiplication Table: ");
        
        for (int i = 0; i < Array.length; i++) {
            for (int j = 0; j < Array.length; j++) {
                int number = Array[i][j];
                System.out.printf("%4d", number);
            }
            
            System.out.println();
        }

        Size.close();
    }
}