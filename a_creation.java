import java.util.*;
public class a_creation
{
    public static void main(String args[])
    {
        int array[][]=new int[3][3];            // array declaraction
        int n=3, m=3;

        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++)     // outer loop
        {
           for(int j=0;j<m;j++)                // inner loop
           {
               array[i][j]=sc.nextInt();       // input for array
           }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(array[i][j] +  " ");     // output
            }
            System.out.println();
        }
    }
}
