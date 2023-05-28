import card.Card;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * 
 * @author Karanveer Singh
 * @since 27 May 2023
 */
public class CardTrick {

    public static void main(String[] args) {
        Card[] magicHand = generateMagicHand(7);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of the card: ");
        int value = scanner.nextInt();
        System.out.print("Enter the suit of the card (0-3): ");
        int suit = scanner.nextInt();

        Card playersCard = new Card();
        playersCard.setValue(value);
        playersCard.setSuit(Card.SUITS[suit]);

        boolean found = searchCard(magicHand, playersCard);

        if (found) {
            System.out.println("The card is present");
        } else {
            System.out.println("The card is not present");
        }
    }
    
    private static Card[] generateMagicHand(int size) {
        Card[] magicHand = new Card[size];
        Random random = new Random();

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue(random.nextInt(13) + 1);
            c.setSuit(Card.SUITS[random.nextInt(4)]);
            magicHand[i] = c;
        }

        return magicHand;
    }

    private static boolean searchCard(Card[] magicHand, Card card) {
        for (Card c : magicHand) {
            if (c.getValue() == card.getValue() && c.getSuit().equals(card.getSuit())) {
                return true;
           
            }
        }
        return false;
    }
    Card luckyCard = new Card(8,2);
        boolean find = false;
        for (Card card : magicHand) 
        {
            if (card.getValue() == luckyCard.getValue() && card.getSuit().equals(luckyCard.getSuit()))
            {
                find = true;
                break;
            
            }
        }
    if (find)
    {
        System.out.println("Congratulations! Your lucky card is in the magic hand.");
    }
    else 
    {
        System.out.println("Sorry! Your lucky card is not in the magic hand.");
    }
}
