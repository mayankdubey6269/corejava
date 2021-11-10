package exercise7;

public class TestException1 {
public static void main(String[] args) {
	int i = 5;
	int j = 8;
	int k = 4;
	try {
		int a = i + j/0;
		System.out.println("Hello Mayank");
	} catch (ArithmeticException e) {
	  System.out.println(e.getMessage());
	}
	finally {
		System.out.println("sdufgisurbferaibri");
	}
}
}
