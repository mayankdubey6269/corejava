package exercise7;

public class CatchBlock {
public static void main(String[] args) {
	try {
		String name="Mayank";
		System.out.println(name.length());
		System.out.println(name.charAt(8));

	} catch (Exception e) {
		String name="Dubey";
		System.out.println(name.length());
		System.out.println(name.charAt(6));

		System.err.println(e.getMessage());
	}finally{
		System.out.println("i am learning boy");
	}
	
	}
}