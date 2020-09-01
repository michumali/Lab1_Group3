
public class TestDate {

	public static void main(String[] args) {
		Date d1 = new Date(4, 13, 2001);
		Date d2 = new Date(4,15,2000);
		
		if(d1.compareTo(d2) == 1) { //d1 is greater than d2
			System.out.println(d1 + " is later than " + d2);
		}else if(d1.compareTo(d2) == -1) {
			System.out.println(d1 + " is earlier than " + d2);
		}else {
			System.out.println(d1 + " and " + d2 + " are the same dates...");
		} 
		

	}

}
