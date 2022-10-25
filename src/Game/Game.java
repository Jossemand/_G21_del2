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

        player_1 = new Player();
        player_2 = new Player();
    }


    private void createAccount() {
    }

    private void createDice() {
    }
    
 
}
    
