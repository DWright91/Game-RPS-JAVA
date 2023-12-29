// RockPaperScissors Driver Class.
public class RockPaperScissors
{
  static int drawCount = 0;
  static int scissorsCount=0;
  static int rockCount=0;
  static int paperCount=0;

  public static void main(String[] args) throws InterruptedException
  {
    System.out.println("Rock-Scissors-Paper Game Start! ");

    int rounds = 1000;
    Player player1 = new Player(1);
    Player player2 = new Player(2);

    player1.start();
    player2.start();

    Choice choice1;
    Choice choice2;

    choice1 = player1.getChoice();
    choice2 = player2.getChoice();

    for(int i = 1; i <= rounds; i++)
    {
      if(choice1 == choice2)
      {
        drawCount++;
        System.out.println("Round " + i + ": Player 1:" + " Draw");
        choice1 = player1.getChoice();
        System.out.println("Round " + i + ": Player 2:" + " Draw");
        choice2 = player2.getChoice();
      }
      else if(choice1 == Choice.ROCK)
      {
        if(choice2 == Choice.PAPER)
        {
          paperCount++;
          player2.win();
          choice2 = player2.getChoice();
          player1.lose();
          choice1 = player1.getChoice();
        }
        else
        {
          rockCount++;
          player1.win();
          choice1 = player1.getChoice();
          player2.lose();
          choice2 = player2.getChoice();
        }
      }
      else if(choice1 == Choice.PAPER)
      {
        if(choice2 == Choice.SCISSORS)
        {
          scissorsCount++;
          player2.win();
          choice2 = player2.getChoice();
          player1.lose();
          choice1 = player1.getChoice();
        }
        else
        {
          paperCount++;
          player1.win();
          choice1 = player1.getChoice();
          player2.lose();
          choice2 = player2.getChoice();
        }
      }
      else if(choice1 == Choice.SCISSORS)
      {
        if(choice2 == Choice.ROCK)
        {
          rockCount++;
          player2.win();
          choice2 = player2.getChoice();
          player1.lose();
          choice1 = player1.getChoice();
        }
        else
        {
          scissorsCount++;
          player1.win();
          choice1 = player1.getChoice();
          player2.lose();
          choice2 = player2.getChoice();
        }
      }
    }
    System.out.println("Summary Statistics: ");
    System.out.println("Number of draws:  "+drawCount);
    System.out.println("Number of times scissors won:  "+scissorsCount);
    System.out.println("Number of times rock won:  "+rockCount);
    System.out.println("Number of times paper won:  "+paperCount);
  }
}
