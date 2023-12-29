// Player Class.
import java.util.Random;

public class Player extends Thread
{
  private Random random = new Random();
  private int value;
  private int roundCounter=1;
  private int id;
////////////////////////////////////////////////////////////////////////////////
  public Player(int id)
  {
    this.id = id;
  }
////////////////////////////////////////////////////////////////////////////////
  public synchronized void run()
  {
    while(true)
    {
      try
      {
        wait();
      }
      catch(InterruptedException e)
      {
        e.printStackTrace();
      }

      value = random.nextInt(3);
      notify();
    }
  }
////////////////////////////////////////////////////////////////////////////////
  public synchronized Choice getChoice() throws InterruptedException
  {
    notify();
    Choice choice = Choice.values()[value];
    if(roundCounter <= 1000)
    {
      System.out.println("Round "+ roundCounter +": Player "+id + " selects " + choice);
    }
    roundCounter++;
    return choice;
  }
////////////////////////////////////////////////////////////////////////////////
  public synchronized void win() throws InterruptedException
  {
    notify();
    int round= roundCounter-1;
    System.out.println("Round " + round + ": Player " + id + " wins!");
  }

  public synchronized void lose() throws InterruptedException
  {
    notify();
    int round= roundCounter-1;
    System.out.println("Round " + round + ": Player " + id + " loses");
  }
}
