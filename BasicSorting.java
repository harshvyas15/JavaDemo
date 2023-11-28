import java.util.Arrays;
import java.util.Collections;
public class BasicSorting
{
    public static void bubbleSort(int arr[])
    {
        int swap=0;
        
        for(int turn=0;turn<=arr.length-2;turn++)
        {
            
            for(int j=0;j<=arr.length-2-turn;j++)
            {
              
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap++;
                }
            }
            if(swap==0)
            {
                return;
            }
        }
    }
    public static void SelectionSort(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        { 
            int minpos=i;
            for(int j=i+1;j<arr.length;j++)
            {
                
                if(arr[minpos]>arr[j])
                {
                    minpos=j;
                }
            }
            //swap
            int temp=arr[minpos];
            arr[minpos]=arr[i];
            arr[i]=temp;
        }
    }
    public static void InsertionSort(int arr[])
    {
        for(int i=1;i<arr.length;i++)
        {
            int curr=arr[i];
            int prev=i-1;
            //finding out the correct pos to insert
            while(prev>=0 && arr[prev]>curr)
            {
                arr[prev+1]=arr[prev];
                prev--;
            }
            //Insertion
            arr[prev+1]=curr;

        }
       
    }
    public static void CountSort(int arr[])
    {
        
    }
    public static void displayArray(int  arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        int arr[]={5,4,1,3,2};
        //Arrays.sort(arr,Collections.reverseOrder());
        displayArray(arr);

    }
}