
import java.util.LinkedList;
import java.util.Scanner;
import static java.lang.System.*;

public class HashTable
{
	private LinkedList[] table;

	public HashTable( )
	{
         //this could be your default, but I'd prefer an overloaded constructor
	 // also, this only initializes the table of linked lists - you'll also need to initialize each linked list before adding to them!
		table = new LinkedList[10];
	}

	public void add(Object obj)
	{
	//because you are bringing in a object, you'll need to cast it to the object type you are working with before comparing it
	//using the object's hashcode, insert it into the linked list at the proper position in the table
        //as long as it doesn't already exist in that linked list





	}

	public String toString()
	{
		String output="HASHTABLE\n";
        //begin with the accumulator provided above - make the printout look the same as the document example










		return output;
	}
}