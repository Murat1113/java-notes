package core.day_13_methods_Part_1;

/**
 * @author esalkan
 */
public class _04_creditCardMethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		double salary = 50000;

		int creditRating = 5;
			//    true      &&   false = false
		if (salary >= 20000 && creditRating >= 7) {

			qualify();

		} else {

			noQualify();

		}

	}

	public static void noQualify() {
		
		int a = 1;
		int b = 5;
		int result = a + b ;

		System.out.println("I am sorry, you are not qualified for the CC " + result);

	}

	public static void qualify() {

		System.out.println("Congrat, you are qualified for the CC ");

	}

}
