

import java.util.*;
import static java.lang.System.*;

public class RestaurantRunner
{
	public static void main ( String[] args )
	{
		ListNode z = new ListNode("cheese",
	 						new ListNode("pepperoni",
	 						new ListNode("onions",
	 						new ListNode("peppers",
	 						new ListNode("bacon",
	 						new ListNode("pineapple",
	 						new ListNode("sausage",		       		
	 						new ListNode("garlic",null))))))));
			 			

		
		System.out.print("<<Original list values>>\n");	
		Restaurant.print(z);
		System.out.println("\n");
		
		System.out.println("num nodes = " + Restaurant.nodeCount(z));

		System.out.print("\n<<List values after calling nodeCount>>\n");	
		Restaurant.print(z);
		System.out.println();		

		Restaurant.doubleFirst(z);		
		System.out.print("\n<<List values after calling doubleFirst>>\n");							
		Restaurant.print(z);
		System.out.println();	

		Restaurant.doubleLast(z);		
		out.print("\n<<List values after calling doubleLast>>\n");							

		Restaurant.print(z);
		out.println();				

		Restaurant.removeXthNode(z,2);		
		out.print("\n<<List values after calling removeXthNode(2)>>\n");					

		Restaurant.print(z);
		out.println();			

		Restaurant.setXthNode(z,2,"PIZZA!");		

		out.print("\n<<List values after calling setXthNode(2,PIZZA!)>>\n");										

		Restaurant.print(z);
		out.println();				
	}
}