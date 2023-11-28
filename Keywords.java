class Keywords
{
    public static void main(String arg[])
    {
        /*Student s1=new Student();
        s1.schoolName="ABC";
        Student s2=new Student();
         s2.schoolName="XYZ";
        System.out.println(s1.schoolName);*/
        Horse h=new Horse();
        System.out.println(h.color);

    }
}
class Animal
{
    String color;
    Animal(){
      System.out.println("Animal constructor is called");
    }
}
class Horse extends Animal{
    Horse(){
         super.color="brown";
         System.out.println("Horse constructor is called");

    }
    

    
   
}

class Student
{
    static  int returnPercentage(int phy,int chem,int math)
    {
        return (phy+chem+math)/3;
    }
    String name;
    int rollno;
    static String schoolName;
    void setName(String name)
    {
        this.name=name;
    }
    String getName()
    {
        return this.name;
    }
}