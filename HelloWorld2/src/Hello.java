import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Hello {
	/**
	 * Implement the application
	 * @param args arguments
	 */
	public static void main(String[] args){
		//Important announcement
		System.out.println("Let's try this conflict again");
		System.out.println("I'm oblivious to the other branch right now...");
		System.out.println("This should cause a nice conflict");
		System.out.println("Here ye Here ye : important announcement");
		
		System.out.println("Hello World!");
		
		//Display the date
		DisplayDate();
		
		//Sign off
		System.out.println("Goodbye World!");
	}
	public static void DisplayDate()
	{
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		System.out.println(dateFormat.format(date)); //2014/08/06 15:59:48
	}
}
