public class arrayChallenge
{
    //return true if any value atleast twice in array and retrun false if elements are distincts   
     public static boolean findDuplicate(int number[])
     {
        for(int i=0;i<number.length;i++)
        {
            for(int j=i+1;j<number.length;j++)
            {
                if(number[i]==number[j])
                {
                    return true;
                }
            }
        }
        return false;
     }
     //return max profit in stocks
     public static int Stock(int prices[])
     {
        int buyprice=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<prices.length;i++)
        {
            if(buyprice<prices[i])
            {
                int profit=prices[i]-buyprice;
                maxprofit=Math.max(profit,maxprofit);
            }
            else{
                buyprice=prices[i];
            }
        }
        return maxprofit;
     }
     //Linear Search Homework problem
     public static int LinearSearch(String menu[],String Dish)
     {
        for(int i=0;i<menu.length;i++)
        {
            if(Dish.equals(menu[i]))
            {
                return i;
            }
        }
        return -1;
     }
    public static void main(String arg[])
    {
        
       int number[]={1,2,3,4};
       System.out.println(findDuplicate(number));
       //int prices[]={7,6,5,4,3,2};
       //System.out.println(Stock(prices));
      /* String menu[]={"Dosa","Idli","Sambhar","Chola","Bhatura"};
       String Dish="Sambhar";
       int index=LinearSearch(menu,Dish);
       if(index==-1)
       {
        System.out.println("Dish not found");
       }else{
        System.out.println("Dish found at "+index);
       }*/

    }
}