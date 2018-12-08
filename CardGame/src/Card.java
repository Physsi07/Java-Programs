public class Card {

	// private fields
	private Suit suit;
	private Value value;
	public boolean isFaceUp;

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

	// getting the value as a string of a card
	public String printValue(){
		return value.printValue();
	}

	// flipping the card
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
