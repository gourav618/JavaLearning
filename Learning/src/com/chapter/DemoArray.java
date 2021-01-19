package com.chapter;

public class DemoArray {

	public static void main(String[] args) {
		//way to declare and initialize array
		int[] source = {1,2,3,4,5,6,7,8,9};
		
		int[] destination = new int[9];
		
		//arrayCopy 
		System.arraycopy(source,0, destination, 0, 9);
		for(int i=0;i<destination.length;i++) {
			System.out.print(destination[i]);
		}
		
		int flag=3;//item to be deleted
		for(int i=0;i<source.length;i++) {
			if(flag == i) {
				for(int j=i+1;i<source.length-1;j++) {
					source[i] = source[j];
					i++;
				}
			}
		}
		System.out.println();
		for(int i=0;i<source.length-1;i++) {
			System.out.print(source[i]);
		}
		
	}

}
