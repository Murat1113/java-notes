/**
 * 
 */
package day_22_stringClassContinue_Lab;

/**
 * @author esalkan
 *
 */
public class question_07 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * 
		 * Given 2 strings, a and b, return a string of the form short+long+short, with
		 * the shorter string on the outside and the longer string on the inside.
		 * 
		 * comboString("Hello", "hi") → "hiHellohi" 
		 * comboString("hi", "Hello") → "HellohiHello" 
		 * comboString("aaa", "b") → "baaab"
		 * 
		 */

		System.out.println(comboString("Hello", "hi"));
		System.out.println(comboString("hi", "Hello"));
		System.out.println(comboString("aaa", "b"));
		System.out.println(comboString("Just", "Test"));
	}
	
	public static String comboString(String str1, String str2) {
		String result;
		return result = str2.concat(str1) + str2;
	}

}
