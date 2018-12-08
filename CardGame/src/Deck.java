import java.util.Random;

public class Deck extends Hand {

	Random randNumer = new Random();

	public void populate(){
		for (Suit suit: Suit.values()){
			for (Value value: Value.values()){
				Card card = new Card(value, suit);
				cards.add(card);
			}
		}
	}

	public void shuffle(){
		for (int i = cards.size() - 1; i > 0; i--){
			// swap a random card b/t the beginning and the last card of the loop
			int pick = randNumer.nextInt(i);
			Card randCard = cards.get(pick);
			Card lastCard = cards.get(i);
			cards.set(i, randCard);
			cards.set(pick, lastCard);
		}
	}

	// Deal to all hands available
	public void deal(Hand[] hands, int perHand){
		for(int i = 0; i < perHand; i++){
			for(int j = 0; j < hands.length; j++){
				this.giveCard(cards.get(0), hands[j]);
			}
		}
	}

	// Deal to a single hand
	public void deal(Hand hand, int perHand){
		for(int i = 0; i < perHand; i++){
			this.giveCard(cards.get(0), hand);
		}
	}

	public void flipCard(Card c){
		c.flipCard();
	}
}
