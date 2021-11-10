package exercise7;

public class TestException {
public static void main(String[] args) {
	int k = 0; int i = 15;
	
	
	try {
		double div = i/k;
		System.out.println("Div is " + div);
		
	} catch (ArithmeticException e) {
	}
}
}
