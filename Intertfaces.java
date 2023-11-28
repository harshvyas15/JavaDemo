class Intertfaces
{
    public static void main(String args[])
    {
        Queen q=new Queen();
        q.move();


    }
}
interface chessPlayer
{
    void move();
}
class Queen implements chessPlayer
{
    public void move()
    {
        System.out.println("UP,DOWN,LEFT,RIGHT,DIAGONAL(move in all direction)");
    }
}