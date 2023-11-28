import java.util.*;
public class OOPS
{
    public static void main(String args[])
    {
        /*Pen p1=new Pen();
        p1.setColor("Red");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());*/
       // Student s1=new Student("Harsh");
        //System.out.println(s1.name);
        /*try
        {
         Student s1=new Student();
         s1.name="Harsh";
         s1.rollno=1234;
         s1.password="xyz";
         s1.marks[0]=100;
         s1.marks[1]=90;
         s1.marks[2]=80;
         Student s2=new Student(s1);
         s2.password="abc";
         s1.marks[2]=100;
         for(int i=0;i<3;i++)
         {
            System.out.println(s2.marks[i]);
         }
        }catch(Exception e)
        {
            System.out.println(e);
        }*/
        //Fish Shark=new Fish();
        //Shark.eat();
        //Shark.swim();
        Dog dooby=new Dog();
        dooby.eat();
        dooby.legs=4;
        System.out.println(dooby.legs);
        

       
    }
}
class Animal
{
    String color;
    void eat()
    {
        System.out.println("Eats");
    }
    void breathe()
    {
        System.out.println("Breathes");
    }
}
class Mammal extends Animal{
    int legs;
}
class Dog extends Mammal
{
    String breed;
}
/*class Fish extends Animal{
    int fins;
    void swim()
    {
        System.out.println("swim in water");
    }
}*/
/*class Student
{
    String name;
    int rollno;
    String password;
    int marks[]= new int[3];
    /*Student(Student s1) // Shallow Copy Constructor
    {
        
        this.name=s1.name;
        this.rollno=s1.rollno;
        this.marks=s1.marks;
       
    }*/
/*    Student(Student s1) // Deep Copy Constructor
    {
        this.name=s1.name;
        this.rollno=s1.rollno;
        for(int i=0;i<marks.length;i++)
        {
            this.marks[i]=s1.marks[i];

        }
    }
    Student()
    {
        System.out.println("constructor is called...");
    }
}*/
/*class Pen
{
    private String color;
    private int tip;
    String getColor()
    {
        return this.color;
    }
    void setColor(String newColor)
    {
        color=newColor;
    }
    int getTip()
    {
        return this.tip;
    }
     void setTip(int tip)
    {
        this.tip=tip;
    }
}*/
