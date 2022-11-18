import java.util.Scanner;

public class Users {

    public static void main(String[] args) {
        Sticks player1 = new Sticks();
        Sticks player2 = new Sticks();
        Scanner in = new Scanner(System.in);
        String uInput = "";

        do {
            System.out.println("Hello, you have " + player1.getLHand() + " sticks on your left hand and "
                    + player1.getRHand() + " on your right hand, player 1. \n");
            System.out.println("Hello, you have " + player2.getLHand() + " sticks on your left hand and "
                    + player2.getRHand() + " on your right hand, player 2. \n");
            do {
                System.out.print("Would you like to merge or attack, player 1: ");
                uInput = in.nextLine();
            } while (!(uInput.contentEquals("merge") || !uInput.contentEquals("attack")));

            if (uInput.contentEquals("merge")) {
                player1.combineHand();
            } else {
                do{
                    System.out.println("Which hand will you hit with: ");
                    uInput = in.nextLine();
                } while ((!(uInput.contentEquals("right") || uInput.contentEquals("left")))

                if (uInput.contentEquals("right")){
                    int uInputInt;
                    do{
                        System.out.println("How Much will you hit for: ");
                        uInputInt = in.nextInt();
                    } while (uInputInt > 0)
                }
            }
        } while (!uInput.contentEquals("q"));
    }

}
