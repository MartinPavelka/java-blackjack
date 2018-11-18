package cards;
import java.util.*;

public class Deck {
	List<Card> cards = new ArrayList<>();
	private String[] names = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
	private int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11};
	
	public Deck() {
		initDeck();
	}
	
	public void initDeck() {
		for (int x=0; x<4; x++) {
			for (int y=0; y<13; y++) {
				cards.add(new Card(names[y],values[y]));
			}
		}
		Collections.shuffle(cards);
	}
	
//	get collection of Cards
	public Collection<Card> getCards() {
		return cards;
	}
	
	public void addCard(Card card) {
		cards.add(card);
	}
	
	public Card drawCard(String name, int value) {
		Card card = new Card(name, value);
		return card;
	}
	
	public String getCard() {
		return cards.get(0).getName();
	}
	
	public boolean isEmpty() {
		if (cards.size() == 0) return true;
		return false;
	}
}
