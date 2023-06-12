package com.basics;

public class MyClass {
	
	public void sum() {
		System.out.println("sum method");
	}
	
	public int sum(int a, int b) {
		int c;
	    c = a + b;
		System.out.println("sum = " + c);
	      return c;
		
	}
	public void prime (int num) {
		int i;
		int count = 0;
		for (i = 2; i < num; i++) {

			if (num % i == 0) {
				count++;

			}

		}
		if (count == 0) {
			System.out.println("prime number");

		} else {
			System.out.println("not a prime number");
		}

	}
	
	public void string(String s) {
		StringBuffer sb = new StringBuffer("shivanshi " );
		sb.append(s);
		System.out.println(sb);
		
	}
	
	public void triangle(int num) {
		
     for(int i = 1; i <= num; i++) {
			
			for( int j = 1; j <= i; j++) {
				
				System.out.print(i );
				System.out.print(" ");
			

			}
			
			System.out.println(" ");
			
			
		}

	}
	
	public void factorial(int num) {
		int sum = 1;
    for(int i = 1; i<=num; i++) {
			
			sum = sum * i;
			
			
		}
		
		System.out.println(sum);
	}
		
	}
	
	


