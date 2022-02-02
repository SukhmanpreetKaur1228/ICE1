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
        Card[] magicHand = new Card[7]; //Array of object
        for (int i = 0; i < magicHand.length; i++) {
            Card c1 = new Card();
            c1.setValue((int) (1 + Math.random() * 14));//use a method to generate random *13
            int a = (int) (Math.random() * 4);
            String face = Integer.toString(c1.getValue());
            if (c1.getValue() == 1) {
                face = "Ace";
            } else if (c1.getValue() == 11) {
                face = "Jack";
            } else if (c1.getValue() == 12) {
                face = "Queen";
            } else if (c1.getValue() == 13) {
                face = "King";
            }
//            switch (a) {
//                case 0:
//                    c1.setSuits("hearts");//random method suit 
//                    break;
//                case 1:
//                    c1.setSuits("spades");//random method suit 
//                    break;
//                case 2:
//                    c1.setSuits("clubs");//random method suit 
//                    break;
//                default:
//                    c1.setSuits("daimond");//random method suit 
//                    break;
//            }
//            
//            System.out.println(face+" of "+c1.getSuits());
            c1.setSuits(Card.SUITS[(int) (Math.random() * 4)]);
            magicHand[i] = c1;
//            System.out.println(face+" of "+magicHand[i].getSuits());
        }
        Card uCard = new Card();
        try {

            System.out.println("Enter card number of your choice");
            uCard.setValue(Integer.parseInt(scnr.nextLine()));
        } catch (NumberFormatException e) {
            System.out.println("Please enter an integer.");

            System.out.println("Enter card number of your choice");
            uCard.setValue(Integer.parseInt(scnr.nextLine()));
        }

        System.out.println("Enter Suit of your choice");
        uCard.setSuits(scnr.nextLine());

        for(int i=0; i<magicHand.length;i++){
            if(((uCard.getSuits()).equals(magicHand[i].getSuits()))&&((uCard.getValue()==magicHand[i].getValue()))){
                System.out.println("You Won! Congratulations");
            }
            else if(i==magicHand.length-1){
                System.out.println("You lost. Better Luck next time.");
            }
        }//step 2:take input 
        //step 3: match with array 
    }

}
