package core.reviews.week_05;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class S02_StringPractice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("\n----- concat() -----\n");
		String str = "Cydeo";
		str.concat(" School");

		System.out.println(str);

		String strNew = str.concat(" School");
		System.out.println(str); // Cydeo
		System.out.println(strNew); // Cydeo School

		str = strNew; // What happens to "Cydeo" Object ? --> garbage collector picks it up
		// str reference variable points to new object "Cydeo School"

		System.out.println("str : " + str);

		System.out.println("\n----- toUpperCase() -----\n");

		String str2 = "EU7 Batch Java Course";
		str2.toUpperCase();

		System.out.println("str2 : " + str2);

		str2 = str2.toUpperCase();
		System.out.println("str2 after assigned : " + str2);

	}

}
