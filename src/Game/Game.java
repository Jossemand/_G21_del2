package Game;

import java.util.Scanner;

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
        System.out.println("Enter your name: ");
        player_1 = new Player( input.next());
        player_2 = new Player(input.next());
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
    
