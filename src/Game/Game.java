package Game;

public class Game {
    private Player player_1, player_2;

    private Account accountp1;
    private Account accountp2;

    public Game(){

        createDice();
        createAccount();
        createPlayer();

    }

    private void createPlayer() {

    }

    private void createAccount() {
        accountp1 = new Account();
        accountp2 = new Account();
    }

    private void createDice() {
    }
    
 
}
    
