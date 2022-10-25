package Game;

import java.util.Scanner;

public class Game {
    private Player player_1, player_2;

    private Account accountp1;
    private Account accountp2;


    private Die die1,die2;
    private boolean isWinnerFound = false;

    private int turn = 1;

    private int sum;
    Scanner input = new Scanner(System.in);
    public Game(){

        createDice();
        createAccount();
        createPlayer();

        playGame();

    }

    private void playGame() {
        while(!isWinnerFound){
            if(turn==1) {
                System.out.println("Press enter for " + player_1.getName() + " to roll the dice");
                input.hasNextLine();
                die1.roll();
                die2.roll();
                sum= die1.getFaceValue()+die2.getFaceValue();
                System.out.println(player_1.getName() + " rolls a " + die1.getFaceValue() + " and a " + die2.getFaceValue() + " for a sum of " + sum);

                switch(sum) {
                    case 2:
                        accountp1.addToBalance(250);
                        System.out.println("Your balance is now " + accountp1.getBalance());
                        break;


                }








                turn=2;
            } else {
                System.out.println("Press enter for " + player_2.getName() + " to roll the dice");
                input.hasNextLine();
                die1.roll();
                die2.roll();
                sum= die1.getFaceValue()+die2.getFaceValue();
                System.out.println(player_2.getName() + " rolls a " + die1.getFaceValue() + " and a " + die2.getFaceValue() + " for a sum of " + sum);
                turn=1;
            }


        }
    }

    private void createPlayer() {
        System.out.println("Enter name of Player 1");
        player_1 = new Player(input.next());
        System.out.println("Player 1 name is "+player_1.getName());

        System.out.println("enter name of Player 2");
        player_2 = new Player(input.next());
        System.out.println("Player 2 name is "+player_2.getName());

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
    
