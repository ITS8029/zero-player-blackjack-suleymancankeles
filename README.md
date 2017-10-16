# Week 2 Homework: Zero-Player Blackjack

A simple zero-player game, similar to blackjack but a little simpler

The object of the game is to get as close to 21 as possible without going over.

- Aces are always worth 1 (never 11!!)
- Face cards (Jack, Queen, King) are all worth 10
- All other cards are worth the number of their value

This game will deal the player cards from a shuffled Deck. Every time the player is dealt a card, print out the name of the card.

Unlike regular blackjack, the player doesn't have a choice whether to Hit or Stand. If the player's total is under 17, they should always get another card.

- If the total goes over 21, the player “busts” and loses the game. Print out "You lose!"
- If the total is 17, 18, 19, or 20, the player wins. Print out "You win!"
- If the total is exactly 21, the player has a blackjack. Print out "Blackjack!"

## Implementation notes:

A class called ZeroPlayerBlackjack.java is included, and you can put your code in the main method of that class.

Use the provided Deck.java and Card.java classes to deal the player cards.

To instantiate a Deck, use:

```java
Deck myDeck = new Deck();
```

When you create a new instance of a Deck it will hold 52 Cards in a random order. To get the next Card, call the Deck's drawCard() method:

```java
Card myCard = myDeck.drawCard();
```

You can get the card’s value by using the Card class’s .getValue() method:

```java
int cardValue = myCard.getValue();
```

To get a String with the name of the Card (for example, King of Clubs), use the Card's toString() method:

```java
String cardName = myCard.toString();
```

The Deck and Card classes are provided in Deck.java and Card.java, and you can look at how they're implemented if you're interested; however, you shouldn't need to know the details of how they are implemented to do this assignment, except what's discussed above.

## Sample Output:

### Player wins:

```
Welcome to the casino!
You got a 7 of Clubs
Your total is 7
You got a Jack of Hearts
Your total is 17
You win!
```

### Player gets Blackjack: 

```
Welcome to the casino!
You got a 4 of Diamonds
Your total is 4
You got a 7 of Hearts
Your total is 11
You got a Queen of Clubs
Your total is 21
Blackjack!
```

### Player loses:

```
Welcome to the casino!
You got a 3 of Hearts
Your total is 3
You got a 7 of Spades
Your total is 10
You got an Ace of Clubs
Your total is 11
You got a 4 of Diamonds
Your total is 15
You got a King of Hearts
Your total is 25
You lose!
```

## Hints:

- Focus on the player’s total, not the cards themselves: you should be able to ignore a card after you add its value to the player’s total and print its name
- Use a `while` loop to keep dealing the player cards until the total is over 17
