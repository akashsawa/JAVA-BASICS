package com.tester;

import com.geometry.Point2D;

import java.util.Arrays;
import java.util.Scanner;

public class TestPointArray 
{
	private static Scanner sc= new Scanner(System.in);
	public static void main(String[] args)
	{
		int ch,n;
		System.out.println("HOW MANY POINTS TO PLOT ?");
		n=sc.nextInt();
		Point2D points[] = new Point2D[n];
		System.out.println("ENTER CHOICE: ");
		while((ch=menuList())!=10)
				{
			        
					switch (ch)
					{
						case 1: 
								System.out.println("ADD A POINT AT INDEX: ");
								int index=sc.nextInt();
								if(index<=0 || index>n)
								{
									System.out.println("INDEX CANNOT BE LESS THAN 0 ENTER AGAIN !!");
									break;
								}
								System.out.println("ENTER X AND Y POINTS: ");
								int pt1=sc.nextInt();
								int pt2=sc.nextInt();
								points[index-1]=new Point2D(pt1,pt2);
								break;
						case 2: 
								/*
								for(Point2D eachpoint:points)
								{
									if(eachpoint==null)
										System.out.println("NULL CANNOT BE ACCESSED");
									else
										eachpoint.getPoint();
								}
								break;
								*/
							    for(int i=0;i<points.length;i++)
								{
									if(points[i]==null)
										System.out.println("points ["+i+"] = "+"0");
									else
										System.out.println("points ["+i+"] = "+points[i].getPoint());
								}
								break;
								
						case 3: System.out.println("ENTER INDEX 1 : ");
								int n1=sc.nextInt();
								System.out.println("ENTER INDEX 2 : ");
								int n2=sc.nextInt();
								/*
								if(points[n1-1]==null || points[n2-1]==null)
								{
									System.out.println("INVALID INDEX ---NO POINT PLOTTED HERE !! ");
									break;
								}
								if (points[n1-1].isEqual(points[n2-1]))
								{
									System.out.println("BOTH POINTS ARE SAME !!");
									break;
								}
								
								else
								{
									System.out.println("DIFFERENT POINTS ");
									break;
								}
								*/
								while(points[n1-1] !=null && points[n2-1]!=null)
								{
									if (points[n1-1].isEqual(points[n2-1]))
									{
										System.out.println("BOTH POINTS ARE SAME !!");
										break;
									}
									else
									{
										System.out.println("DIFFERENT POINTS ");
										break;
									}
								}
								
								
						case 4: System.out.println("ENTER INDEX 1 : ");
								int n3=sc.nextInt();
								System.out.println("ENTER INDEX 2 : ");
								int n4=sc.nextInt();
								while(points[n3-1] !=null && points[n4-1]!=null)
								{
									System.out.println("DISTANCE BETWEEN "+n3+" & "+n4+"POINTS IS : "+points[n3-1].calculateDistance(points[n4-1]));
									break;
								}
								System.out.println("DISTANCE CANNOT BE FOUND !!!");
								
								break;
						case 5: 
								System.out.println(Arrays.toString(points));
								break;
						default: System.out.println("INVALID INDEX ---OUT OF RANGE !!!");
					            break;
								
					}	
	 			}

	}
	private static int menuList() 
	{
		System.out.println("ENTER 1. ADD POINTS ");
		System.out.println("ENTER 2. DISPLAY ALL POINTS ");
		System.out.println("ENTER 3. CHECK EQUALITY ");
		System.out.println("ENTER 4. CALCULATE DISTANCE ");
		System.out.println("ENTER 5. HASHCODES");
		System.out.println("ENTER 10. EXIT !");
		return sc.nextInt();
	}
}
