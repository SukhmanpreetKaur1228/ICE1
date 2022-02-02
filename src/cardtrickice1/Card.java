/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardtrickice1;

import java.util.Scanner;

/**
 * define card value and suits
 *
 *
 * @author sivagamasrinivasan
 * @author Sukhmanpreet Kaur
 */
public class Card {

    static Scanner scnr = new Scanner(System.in);

    private int value;
    private String suits; //encapsulation
    //constant
    public static final String[] SUITS = {"diamonds", "clubs", "spades", "hearts"};

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        this.value = value;
    }

    /**
     * @return the suits
     */
    public String getSuits() {
        return suits;
    }

    /**
     * @param suits the suits to set
     */
    public void setSuits(String suits) {
        this.suits = suits;
    }

    /**
     * @return suit
     */

    static String chooseRandomSuits() {
        return Card.SUITS[(int) (Math.random() * 4)];
    }
/**
 * @param uCard
 * 
 */
    public static void askForNumber(Card uCard) {
        System.out.println("Enter card number of your choice");
        String b = scnr.nextLine();
        methodForSuits(uCard, b);
    }
/**
 * @param uCard
 * @param b
 * 
 */
    public static void methodForSuits(Card uCard, String b) {
        try {
            uCard.setValue(Integer.parseInt(b));
        } catch (NumberFormatException ex) {
            switch (b) {
                case "Jack":
                    uCard.setValue(11);
                    break;
                case "Queen":
                    uCard.setValue(12);
                    break;
                case "King":
                    uCard.setValue(13);
                    break;
                default:
                    System.out.println("please enter a valid card number or face");
                    askForNumber(uCard);
                    break;
            }
        }
    }
}
