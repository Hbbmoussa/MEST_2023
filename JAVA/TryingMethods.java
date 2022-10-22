/*This Class is for understand the difference between :
 * - Static and Dynamic method
 * - Handle The control and loop statement 
 * -
 */

public class TryingMethods {
	
	//Main method
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	/*	If you want to execute a method 
	 * 	Just Call it inside the main method .
	 * Like This 
	 */
		
	}
	
	public static void evenNumbers() {
		int sumOfEven = 0;		
		for (int i=12; i<103; i++) {
			if( i%2 == 0) {
				sumOfEven += i;
			}else ;
		}
		
		System.out.println(sumOfEven);
	}
		

}
