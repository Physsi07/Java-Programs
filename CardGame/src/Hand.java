import java.util.ArrayList;

public class Hand {
	// private fields
	public ArrayList<Card> cards;


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
		/* Show cards and their totals points, but
		 * only show total points if they ALL
		 * cards are face up */
		String str = "";
		boolean allFaceUp = true;

		for(Card card : cards){
			str += card.toString() + "\n";
			if(!card.isFaceUp){
				allFaceUp = false;
			}
		}
		// if all are face up show total
		if(allFaceUp){
			str += " Total points = " + getTotal() + "\n";
		}
		return str;
	}

	// total points of a hand
	public int getTotal(){
		int totalPts = 0;
		boolean hasAce = false;

		// getting total points and then any aces
		for(int i = 0; i < cards.size(); i++){
			totalPts += cards.get(i).getValue();
			if(cards.get(i).printValue() == "Ace"){
				hasAce = true;
			}
			if(hasAce && totalPts <= 11){
				totalPts += 10;
			}
		}

		return totalPts;
	}

	public void flipCards(){
		for(Card c: cards){
			c.flipCard();
		}
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
