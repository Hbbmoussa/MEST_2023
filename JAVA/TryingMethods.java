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
	// Days of week
	public String daysOfWeek(int day) {
		switch(day) {
		case 1 :
			return "Monday";
		case 2 :
			return "Tuesday";
		case 3 :
			return "Wednasday";
		case 4 :
			return "Thursday";
		case 5: 
			return "Friday"; 
		case 6 :
			return "Saturday";
		case 7: 
			return "Sunday";
		default:
			return "Put the correct Number of day";
		}
	}
		

}
