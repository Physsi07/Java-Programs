public class Game {
	public static void main(String[] args) {

		Deck deck = new Deck();
		deck.populate();
		deck.shuffle();

		// create our playing hand
		Hand player1, player2, player3, dealer;
		player1 = new Hand();
		player2 = new Hand();
		player3 = new Hand();
		dealer = new Hand();

		Hand[] hands = {player1, player2, player3};

		// Deal cards to our hands
		deck.deal(hands, 2);

		// Deal 2 cards to dealers
		deck.deal(dealer, 2);

		// Show the player's hands
		for(int i = 0; i < hands.length; i++){
			hands[i].flipCards();
			System.out.printf(hands[i].showHand() + "\n");
		}

		// Flip the dealer's first card
		dealer.cards.get(0).flipCard();

		// Show the dealer's cards
		System.out.printf("\nDealer's Cards: \n" + dealer.showHand());

	}
}
