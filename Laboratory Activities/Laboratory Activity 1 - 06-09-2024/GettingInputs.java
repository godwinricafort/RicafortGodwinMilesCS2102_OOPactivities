import java.util.Scanner;

class GettingInputs {
    public static void main(String[] args) {
        Scanner Inputs = new Scanner(System.in);

        System.out.print("Enter the year: ");
        int Year = Inputs.nextInt();
        Inputs.nextLine();

        System.out.print("Enter the genre: ");
        String Genre = Inputs.nextLine();

        System.out.print("Enter the album: ");
        String Album = Inputs.nextLine();

        System.out.print("Enter the song title: ");
        String Song = Inputs.nextLine();

        System.out.print("Enter the artist: ");
        String Artist = Inputs.nextLine();

        System.out.println("-----------------------------");
        System.out.println("SONG DETAILS");
        System.out.println("-----------------------------");

        System.out.println("Year released: " + Year);
        System.out.println("Genre: " + Genre);
        System.out.println("Album: " + Album);
        System.out.println("Title: \"" + Song + "\"");
        System.out.println("Artist: " + Artist);
        Inputs.close();
    }
}
