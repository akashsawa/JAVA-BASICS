package day12_assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;

class Emp{    }
class Mgr extends Emp {   }
class SalesMgr extends Emp{   }
public class test3 {

	public static void main(String[] args) 
	{
		ArrayList<Emp>list=new ArrayList<Emp>();
		Collections.fill(list,new Mgr());
		Collections.fill(list,new SalesMgr());
		
		ArrayList<Object> list2 = new ArrayList();
		Arrays.asList(new Emp(), new Mgr());
		Collections.fill(list2,new Emp());
		Collections.fill(list2,new SalesMgr());
		Collections.fill(list2,new Date());
		Collections.fill(list2, 1234);
		System.out.println(list+ "\n"+list);

	}

}
