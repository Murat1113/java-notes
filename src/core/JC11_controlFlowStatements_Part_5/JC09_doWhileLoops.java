package core.JC11_controlFlowStatements_Part_5;
/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class JC09_doWhileLoops {

	/**
	 * @param args
	 */

	/*
	 * do...while loop repeatedly executes same set of statements while(condition)
	 * is true.
	 * 
	 * The statement is executed once initially then Condition is cheked at loop
	 * end.
	 * 
	 * Code in Loop body will execute at least once.
	 * 
	 * 
	 */
	public static void main(String[] args) {
		int i = 20;

		do {

			System.out.println(i);

			i++;

		} while (i <= 10);
	}

}
