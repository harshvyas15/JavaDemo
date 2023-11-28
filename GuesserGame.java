import java.util.*;
class Guesser
{
    int num;
    public  int guessingNum() 
    { 

        Scanner sc=new Scanner(System.in);
        System.out.println("Guesser guess the number");
        int num=sc.nextInt();
        return num;
    }
    
}
class Player
{
    int pno;
    public  int guessingNum() 
    { 

        Scanner sc=new Scanner(System.in);
        System.out.println("Player guess the number");
        int pno=sc.nextInt();
        return pno;
    }
}
class Umpire
{
    int guesserNumber;
    int player1Number;
    int player2Number;
    int player3Number;
    public void collectNoGuesser()
    {
        Guesser g=new Guesser();
        guesserNumber=g.guessingNum();
    }
    public void collectNoPlayer() 
    {
        Player p1=new Player();
        Player p2=new Player();
        Player p3=new Player();
        player1Number=p1.guessingNum();
        player2Number=p2.guessingNum();
        player3Number=p3.guessingNum();
    }
   public void compare()
   {
    if(guesserNumber==player1Number)
    {
        if(guesserNumber==player2Number && guesserNumber==player3Number)
        {
            System.out.println("All three players won");
        }
        else if(guesserNumber==player2Number)
        {
            System.out.println("Player 1 And Player 2 won");
        }
        else if(guesserNumber==player3Number)
        {
            System.out.println("Player 1 And Player 3 won");
        }else
        {
            System.out.println("Player 1 won");
        }
    }
       
    
    else if(guesserNumber==player2Number)
    {
        if(guesserNumber==player3Number)
        {
            System.out.println("Player 2 And Player 3 won");
        }else{
            System.out.println("Player 3 won");
        }

    }
    else if(guesserNumber==player3Number)
    {
        System.out.println("Player 3 won");
    }
    else{
        System.out.println("Noone wins! Try next time");
    }
   }
}

public class GuesserGame
{
    public static void main(String arg[])
    {
        System.out.println("Hello! All ");
        Umpire u=new Umpire();
        u.collectNoGuesser();
        u.collectNoPlayer();
        u.compare();
    }
}
  