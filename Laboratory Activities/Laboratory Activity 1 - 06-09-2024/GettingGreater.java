import java.util.Scanner;

class GettingGreater {
    public static void main(String[] args) {
        Scanner Values = new Scanner(System.in);
        System.out.print("Getting the Greater Value\n");
        
        System.out.print("Enter first character: ");
        char First = Values.next().charAt(0);
        int AsciiFirst = (int) First;
        
        System.out.print("Enter second character: ");
        char Second = Values.next().charAt(0);
        int AsciiSecond = (int) Second;
        
        int GreaterAscii = Math.max(AsciiFirst, AsciiSecond);
        char GreaterChar = (char) GreaterAscii;
        
        System.out.println("-----------------------------------------------");
        System.out.println("The character with the greater value is: " + GreaterChar);
        System.out.println("-----------------------------------------------");
        
        System.out.println("Showing the ASCII Codes");
        System.out.println(First + " : " + AsciiFirst);
        System.out.println(Second + " : " + AsciiSecond);
        Values.close();
    }
}