package AT_CounterProject;
import static java.lang.System.*;

public class AtCounterRunner
{
	public static void main(String args[])
	{
		//instantiate an AtCounter

		//test the code
		AtCounter at = new AtCounter(9,9);

		System.out.println(at.countAts(0, 0));
		System.out.println(at.toString());
		
		
	}
}