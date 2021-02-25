/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Modifiers, Ali Cemilcan Ciftarslan, Fansheng Meng, Andy Chour, Mia Song
 * Date, 2/23/2019
 */
package ca.sheridancollege.project;

/**
 * A class to be used as the base Card class for the project. Must be general
 * enough to be instantiated for any Card game. Students wishing to add to the code 
 * should remember to add themselves as a modifier.
 * @author dancye, 2018
 */
public class Card {

    private int value;
    private Suit suit;
    private Rank rank;

    // initialize the value of the cards based on their rank
    public Card(Rank rank, Suit suit){
        this.rank=rank;
        this.suit=suit;
        switch (rank){
            case ACE:
                this.value=11;
                break;
            case TWO:
                this.value=2;
                break;
            case THREE:
                this.value=3;
                break;
            case FOUR:
                this.value=4;
                break;
            case FIVE:
                this.value=5;
                break;
            case SIX:
                this.value=6;
                break;
            case SEVEN:
                this.value=7;
                break;
            case EIGHT:
                this.value=8;
                break;
            case NINE:
                this.value=9;
                break;
            case TEN:
                this.value=10;
                break;
            case JACK:
                this.value=10;
                break;
            case QUEEN:
                this.value=10;
                break;
            case KING:
                this.value=10;
                break;
            default:
                break;
        }
    }
    
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }
    
    public String toString(){
        return rank+" of "+suit;
    }
}

}
