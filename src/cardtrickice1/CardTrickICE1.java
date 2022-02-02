/*
Name-Sukhmanpreet Kaur
Student Id- 991631228
ICE1
 */
package cardtrickice1;

import java.util.Scanner;

/**
 * step1 : generate 7 random cards and store in array - how step 2: take any
 * card input from user suit,number step 3: user card is in the array 'card is
 * found'
 *
 * @author sivagamasrinivasan
 * @author Sukhmanpreet Kaur
 */
public class CardTrickICE1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        Card[] magicHand = new Card[7]; 
        for (int i = 0; i < magicHand.length; i++) {
            Card c1 = new Card();
            c1.setValue((int) (1 + Math.random() * 14));
            String face = Integer.toString(c1.getValue());
            switch (c1.getValue()) {
                case 1:
                    face = "Ace";
                    break;
                case 11:
                    face = "Jack";
                    break;
                case 12:
                    face = "Queen";
                    break;
                case 13:
                    face = "King";
                    break;
                default:
                    break;
            }

            c1.setSuits(Card.chooseRandomSuits());
            magicHand[i] = c1;
//            System.out.println(face + " of " + magicHand[i].getSuits());
        }
        Card uCard = new Card();
        try {
Card.askForNumber(uCard);


        } catch (NumberFormatException e) {
            System.out.println("Please enter an integer.");

            System.out.println("Enter card number of your choice");
            String b = scnr.nextLine();

            Card.methodForSuits(uCard, b);
        }

        System.out.println("Enter Suit of your choice");
        uCard.setSuits(scnr.nextLine());

        for (int i = 0; i < magicHand.length; i++) {
            if (((uCard.getSuits()).equals(magicHand[i].getSuits())) && ((uCard.getValue() == magicHand[i].getValue()))) {
                System.out.println("You Won! Congratulations");
                break;
            } else if (i == magicHand.length - 1) {
                System.out.println("You lost. Better Luck next time.");
            }
        }
    }

}
