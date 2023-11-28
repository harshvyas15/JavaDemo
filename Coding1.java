import java.util.*;
class Coding1{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter numbers");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        distinctElements(arr,size);

    }
    public static void distinctElements(int arr[],int n)
    {
        int i,j;
        for(i=0;i<n;i++)
        {
            for(j=0;j<i;j++)
            {
                if(arr[i]==arr[j])
                {
                    break;
                }
            }
            if(i==j)
            {
                System.out.print(arr[i]+" ");
            }
        }
    }
}