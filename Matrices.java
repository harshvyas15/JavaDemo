import java .util.*;
public class Matrices
{
    public static int  Search(int matrix[][])
    {
        int maxElement=Integer.MIN_VALUE;
        int minElement=Integer.MAX_VALUE;
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]>maxElement)
                {
                    maxElement=matrix[i][j];
                }
            }
        }
        return maxElement;
    }
    //Spiral Matrix
    public static void printSpiral(int matrix[][])
    {
        int startRow=0;
        int startCol=0;
        int endRow=matrix.length-1;
        int endCol=matrix[0].length-1;
        while(startRow<=endCol && startCol<=endCol)
        {
            //top
        for(int j=startCol;j<=endCol;j++)
        {
            System.out.print(matrix[startRow][j]+" ");
        }
        //Right
        for(int i=startRow+1;i<=endRow;i++)
        {
            System.out.print(matrix[i][endCol]+" ");
        }
        //bottom
        for(int j=endCol-1;j>=startCol;j--)
        {
            if(startRow==endRow)
            {
                break;
            }
            System.out.print(matrix[endRow][j]+" ");

        }
        //left
        for(int i=endRow-1;i>=startRow+1;i--)
        {
            if(startCol==endCol)
            {
                break;
            }
            System.out.print(matrix[i][startCol]+" ");
        }
        startRow++;
        endRow--;
        startCol++;
        endCol--;
        }
    }
    //Diagonal sum
    //Approach
    //1)Brute Force approach
    //2)Optimized approach
    public static int diagonalSum(int matrix[][])
    {
        int sum=0;
       /* for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(i==j)
                {
                    sum+=matrix[i][j];
                }
                else if(i+j==matrix.length-1)
                {
                    sum+=matrix[i][j];
                }
            }
        }
        return sum;
        */
        //optimized
        for(int i=0;i<matrix.length;i++)
        {
            //pd
            sum+=matrix[i][i];
            //sd
            if(i!=matrix.length-1-i)  
            {
                sum+=matrix[i][matrix.length-i-1];
            }

        }
        return sum;
    }
    //Search in sorted matrix
    public static boolean stairSearch(int matrix[][],int key)
    {
        int row=0,col=matrix.length-1;
        while(row<=matrix.length-1 && col>=0)
        {
            if(key==matrix[row][col])
            {
                System.out.println("Key found at ("+row+","+col+" )");
                return true;
            }
            else if(key<matrix[row][col])
            {
                col--;

            }
            else{
                row++;
            }

        }
        System.out.println("Not found");
        return false;
    }
    public static void main(String args[])
    {
        
       /* int matrix[][]=new int[3][3];
        
       // int n=3,m=3;
        int n=matrix.length , m=matrix[0].length;
        Scanner sc=new Scanner(System.in);
        //Input 2D array
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                matrix[i][j]=sc.nextInt();
            }
        } 
        //Output 2D array
          for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
         int max=Search(matrix);
         System.out.println("Max Element is "+max);

         */
        // int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
         //printSpiral(matrix); 
         int matrix[][]={{0,1,2},{3,4,5},{6,7,8}}; 
        // System.out.println(diagonalSum(matrix));
         int key=4;
         stairSearch(matrix,key);
        
    }
}