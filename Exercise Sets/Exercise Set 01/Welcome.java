import java.util.Scanner;

class Welcome {
    public static void main (String[] args) {
        Scanner Input = new Scanner(System.in);
        
        System.out.println("Welcome to CS 211: Object-oriented Programing!");
        System.out.print("Enter your name: ");
        String Name = Input.nextLine();
        System.out.println("This course will be fun, " + Name + "!");
    }
}