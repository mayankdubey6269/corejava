package exercise7;

public abstract class Shape {
	private int borderwidth=0;
	private String color=null;
	
	
	public int getBorderwidth() {
		return borderwidth;
	}
	public double setBorderwidth(int borderwidth) {
		return this.borderwidth = borderwidth;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	double d = setBorderwidth(8);
	public static void main(String[] args) {
		
		System.out.println("Black");
		System.out.println(8);
	}
	

		
  }

