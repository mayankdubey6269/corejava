package Mayank;

import java.util.Arrays;

public class DimensionalArray {
public static void main(String[] args) {
	int [][]a=new int [10][10];
	for (int i=0; i<10;i++){
		for (int j=0;j<10;j++){
			a[i][j]=(i+1)*(j+1);
			
		}
	}
	for(int[] ar :a){
		System.out.println(Arrays.toString(ar));
	}
		
}
}
		