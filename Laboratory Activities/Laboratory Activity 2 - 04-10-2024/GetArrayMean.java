import java.util.Scanner;

public class GetArrayMean {
    public static float getArrayMean(int[] Array) {
        float Sum = 0f;
        
        for (int Number : Array) {
            Sum += Number;
        }
        
        Sum /= Array.length;
        return Sum;
    }

    public static void main(String[] args) {
        Scanner nElements = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        
        int n = nElements.nextInt();
        int[] Array = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number: ");
            Array[i] = nElements.nextInt();
        }

        float Mean = getArrayMean(Array);
        System.out.println("Mean of array is: " + String.format("%.2f", Mean));

        nElements.close();
    }
}