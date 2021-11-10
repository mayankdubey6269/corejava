package exercise7;

public class ExceptionAssignment {
	
	
public static void main(String[] args) {
	try {
		String s = "Mayank";
		System.out.println(s.length());
		System.out.println(s.charAt(7));
		System.out.println(s);
		
	} catch (StringIndexOutOfBoundsException e) {
		System.out.println("Mayank");
		
	}
	catch (NullPointerException e){
		System.out.println("Mayank Dubey");
	}
	finally{
		System.out.println("I'm here");
	}
		}
	
	
}
