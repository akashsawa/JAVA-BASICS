package Q1;
import java.util.Scanner;
class TestPoint
{
    private static Scanner sc=new Scanner(System.in);
    public static void main(String args[])
    {
    Point2D point1=new Point2D(0,0); 
    Point2D point2=new Point2D(5,-4);

    System.out.println("ENTER X & Y co-ORDINATES of point 1: ");
    point1.setPoint(sc.nextInt(),sc.nextInt());
    System.out.println("ENTER X & Y co-ORDINATES of point 2: ");
    point2.setPoint(sc.nextInt(),sc.nextInt());
    System.out.println("FIRST POINT: "+point1.getPoint());
    System.out.println("SECOND POINT: "+point2.getPoint());
    if(point1.isEqual(point2))
    	System.out.println("BOTH POINTS ARE EQUAL");
    else
    	System.out.println("BOTH POINTS ARE NOT EQUAL");
    Point2D createdPoint=point1.createNewPoint(5,4);
    System.out.println("NEW CREATED POINT'S HASHCODE IS: "+point1.createNewPoint(5,4));
    System.out.println("NEW CREATED POINT'S OFFSET IS : 5 4 ");
    System.out.println("NEW CREATED POINT IS AT : "+createdPoint.getPoint());
    point1.calculateDistance(point2);
    System.out.println("THIRD NEW POINT IS: "+point1.thirdNewPoint().getPoint());
    
    }
	
}

