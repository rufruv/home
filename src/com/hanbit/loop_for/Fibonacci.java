
package com.hanbit.loop_for;

public class Fibonacci {
public static void main(String[] args) {
	int a = 1, b=1, c=2, d=1, sum= 2; 
	for(int i=3; i<=10; i++){
		c = a+b;
		a = b;
		sum+=c;
	}
	System.out.printf(
	                  "=====================================\n"
		            + "1, 1, 2, 3, 5, 8, 13, 21, 34, 55의 합\n" 
	                + "-------------------------------------\n"
                    + "%d \n"
	                + "=====================================", sum);
}
}