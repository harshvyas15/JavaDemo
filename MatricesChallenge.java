public class MatricesChallenge
{
    public static void printmatrix(int matrix[][])
    {
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        
    }
    public static void main(String args[])
    {
        int row=2,col=3;
        int matrix[][]={{1,2,3},{4,5,6}};
        //print original matrix;
        printmatrix(matrix);
        int tmatrix[][]=new int[col][row];
        for(int i=0;i<col;i++)
        {
            for(int j=0;j<row;j++)
            {
                System.out.print(matrix[j][i]+" ");
            }
             System.out.println();
        }
       

    }
}