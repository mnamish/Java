//© A+ Computer Science
// www.apluscompsci.com  

//java linked list example

import static java.lang.System.*;
import java.util.LinkedList;
import java.util.Collections;

public class LinkedListDemo
{
	public static void main(String args[])
	{
		LinkedList<String> list = new LinkedList<String>();

		list.add("c");
		list.add("b");
		list.add("a");
		list.add(1,"d");  			//inserts at 1 and moves other items up

		out.println(list);

		out.println(list.get(0) );   	//c
		out.println(list.get(1) );   	//d

		out.println(list.indexOf("b") + "\n\n");   //outs 2
		
		//Sort
		
		//print
		
		//Reverse
		
		//For each
		
		//Get first and last
	}
}