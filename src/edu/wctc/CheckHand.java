package edu.wctc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CheckHand {
    public static boolean isRoyalFlush(Hand hand){
        List<Card> cards = hand.getHand();
        if (cards.get(0).getFace() == Faces.TEN &&
                cards.get(1).getFace() == Faces.JACK &&
                cards.get(2).getFace() == Faces.QUEEN &&
                cards.get(3).getFace() == Faces.KING &&
                cards.get(4).getFace() == Faces.ACE &&
                cards.get(0).getSuit() == cards.get(2).getSuit() &&
                cards.get(0).getSuit() == cards.get(3).getSuit() &&
                cards.get(0).getSuit() == cards.get(4).getSuit() &&
                cards.get(0).getSuit() == cards.get(1).getSuit())
            return true;
        else
            return false;
    }

    public static boolean isStraightFlush(Hand hand) {
        List<Card> cards = hand.getHand();
        if (cards.get(0).getCardValue() +1 == cards.get(1).getCardValue() &&
                cards.get(1).getCardValue() +1 == cards.get(2).getCardValue() &&
                cards.get(2).getCardValue() +1 == cards.get(3).getCardValue() &&
                cards.get(3).getCardValue() +1 == cards.get(4).getCardValue() &&
                cards.get(0).getSuit() == cards.get(2).getSuit() &&
                cards.get(0).getSuit() == cards.get(3).getSuit() &&
                cards.get(0).getSuit() == cards.get(4).getSuit() &&
                cards.get(0).getSuit() == cards.get(1).getSuit())
            return true;
        else
            return false;
    }

    public static boolean isFourOfAKind(Hand hand) {
        List<Card> cards = hand.getHand();
        if ((cards.get(0).getCardValue() == cards.get(1).getCardValue() &&
                cards.get(0).getCardValue() == cards.get(2).getCardValue() &&
                cards.get(0).getCardValue() == cards.get(3).getCardValue()) ||
                (cards.get(1).getCardValue() == cards.get(2).getCardValue() &&
                        cards.get(1).getCardValue() == cards.get(3).getCardValue() &&
                        cards.get(1).getCardValue() == cards.get(4).getCardValue()))
            return true;
        else
            return false;
    }

    public static boolean isFullHouse(Hand hand) {
        List<Card> cards = hand.getHand();
        List<Card> match1 = new ArrayList<>();
        List<Card> match2 = new ArrayList<>();
        //for (Card c : cards) {
        for (int i=4; i >=0; i--) {
            for (int j=i-1; j >=0; j--) {
                if (cards.get(i).getCardValue() == cards.get(j).getCardValue()) {
                    if (match1.size() == 0) {
                        match1.add(cards.get(i));
                        match1.add(cards.get(j));
                    }
                    if (match1.contains(cards.get(i))  &&
                            !match1.contains(cards.get(j))) {
                        match1.add(cards.get(j));
                    }
                    if (!match1.contains(cards.get(i)) &&
                            match1.get(0).getCardValue() != cards.get(i).getCardValue() &&
                            match2.size() == 0) {
                        match2.add(cards.get(i));
                        match2.add(cards.get(j));
                    }
                    if (match1.get(0).getCardValue() != cards.get(i).getCardValue() &&
                            match2.contains(cards.get(i)) &&
                            !match2.contains(cards.get(j))) {
                        match2.add(cards.get(j));
                    }
                }
            }
        }
        boolean x = (match1.size() == 3 && match2.size() == 2) || (match1.size() == 2 && match2.size() == 3)? true:false;
        return x;

        //OR
        // if (cards.get(0).getCardValue() == cards.get(1).getCardValue() == cards.get(2).getCardValue() &&
        //      cards.get(3).getCardValue() == cards.get(4).getCardValue()) ||
        // if (cards.get(0).getCardValue() == cards.get(1).getCardValue() &&
        //      cards.get(2).getCardValue() == cards.get(3).getCardValue() == cards.get(4).getCardValue()) ||
    }

    public static boolean isFlush(Hand hand) {
        List<Card> cards = hand.getHand();
        if (cards.get(0).getSuit() == cards.get(1).getSuit() &&
                cards.get(0).getSuit() == cards.get(2).getSuit() &&
                cards.get(0).getSuit() == cards.get(3).getSuit() &&
                cards.get(0).getSuit() == cards.get(4).getSuit())
            return true;
        else
            return false;
    }

    public static boolean isStraight(Hand hand){
        List<Card> cards = hand.getHand();
        if (cards.get(0).getCardValue() +1 == cards.get(1).getCardValue() &&
                cards.get(1).getCardValue() +1 == cards.get(2).getCardValue() &&
                cards.get(2).getCardValue() +1 == cards.get(3).getCardValue() &&
                cards.get(3).getCardValue() +1 == cards.get(4).getCardValue())
            return true;
        else
            return false;
    }

    public static boolean isThreeOfAKind(Hand hand) {
        List<Card> cards = hand.getHand();
        if ((cards.get(0).getCardValue() == cards.get(1).getCardValue() &&
                cards.get(0).getCardValue() == cards.get(2).getCardValue() ||
                cards.get(1).getCardValue() == cards.get(2).getCardValue()) &&
                (cards.get(1).getCardValue() == cards.get(3).getCardValue() ||
                        cards.get(2).getCardValue() == cards.get(3).getCardValue() &&
                        cards.get(2).getCardValue() == cards.get(4).getCardValue()))
            return true;
        else
            return false;
    }

    public static boolean isTwoPair(Hand hand) {
        return true;
    }

    public static boolean isOnePair(Hand hand) {
        return true;
    }

    public static boolean isHighCard(Hand hand) {
        return true;
    }



}
