public class Game {
	public static void main(String[] args) {

		Card c1, c2;
		c1 = new Card(Value.ACE, Suit.HEARTS);
		c2 = new Card(Value.JACK, Suit.HEARTS);

		// flip cards
		c1.flipCard();
		c2.flipCard();

		// create a hand
		Hand Jose = new Hand();
		Hand Pedro = new Hand();

		Jose.addCard(c1);
		Jose.addCard(c2);

		System.out.printf(Jose.showHand());

//		Jose.giveCard(c1, Pedro);

		System.out.printf("Jose: " + Jose.showHand() +
				"Pedro: " + Pedro.showHand());
	}
}
