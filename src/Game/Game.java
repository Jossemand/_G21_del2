package Game;

import java.util.Scanner;

public class Game {
    private Player player_1, player_2;

    private Account accountP_1;
    private Account accountP_2;


    private Die die1,die2;
    private boolean winnerIsFound = false;

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
        while(!winnerIsFound) {
            if (turn == 1) {
                System.out.println("Press enter for " + player_1.getName() + " to throw the dice");
                input.nextLine();
                die1.roll();
                die2.roll();
                sum = die1.getFaceValue() + die2.getFaceValue();
                System.out.println(player_1.getName() + " rolls a " + die1.getFaceValue() + " and a "  + die2.getFaceValue() + " for a sum of " + sum);
                switch (sum) {
                    case 2:
                        System.out.println(player_1.getName() + " lands on tower, your balance is increased by 250!");
                        accountP_1.addToBalance(250);
                        System.out.println(player_1.getName() + "'s balanace is now " + accountP_1.getBalance());
                        turn = 2;
                        break;
                    case 3:
                        System.out.println(player_1.getName() + " lands on crater, your balance is decreased by 100!");
                        accountP_1.subtractFromBalance(100);
                        System.out.println(player_1.getName() + "'s balanace is now " + accountP_1.getBalance());
                        turn = 2;
                        break;
                    case 4:
                        System.out.println(player_1.getName() + " lands on palace gates, your balance is increased by 100!");
                        accountP_1.addToBalance(100);
                        System.out.println(player_1.getName() + "'s balanace is now " + accountP_1.getBalance());
                        turn = 2;
                        break;
                    case 5:
                        System.out.println(player_1.getName() + " lands on cold desert, your balance is decreased by 20");
                        accountP_1.subtractFromBalance(20);
                        System.out.println(player_1.getName() + "'s balanace is now " + accountP_1.getBalance());
                        turn = 2;
                        break;
                    case 6:
                        System.out.println(player_1.getName() + " lands on walled city, your balance is increased by 180");
                        accountP_1.addToBalance(180);
                        System.out.println(player_1.getName() + "'s balanace is now " + accountP_1.getBalance());
                        turn = 2;
                        break;
                    case 7:
                        System.out.println(player_1.getName() + " lands on monastery, your balance is unchanged");
                        System.out.println(player_1.getName() + "'s balanace is now " + accountP_1.getBalance());
                        turn = 2;
                        break;
                    case 8:
                        System.out.println(player_1.getName() + " lands on black cave, your balance is decreased by 70");
                        accountP_1.subtractFromBalance(70);
                        System.out.println(player_1.getName() + "'s balanace is now " + accountP_1.getBalance());
                        turn = 2;
                        break;
                    case 9:
                        System.out.println(player_1.getName() + " lands on huts in the mountain, your balance is increased by 60");
                        accountP_1.addToBalance(60);
                        System.out.println(player_1.getName() + "'s balanace is now " + accountP_1.getBalance());
                        turn = 2;
                        break;
                    case 10:
                        System.out.println(player_1.getName() + " lands on the Werewall, your balance is decreased by 80, but you get an extra turn");
                        accountP_1.subtractFromBalance(80);
                        System.out.println(player_1.getName() + "'s balanace is now " + accountP_1.getBalance());
                        turn = 1;
                        break;
                    case 11:
                        System.out.println(player_1.getName() + " lands on the pit, your balance is decreased by 50");
                        accountP_1.subtractFromBalance(50);
                        System.out.println(player_1.getName() + "'s balanace is now " + accountP_1.getBalance());
                        turn = 2;
                        break;
                    case 12:
                        System.out.println(player_1.getName() + " lands on gold mine, your balance is increased by 650");
                        accountP_1.addToBalance(650);
                        System.out.println(player_1.getName() + "'s balanace is now " + accountP_1.getBalance());
                        turn = 2;
                    default:
                        break;
                }
                if(accountP_1.getBalance() >= 3000)
                    winnerIsFound = true;
            }
            else {
                System.out.println("Press enter for " + player_2.getName() + " to throw the dice");
                input.nextLine();
                if (turn == 2) {
                    die1.roll();
                    die2.roll();
                    sum = die1.getFaceValue() + die2.getFaceValue();
                    System.out.println(player_2.getName() + " rolls a " + die1.getFaceValue() + " and a "  + die2.getFaceValue() + " for a sum of " + sum);
                    switch (sum) {
                        case 2:
                            System.out.println(player_2.getName() + " lands on tower, your balance is increased by 250!");
                            accountP_2.addToBalance(250);
                            System.out.println(player_2.getName() + "'s balance is now " + accountP_2.getBalance());
                            turn = 1;
                            break;
                        case 3:
                            System.out.println(player_2.getName() + " lands on crater, your balance is decreased by 100!");
                            accountP_2.subtractFromBalance(100);
                            System.out.println(player_2.getName() + "'s balance is now " + accountP_2.getBalance());
                            turn = 1;
                            break;
                        case 4:
                            System.out.println(player_2.getName() + " lands on palace gates, your balance is increased by 100!");
                            accountP_2.addToBalance(100);
                            System.out.println(player_2.getName() + "'s balance is now " + accountP_2.getBalance());
                            turn = 1;
                            break;
                        case 5:
                            System.out.println(player_2.getName() + " lands on cold desert, your balance is decreased by 20");
                            accountP_2.subtractFromBalance(20);
                            System.out.println(player_2.getName() + "'s balance is now " + accountP_2.getBalance());
                            turn = 1;
                            break;
                        case 6:
                            System.out.println(player_2.getName() + " lands on walled city, your balance is increased by 180");
                            accountP_2.addToBalance(180);
                            System.out.println(player_2.getName() + "'s balance is now " + accountP_2.getBalance());
                            turn = 1;
                            break;
                        case 7:
                            System.out.println(player_2.getName() + " lands on monastery, your balance is unchanged");
                            System.out.println(player_2.getName() + "'s balance is now " + accountP_2.getBalance());
                            turn = 1;
                            break;
                        case 8:
                            System.out.println(player_2.getName() + " lands on black cave, your balance is decreased by 70");
                            accountP_2.subtractFromBalance(70);
                            System.out.println(player_2.getName() + "'s balance is now " + accountP_2.getBalance());
                            turn = 1;
                            break;
                        case 9:
                            System.out.println(player_2.getName() + " lands on huts in the mountain, your balance is increased by 60");
                            accountP_2.addToBalance(60);
                            System.out.println(player_2.getName() + "'s balance is now " + accountP_2.getBalance());
                            turn = 1;
                            break;
                        case 10:
                            System.out.println(player_2.getName() + " lands on the Werewall, your balance is decreased by 80, but you get an extra turn");
                            accountP_2.subtractFromBalance(80);
                            System.out.println(player_2.getName() + "'s balance is now " + accountP_2.getBalance());
                            turn = 2;
                            break;
                        case 11:
                            System.out.println(player_1.getName() + " lands on the pit, your balance is decreased by 50");
                            accountP_2.subtractFromBalance(50);
                            System.out.println(player_2.getName() + "'s balance is now " + accountP_2.getBalance());
                            turn = 1;
                            break;
                        case 12:
                            System.out.println(player_1.getName() + " lands on gold mine, your balance is increased by 650");
                            accountP_2.addToBalance(650);
                            System.out.println(player_2.getName() + "'s balance is now " + accountP_2.getBalance());
                            turn = 1;
                        default:
                            break;
                    }
                    if(accountP_2.getBalance() >= 3000)
                        winnerIsFound = true;
                }
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
        accountP_1 = new Account();
        accountP_2 = new Account();
    }

    private void createDice() {
        die1 = new Die();
        die2 = new Die();


    }
    
 
}
    
