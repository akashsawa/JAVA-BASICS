package day12_assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

// 3.1 Collections.shuffle() to shuffle list elements
//3.2 Collections.copy to understand extends vs super
//3.3 Write a generic method to accept ANY type of the collection(any list or any set) of numbers (ints/double/float) n return it's sum
//3.4 Write a generic method to accept ANY type of the list of numbers  &   add the specified number to the list. 
//(For understanding PECS)
public class test1 {

	public static void main(String[] args) 
	{
		ArrayList<Number>list1=new ArrayList<Number>();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		list1.add(50);
		
		ArrayList<Integer>list2=new ArrayList<>();
		list2.add(100);
		list2.add(200);
		list2.add(300);
		System.out.println("LIST1"+list1);
		System.out.println("LIST2"+list2);
		
		//public static void shuffle​(List<?> list)
		Collections.shuffle(list1);
		System.out.println("SHUFFLED LIST: "+list1);
		
		//public static void shuffle​(List<?> list, Random rnd)
		Collections.shuffle(list1, new Random());
		System.out.println("RANDOM :"+list1);
		
		//public static <T> void copy​(List<? super T> dest, List<? extends T> src)
		Collections.copy(list1, list2);
	
		System.out.println("AFTER COPY LIST2 TO LIST1:"+list1);
	}

}
