public enum Value {
	ACE(1, "Ace"),
	DEUCE(2, "TWO"),
	THREE(3, "THREE"),
	FOUR(4, "FOUR"),
	FIVE(5, "FIVE"),
	SIX(6, "SIX"),
	SEVEN(7, "SEVEN"),
	EIGHT(8, "EIGHT"),
	NINE(9, "NINE"),
	TEN(10, "TEN"),
	JACK(10, "Jack"),
	QUEEN(10, "Queen"),
	KING(10, "King");

	// private firelds
	private final int value;
	private final String stringVal;

	// constructor
	private Value(int value, String stringVal){
		this.value = value;
		this.stringVal = stringVal;
	}

	// public methods
	public int getValue(){
		return value;
	}

	public String printValue(){
		return stringVal;
	}
}
