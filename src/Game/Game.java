package Game;

public class Game {
    private Player player_1, player_2;

    private Account accountp1;
    private Account accountp2;


    private Die die1,die2;


    public Game(){

        createDice();
        createAccount();
        createPlayer();

    }

    private void createPlayer() {

        player_1 = new Player();
        System.out.println("Player 1 name is");
        player_2 = new Player();
    }


    private void createAccount() {
        accountp1 = new Account();
        accountp2 = new Account();
    }

    private void createDice() {
        die1 = new Die();
        die2 = new Die();


    }
    
 
}
    
