import java.util.ArrayList;

public class Hand {
	// private fields
	private ArrayList<Card> cards;


	// constructor
	public Hand(){
		cards = new ArrayList<Card>();
	}

	// clear our hand
	public void clearCard(){
		cards.clear();
	}

	// add a card to our hand
	public void addCard(Card card){
		cards.add(card);
	}

	// show hand
	public String showHand(){
		String str = "";

		for(Card card : cards){
			str += card.toString() + "\n";
		}
		return str;
	}

	// giving a card
	public boolean giveCard(Card card, Hand otherHand){
		if(!cards.contains(card))
			return false;

		cards.remove(card);
		otherHand.addCard(card);
		return true;
	}
}
