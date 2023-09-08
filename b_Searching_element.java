import java.util.*;
public class b_Searching_element
{
    public static boolean searchElement(int array[][],int key)
    {
        int n=array.length;
        int m=array[0].length;
        for(int i=0; i<n ;i++)
        {
            for(int j=0;j<m;j++)
            {
                if (array[i] [j]==key)
                {
                    System.out.println("Digit found at + (" + i +"  , " + j + ")");
                    return true;
                }
            }
        }
        System.out.println("Digit not dound");
        return false;
    }


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
        searchElement(array, 5);
    }
}
