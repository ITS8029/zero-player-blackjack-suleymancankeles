

public class ZeroPlayerBlackjack {

	public static void main(String[] args) {
	
		Deck deck = new Deck();
		
		int total = 0;
		
		while(total < 17) {
		Card card = deck.drawCard();
		
		System.out.println("Your card is " + card.toString());
		
		total += card.getValue();
	}
	
	System.out.println("Your total is " + total);
	
	if(total == 21) {
		System.out.println("Blackjack!");
	} else if (total < 21) {
	System.out.println("You win!");
	} else {
		System.out.println("You lose!");
	}
	
}}	
