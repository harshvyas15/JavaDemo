class AbstractClasses
{
    public static void main(String arg[])
    {
        Mustang m=new Mustang();
        
        //Horse h=new Horse();
        //h.eat();
        //h.walk();
        //System.out.println(h.color);
        //Chicken c=new Chicken();
        //h.eat();
        //c.walk();

    }

}
abstract class Animal
{
    String color;
    Animal()
    {
        System.out.println("Animal constructor called");
    }
    //Animal()
    //{
        //color="Brown";
    //}
    void eat()
    {
        System.out.println("Eats");
    }
    abstract void walk();
}
class Horse extends Animal
{
    Horse()
    {
        System.out.println("Horse constructor called");
    }
    void changeColor()
    {
        color="Dark Brown";
    }
    void walk()
    {
        System.out.println("Walks with 4 legs");
    }

}
class Mustang extends Horse
{
    Mustang()
    {
        System.out.println("Mustang constructor called");
    }
}
class Chicken extends Animal{
     void changeColor()
    {
        color="Yellow";
    }
    void walk()
    {
        System.out.println("Walks with 2 legs");
    }
}