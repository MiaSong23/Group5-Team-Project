package ca.sheridancollege.project;


public abstract class Actor {
    private Hand myHand=new Hand();
    private int handsWon=0;
    private int handsLost=0;
    private int pushes=0;
    
    public void hit(Card myCard){
        myHand.addCard(myCard);
    }

    public Hand showHand() {
        return myHand;
    }
    
    public int handValue(){
        return myHand.handValue();
    }

    // creates a brand new hand; usually for starting a new round of a game
    public void clearHand(){
        this.myHand=new Hand();
    }

    public int getHandsWon() {
        return handsWon;
    }

    public void setHandsWon(int handsWon) {
        this.handsWon = handsWon;
    }

    public int getHandsLost() {
        return handsLost;
    }

    public void setHandsLost(int handsLost) {
        this.handsLost = handsLost;
    }

    public int getPushes() {
        return pushes;
    }

    public void setPushes(int pushes) {
        this.pushes = pushes;
    }

    public boolean getBusted(){
        return myHand.getBusted();
    }
   
}
