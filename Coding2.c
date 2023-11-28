#include<stdio.h>
int main()
{
    int size,arr[20],i,j,temp; 
    printf("Enter size of array:\n");
    scanf("%d",&size);
    printf("Enter array\n");
    for(i=0;i<size;i++)
    {
         scanf("%d",&arr[i]);
    }
    for(i=0;i<size;i++)
    {
        for(j=0;j<size;j++)
        {
            if(arr[j+1]<arr[j])
          {
            temp=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;
          }


        }
        
    }
    printf("Array in ascending order:\n");
    for(i=0;i<size;i++)
    {
        printf("%d ",arr[i]);
    }
   
    return 0;
}