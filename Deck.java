package School;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class Deck {
    private List<Card> deck;

    public Deck() {
        deck = new ArrayList<>();
        loadDeck();
    }

    public List<Card> getDeck() {
        return deck;
    }

    // Load the stack with 52 cards in order
    public void loadDeck() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 2; j <= 14; j++) {
                deck.add(new Card(i, j));
            }
        }
    }

    // Reverse the order of the cards in the deck
    private void reverse() {
        Stack<Card> temp = new Stack<>();
        while (!deck.isEmpty()) {
            temp.push(deck.remove(deck.size() - 1));
        }
        while (!temp.isEmpty()) {
            deck.add(temp.pop());
        }
    }

    // Given a Stack of cards as an explicit parameter,
    // reverse the order of the cards in the deck
    private Stack<Card> reverse(Stack<Card> x) {
        Stack<Card> temp = new Stack<>();
        while (!x.isEmpty()) {
            temp.push(x.pop());
        }
        while (!temp.isEmpty()) {
            x.push(temp.pop());
        }
        return x;
    }

    // Combine two decks, one as the implicit 
    // parameter, the other as the explicit parameter
    public void combineDecks(Stack<Card> other) {
        while (!other.isEmpty()) {
            deck.add(other.pop());
        }
    }

    // Bridge shuffle the deck
    public void bridgeShuffle() {
        List<Card> firstHalf = new ArrayList<>(deck.subList(0, deck.size() / 2));
        List<Card> secondHalf = new ArrayList<>(deck.subList(deck.size() / 2, deck.size()));
        deck.clear();
        for (int i = 0; i < firstHalf.size(); i++) {
            deck.add(secondHalf.get(i));
            deck.add(firstHalf.get(i));
        }
    }

    // Complete shuffle the deck
    public void completeShuffle() {
        Collections.shuffle(deck);
    }

    @Override
    public String toString() {
        return formatDeck(deck);
    }

    public String formatDeck(List<Card> deck) {
        StringBuilder output = new StringBuilder();
        int count = 0;
        for (Card c : deck) {
            output.append(c).append("\t");
            count++;
            if (count % 4 == 0) {
                output.append("\n");
            }
        }
        if (count % 4 != 0) {
            output.append("\n");
        }
        return output.toString();
    }

    // Return and remove the top card
    public Card deal() {
        return deck.remove(deck.size() - 1);
    }

    // Split the deck at a random spot. Put the stack of cards above the random
    // spot below the other cards
    public void cut() {
        int cutPoint = (int) (Math.random() * deck.size());
        cutPoint = 21;
        List<Card> top = new ArrayList<>(deck.subList(0, cutPoint));
        List<Card> bottom = new ArrayList<>(deck.subList(cutPoint, deck.size()));
        deck.clear();
        deck.addAll(bottom);
        deck.addAll(top);
    }

    public static void main(String[] args) {
        // example method calls - you should make your own
        Deck a = new Deck();
        System.out.println();

        System.out.println();
        System.out.println(" -------------------------------");
        System.out.println("|    After Deck Construction    |");
        System.out.println(" -------------------------------");
        System.out.println();
        a.getDeck();
        System.out.println(a);

        System.out.println();
        System.out.println(" ---------------------");
        System.out.println("|     After 1 Cut     |");
        System.out.println(" ---------------------");
        System.out.println();
        a.cut();
        System.out.println(a);

        System.out.println();
        System.out.println(" ------------------------------");
        System.out.println("|    After 1 bridge shuffle    |");
        System.out.println(" ------------------------------");
        System.out.println();
        a.bridgeShuffle();
        System.out.println(a);

        System.out.println();
        System.out.println(" --------------------------------");
        System.out.println("|    After 1 Complete Shuffle    |");
        System.out.println(" --------------------------------");
        System.out.println();
        a.completeShuffle();
        System.out.println(a);

        for (int i = 1; i <= 5; i++)
            System.out.println(a.deal());
    }
}

