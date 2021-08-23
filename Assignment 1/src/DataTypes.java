/*
1. Accept 2 double values from User (using Scanner). Check data type.
. If arguments are not doubles , supply suitable error message & terminate.
If numbers are double values , print its average.
*/
package src;
import java.util.Scanner;
class DataTypes
{
    public static void main(String []args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER FIRST NO.: ");
        if(sc.hasNextDouble())
        {
            double a=sc.nextDouble();
            System.out.println("ENTER SECOND NO.: ");
            if(sc.hasNextDouble())
            {
               Double b=sc.nextDouble();
               System.out.println("AVERAGE: " +((a+b)/2.0));
            }
            else
            {
               System.out.println("NOT A DOUBLE VALUE !!");
            }
        }
        else
        {
            System.out.println("NOT A DOUBLE VALUE !!");
        }
        sc.close();
    }
    
}
