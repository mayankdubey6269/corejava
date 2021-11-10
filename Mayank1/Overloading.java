package Mayank;

public class Overloading {


public int add(int a, int b){
return a+b;
}
public int add(int a, int b, int c){
	return a+b+c;
}
public double add(double a, double b){
	return a+b;
	
	
}
public float add(float a, int b){
	return a+b;
}
public static void main(String[] args) {
	Overloading O=new Overloading();
	
	System.out.println(O.add(22,8,9));
}





}
