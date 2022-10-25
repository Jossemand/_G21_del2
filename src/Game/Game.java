package Game;

public class Game {
    private Player player_1, player_2;

    private Account accountp1;
    private Account accountp2;


    private Die die1,die2;

    Scanner input = new Scanner(System.in);
    public Game(){

        createDice();
        createAccount();
        createPlayer();

    }

    private void createPlayer() {
        System.out.println("enter name of player 1");
        player_1 = new Player(input.next());
        System.out.println("Player 1 name is"+player_1.getName());

        System.out.println("enter name of player 2");
        player_2 = new Player(input.next());
        System.out.println("Player 2 name is"+player_2.getName());

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
    
