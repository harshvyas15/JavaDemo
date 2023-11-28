import java.util.*;
public class ArrayCC
{
    //Update array and pass it as argument
    public static void update(int marks[])
    {
        for(int i=0;i<marks.length;i++)
        {
            marks[i]=marks[i]+1;
        }
    }
    //LinearSearch
    public static int LinearSearch(int number[],int key)
    {
        for(int i=0;i<number.length;i++)
        {
            if(number[i]==key)
            {
               return i;  
            }
        }
        return -1;
    }
    //get larsgest and smallest number
    public static int getLargest(int number[])
    {
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;

        for(int i=0;i<number.length;i++)
        {
            if(largest<number[i])
            {
                largest=number[i];
            }
            if(smallest>number[i])
            {
                smallest=number[i];

            }

        }
        System.out.println("Smallest number is: "+smallest);
        return largest;
    }
    //BinarySearch
    public static int BinarySearch(int number[],int key)
    {
        int start=0,end=number.length-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(number[mid]==key)
            {
                return mid;
            }
            if(number[mid]<key)
            {
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
    //Reverse array
    public static void ReverseArray(int number[])
    {
        int first=0,last=number.length-1;
        while(first<last)
        {
            int temp=number[first];
            number[first]=number[last];
            number[last]=temp;
            first++;
            last--;
        }
    }
    //Pairs in an array
    public static void PairsArray(int number[])
    {
        int tp=0;
        for(int i=0;i<number.length;i++)
        {
            int curr=number[i];
            for(int j=i+1;j<number.length;j++)
            {
                System.out.print("("+ curr +","+ number[j] +") ");
                tp++;
            }
            System.out.println();

        }
        System.out.println("Total Pairs = "+tp);
    }
    //Print Subarrays
    public static void printSubarray(int number[])
    {
        int ts=0;
        for(int i=0;i<number.length;i++)
        {
            
            int start=i;
            for(int j=i;j<number.length;j++)
            {
                int end=j;
                for(int k=start;k<=end;k++)
                {
                     System.out.print(number[k]+" ");
                }
                ts++;
                System.out.println();

            }
            System.out.println();

        }
        System.out.println("Total Subarrays = "+ts);
    }
    //MaxSubarray
    public static void MaxSubarraySum(int number[])
    {
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<number.length;i++)
        {
            int start=i;
            
            for(int j=i;j<number.length;j++)
            {
                int end=j;
                currsum=0;
                for(int k=start;k<=end;k++)
                {
                    currsum+=number[k];
                
                }
                System.out.println(currsum);
                if(maxsum<currsum)
                {
                    maxsum=currsum;
                }
            }
            
        }
        System.out.println("Max Sum of Subarrays "+maxsum);

    }
    //MaxSubarray sum (prefix approach)
    public static void MaxSubarraySumII(int number[])
    {
        int maxsum=Integer.MIN_VALUE;
        int prefix[]=new int[number.length];
        int currsum=0;
        prefix[0]=number[0];
        for(int i=1;i<prefix.length;i++)
        {
            prefix[i]=prefix[i-1]+number[i];
        }

        for(int i=0;i<number.length;i++)
        {
            int start=i;
            for(int j=i;j<number.length;j++)
            {
                int end=j;
              currsum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
           
                
                if(maxsum<currsum)
                {
                    maxsum=currsum;
                }
            }
        }
        System.out.println("Max sum = "+maxsum);
    }
    //MaxSubarray sum(Kadane approach)
    public static void MaxSubarrayIII(int number[])
    {
        int ms=Integer.MIN_VALUE;
        int cs=0;
        for(int i=0;i<number.length;i++)
        {
            cs=cs+number[i];
            if(cs<0)
            {
                cs=0;
            }
            ms=Math.max(ms,cs);
        }
        System.out.println("Max Subarray sum is: "+ms);
    }
    public static void main(String arg[])
    {
       /* int marks[]={98,97,95};
        update(marks);  
        for(int i=0;i<marks.length;i++)
        {
            System.out.print(marks[i]+" ");
        }
         System.out.println();
         */
         /*int number[]={2,9,13,23,17,27};
         int key=29;
         int index=LinearSearch(number,key);
         if(index==-1)
         {
             System.out.println("NOT Found");
         }else{
              System.out.println("Element found at index: "+index);
         }*/
         /*int number[]={1,2,4,6,3};
         System.out.println("Largest number is: "+getLargest(number));*/

          /*int number[]={2,4,6,8,10,12,14};
          int key=6;
          System.out.println("Index for Key is: "+BinarySearch(number,key));*/
         
         /* int number[]={1,2,3,4,5};
          ReverseArray(number);
          for(int i=0;i<number.length;i++)
          {
              System.out.print(number[i]+" ");

          }*/

          /*int number[]={2,4,6,8,10};
          PairsArray(number);*/
        
        /*int number[]={2,4,6,8,10};
        printSubarray(number);*/
           
          /* int number[]={1,-2,6,-1,3};
           MaxSubarraySum(number); */

           /*int number[]={1,-2,6,-1,3};
           MaxSubarraySumII(number);*/ 
            
            int number[]={1,-2,6,-1,3};
            MaxSubarrayIII(number);








         
    }
}