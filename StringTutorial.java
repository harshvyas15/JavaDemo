import java.util.*;
public class StringTutorial
{
    public static boolean isPalindrome(String str)
    {
        int n=str.length();
        for(int i=0;i<str.length()/2;i++)
        {
            if(str.charAt(i)!=str.charAt(n-i-1))
            {
                //Not a palindrome
                return false;
            }
        }
        return true;
    }
    public static float getShortestPath(String path)
    {
        int x=0,y=0;
        for(int i=0;i<path.length();i++)
        {
            char dir=path.charAt(i);
            if(dir=='N')
            {
                y++;
            }
            else if(dir=='E')
            {
                x++;

            }
            else if(dir=='S')
            {
                y--;
            }else{
                x--;
            }
           
            
        }
         int X2=x*x;
         int Y2=y*y;
        return (float)Math.sqrt(X2+Y2);
        }
        public static String subString(String str,int si,int ei)
         {
            String substr="";
            for(int i=si;i<ei;i++)
            {
                substr+=str.charAt(i);
            }
            return substr;
        }
        public static String toUpperCase(String str)
        {
            StringBuilder sb=new StringBuilder("");
            char ch=Character.toUpperCase(str.charAt(0));
            sb.append(ch);
            for(int i=1;i<str.length();i++)
            {
                if(str.charAt(i)==' ' && i<str.length()-1)
                {
                    sb.append(str.charAt(i));
                    i++;
                    sb.append(Character.toUpperCase(str.charAt(i)));

                }else{
                    sb.append(str.charAt(i));
                }
            }
             return sb.toString();
        }
        public static String compression(String str)
        {
            String nstr="";
            for(int i=0;i<str.length();i++)
            {
                Integer count=1;
                while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1))
                {
                    count++;
                    i++;
                }
                nstr+=str.charAt(i);
                if(count>1)
                {
                    nstr+=count.toString();
                }
            }
            return nstr;
        }
    public static void main(String args[])
    {
        //String str="noon";
        //System.out.println(isPalindrome(str));
        //String path="WNEENESENNN";
        //System.out.print(getShortestPath(path));
        /*String fruit[]={"Apple","Mango","Banana"};
        String Largest=fruit[0];
        for(int i=1;i<fruit.length;i++)
        {
            if(Largest.compareTo(fruit[i])<0)
            {
                Largest=fruit[i];
            }
        }
        System.out.println(Largest);*/
        //String str="Helloworld";
        //System.out.println(subString(str,0,5)); 
        //String str="my name is Harsh vyas ";
        //System.out.println(toUpperCase(str));
        String str="aaaabbbcdd";
        System.out.println(compression(str));
    }
}