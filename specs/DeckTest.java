import static org.junit.Assert.*;
import org.junit.*;

import blackjack.*;

public class DeckTest {

  Deck deck;
  Card card;

  @Before
  public void before() {
    deck = new Deck();
    card = new Card(ValueType.JACK, SuitType.CLUBS);
  }

  @Test 
  public void canGetDeckSize() {
    assertEquals(0, deck.getSize());
  }

  @Test
  public void canAddCardToDeck() {
    deck.addCard(card);
    deck.addCard(card);
    assertEquals(2, deck.getSize());
  }

}