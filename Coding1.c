#include<stdio.h>
void uniqueElements(int arr[],int arr_size)
{
    int i,j;
    for(i=0;i<arr_size;i++)
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
            printf("%d ",arr[i]);
        }
    }
}
int main()
{
    int arr_size,i,arr[20];
    printf("Enter size of array:\n");
    scanf("%d",&arr_size);
    
    for(i=0;i<arr_size;i++)
    {
        printf("Enter elements\n");
        scanf("%d",&arr[i]);
    }
    uniqueElements(arr,arr_size);
    return 0;
}
