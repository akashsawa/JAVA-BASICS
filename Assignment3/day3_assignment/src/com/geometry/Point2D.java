/*
3. Solve
Create Point class Point2D   : for representing a point in x-y co-ordinate system.
*/
package com.geometry;

public class Point2D
{
    private int x;
    private int y;
    public Point2D(int x, int y)
    {
        this.x=x;
        this.y=y;
    }
    public void setPoint(int x, int y)
    {
        this.x=x;
        this.y=y;
    }
    public String getPoint()
    {
        return "POINTS: "+"X: "+this.x+" Y: "+this.y;
    }
    public boolean isEqual(Point2D point2)
    {
    	return (this.x==point2.x && this.y==point2.y);
    }
    public Point2D createNewPoint(int xOffset, int yOffset)
    {
    	Point2D newPoint=new Point2D(this.x+xOffset,this.y+yOffset);
        //System.out.println(newPoint.x);
        return newPoint;
    	
    }
	public double calculateDistance(Point2D newpoint) 
	{
		return Math.sqrt(Math.pow((this.x-newpoint.x),2)+Math.pow((this.y-newpoint.y),2));
	}
	public Point2D thirdNewPoint() 
	{
	    Point2D thirdPoint=new Point2D(this.x,this.y);
	    return thirdPoint;
		
	}
}

