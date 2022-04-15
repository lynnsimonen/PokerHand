package edu.wctc.test;
import edu.wctc.*;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;


public class TheTest {
    @Test
    public void testCard(){
        Card card = new Card(Faces.ACE, Suits.CLUBS);
        assertEquals("The Card has the wrong Value!!!",14, card.getCardValue());
    }

    @Test
    public  void testDeck() {
        Deck deck = new Deck();
        assertEquals("The deck is the wrong size!!!", 52, deck.getSize());
    }

    @Test
    public void testIsRoyalFlush(){
        List<Card> hand = new ArrayList<>();
        hand.add(new Card(Faces.TEN, Suits.CLUBS));
        hand.add(new Card(Faces.JACK, Suits.CLUBS));
        hand.add(new Card(Faces.QUEEN, Suits.CLUBS));
        hand.add(new Card(Faces.KING, Suits.CLUBS));
        hand.add(new Card(Faces.ACE, Suits.CLUBS));
        Hand theHand = new Hand(hand);
        assertTrue(CheckHand.isRoyalFlush(theHand));
    }

    @Test
    public void testIsNotRoyalFlush(){
        List<Card> hand = new ArrayList<>();
        hand.add(new Card(Faces.SEVEN, Suits.CLUBS));
        hand.add(new Card(Faces.JACK, Suits.CLUBS));
        hand.add(new Card(Faces.QUEEN, Suits.CLUBS));
        hand.add(new Card(Faces.KING, Suits.CLUBS));
        hand.add(new Card(Faces.ACE, Suits.CLUBS));
        Hand theHand = new Hand(hand);
        assertTrue(!CheckHand.isRoyalFlush(theHand));
        //assertFalse(CheckHand.isRoyalFlush(theHand));
    }

    @Test
    public void testIsStraightFlush(){
        List<Card> hand = new ArrayList<>();
        hand.add(new Card(Faces.SIX, Suits.HEARTS));
        hand.add(new Card(Faces.FIVE, Suits.HEARTS));
        hand.add(new Card(Faces.SEVEN, Suits.HEARTS));
        hand.add(new Card(Faces.EIGHT, Suits.HEARTS));
        hand.add(new Card(Faces.NINE, Suits.HEARTS));
        Hand theHand = new Hand(hand);
        assertTrue(CheckHand.isStraight(theHand));
    }

    @Test
    public void testIsFourOfAKind() {
        List<Card> hand = new ArrayList<>();
        hand.add(new Card(Faces.TEN, Suits.CLUBS));
        hand.add(new Card(Faces.TEN, Suits.HEARTS));
        hand.add(new Card(Faces.TEN, Suits.SPADES));
        hand.add(new Card(Faces.TEN, Suits.DIAMONDS));
        hand.add(new Card(Faces.ACE, Suits.CLUBS));
        Hand theHand = new Hand(hand);
        assertTrue(CheckHand.isFourOfAKind(theHand));
        hand = new ArrayList<>();
        hand.add(new Card(Faces.ACE, Suits.CLUBS));
        hand.add(new Card(Faces.TEN, Suits.HEARTS));
        hand.add(new Card(Faces.TEN, Suits.SPADES));
        hand.add(new Card(Faces.TEN, Suits.DIAMONDS));
        hand.add(new Card(Faces.THREE, Suits.CLUBS));
        theHand = new Hand(hand);
        assertFalse(CheckHand.isFourOfAKind(theHand));
        //assertFalse(CheckHand.isFullHouse(theHand));
    }

    @Test
    public void testIsFullHouse() {
        List<Card> hand = new ArrayList<>();
        hand.add(new Card(Faces.TEN, Suits.CLUBS));
        hand.add(new Card(Faces.TEN, Suits.HEARTS));
        hand.add(new Card(Faces.TEN, Suits.SPADES));
        hand.add(new Card(Faces.NINE, Suits.DIAMONDS));
        hand.add(new Card(Faces.NINE, Suits.CLUBS));
        Hand theHand = new Hand(hand);
        assertTrue(CheckHand.isFullHouse(theHand));
    }

    @Test
    public void testIsFlush(){
        List<Card> hand = new ArrayList<>();
        hand.add(new Card(Faces.FOUR, Suits.CLUBS));
        hand.add(new Card(Faces.TWO, Suits.CLUBS));
        hand.add(new Card(Faces.SIX, Suits.CLUBS));
        hand.add(new Card(Faces.ACE, Suits.CLUBS));
        hand.add(new Card(Faces.EIGHT, Suits.CLUBS));
        Hand theHand = new Hand(hand);
        assertTrue(CheckHand.isFlush(theHand));
    }

    @Test
    public void testIsStraight(){
        List<Card> hand = new ArrayList<>();
        hand.add(new Card(Faces.SIX, Suits.CLUBS));
        hand.add(new Card(Faces.FIVE, Suits.HEARTS));
        hand.add(new Card(Faces.SEVEN, Suits.SPADES));
        hand.add(new Card(Faces.EIGHT, Suits.DIAMONDS));
        hand.add(new Card(Faces.NINE, Suits.CLUBS));
        Hand theHand = new Hand(hand);
        assertTrue(CheckHand.isStraight(theHand));
    }

    @Test
    public void testIsThreeOfAKind() {
        List<Card> hand = new ArrayList<>();
        hand.add(new Card(Faces.TEN, Suits.CLUBS));
        hand.add(new Card(Faces.TEN, Suits.HEARTS));
        hand.add(new Card(Faces.TEN, Suits.SPADES));
        hand.add(new Card(Faces.SEVEN, Suits.DIAMONDS));
        hand.add(new Card(Faces.ACE, Suits.CLUBS));
        Hand theHand = new Hand(hand);
        assertTrue(CheckHand.isThreeOfAKind(theHand));
        hand = new ArrayList<>();
        hand.add(new Card(Faces.TEN, Suits.CLUBS));
        hand.add(new Card(Faces.TEN, Suits.HEARTS));
        hand.add(new Card(Faces.TWO, Suits.SPADES));
        hand.add(new Card(Faces.SEVEN, Suits.DIAMONDS));
        hand.add(new Card(Faces.ACE, Suits.CLUBS));
        theHand = new Hand(hand);
        assertFalse(CheckHand.isThreeOfAKind(theHand));
    }

    @Test
    public void testIsTwoPair() {
        List<Card> hand = new ArrayList<>();
        hand.add(new Card(Faces.TEN, Suits.CLUBS));
        hand.add(new Card(Faces.TEN, Suits.HEARTS));
        hand.add(new Card(Faces.SEVEN, Suits.SPADES));
        hand.add(new Card(Faces.SEVEN, Suits.DIAMONDS));
        hand.add(new Card(Faces.ACE, Suits.CLUBS));
        Hand theHand = new Hand(hand);
        assertTrue(CheckHand.isTwoPair(theHand));
    }

    @Test
    public void testIsOnePair() {
        List<Card> hand = new ArrayList<>();
        hand.add(new Card(Faces.TEN, Suits.CLUBS));
        hand.add(new Card(Faces.NINE, Suits.HEARTS));
        hand.add(new Card(Faces.SEVEN, Suits.SPADES));
        hand.add(new Card(Faces.SEVEN, Suits.DIAMONDS));
        hand.add(new Card(Faces.ACE, Suits.CLUBS));
        Hand theHand = new Hand(hand);
        assertTrue(CheckHand.isOnePair(theHand));
    }

    @Test
    public void testIsHighCard() {
        List<Card> hand = new ArrayList<>();
        hand.add(new Card(Faces.TEN, Suits.CLUBS));
        hand.add(new Card(Faces.NINE, Suits.HEARTS));
        hand.add(new Card(Faces.QUEEN, Suits.SPADES));
        hand.add(new Card(Faces.SEVEN, Suits.DIAMONDS));
        hand.add(new Card(Faces.ACE, Suits.CLUBS));
        Hand theHand = new Hand(hand);
        assertTrue(CheckHand.isHighCard(theHand));
    }

    // go to CheckHand.java to write code
}
