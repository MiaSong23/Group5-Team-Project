/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Modifiers, Ali Cemilcan Ciftarslan, Fansheng Meng, Andy Chour, Mia Song
 * Date, 2/23/2019
 */

package ca.sheridancollege.project;

public class Player extends Actor {
    //all players start with $300
    private int money=300;
    private int bet=0;
    private boolean fold;
    private String name;
    
    public Player(String name){
        this.name=name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    // returns false if the bet is an invalid bet (IE. less than $1 or greater than the $s the player has)
    public boolean bet(String givenBetString){
        try{
            int givenBetInt = Integer.parseInt(givenBetString);
            if(givenBetInt>this.money||givenBetInt<1){
                this.bet=0;
                return false;
            }else{
                this.bet=givenBetInt;
                this.money-=givenBetInt;
                return true;
            }
        }catch(Exception e){
            return false;
        }
    }
    
    public int getBet(){
        return bet;
    }
    
    public void setFold(boolean fold){
        this.fold=fold;
    }
    
    public boolean getFold(){
        return fold;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
}
