import java.util.ArrayList;

/**
 *  Creates an AI object, which extends the player class
 *
 *  @author reinapradhan
 *  @version May 25, 2021
 */
public class AI extends Player
{

    private Card move;


    /**
     * Create a new AI object.
     * @param hand of 5 cards
     * @param gameBoard
     */
    public AI(ArrayList<Card> hand, Card[][] gameBoard)
    {
        super(hand, gameBoard);
    }


    /**
     * {@inheritDoc}
     * returns board
     */
    public Card[][] getBoard()
    {
        return super.getBoard();
    }


    /**
     * AI randomly chooses a move from within its potential moves
     * (cards in hand)
     * @return
     */
    public Card chooseMove()
    {
        ArrayList<Card> hand = getHand();
        int choice = (int)(Math.random() * 5);
        move = hand.get(choice);

        return move;
    }

    /**
     * places card on the AI's game board
     * removes card from hand
     */
    public void playCard()
    {
       /*if (!move.isJack())
        {
            super.playCard(move, move.getRow(), move.getCol());
        }

        else
        {
            chooseMove();
        }*/

       super.playCard(move, move.getRow(), move.getCol());

    }

    /**
     * {@inheritDoc}
     * adds a card to the hand
     */
    public void  replaceCard(Card card)
    {
        super.replaceCard(card);
    }

}
