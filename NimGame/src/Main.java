import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.println("Player 1, enter your name: ");
        String player1 = scanner.nextLine();
        System.out.println();
        System.out.println("Player 2, enter your name: ");
        String player2 = scanner.nextLine();

        while(true){

            System.out.println(player1 + ", how many sticks do you take?");
            int player1takes = scanner.nextInt();

            //takestick(player1takes)

            //if(someoneLost) if 0 left - break loop
            //System.out.println(player1 + ", you lost.);
            //System.out.println();
            //System.out.println("Congratulations " + player2 + "!! You've won.");
            //break;

            System.out.println(player2 + ", how many sticks do you take?");
            int player2takes = scanner.nextInt();

            //if(someoneLost) if 0 left - break loop
            //System.out.println(player2 + ", you lost.);
            //System.out.println();
            //System.out.println("Congratulations " + player1 + "!! You've won.");
            //break;

        }
    }
}
