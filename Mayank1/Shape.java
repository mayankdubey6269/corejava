package Mayank;

public abstract class Shape {
private String setcolor;
private int setborderwidth;


public String getSetcolor() {
	return setcolor;
}
public void setSetcolor(String setcolor) {
	this.setcolor = setcolor;
}
public int getSetborderwidth() {
	return setborderwidth;
}
public void setSetborderwidth(int setborderwidth) {
	this.setborderwidth = setborderwidth;
}
public abstract void area();
}
