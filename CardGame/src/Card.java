public class Card {

	// private fields
	private Suit suit;
	private Value value;
	private boolean isFaceUp;

	// constructor
	public Card(Value value, Suit suit){
		this.value = value;
		this.suit = suit;
		isFaceUp = false;
	}

	// public methods
	public String getSuit(){
		return suit.printSuit();
	}

	public int getValue(){
		return value.getValue();
	}

	public void flipCard(){
		isFaceUp = !isFaceUp;
	}

	public String toString(){
		String str = " ";
		if(isFaceUp){
			str += value.printValue()  + " of " + suit.printSuit();
		} else {
			str += "Card is Face Down";
		}

		return  str;
	}
}
