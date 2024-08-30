import java.util.Scanner;

class Temperature {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter a Celsius value: ");
        double celsius = Input.nextInt();
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println(String.format("%.2f Celsius", celsius) + " is " + String.format("%.2f Fahrenheit", fahrenheit));
    }
}