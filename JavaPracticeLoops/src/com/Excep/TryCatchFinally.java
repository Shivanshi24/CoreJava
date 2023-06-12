package com.Excep;

public class TryCatchFinally {
	
	public static void main(String[] args) {

		try {
			String name = "null";

			//int a = 10 / 0;

			System.out.println(name.charAt(10));

			System.out.println(name.length());

		}
		
		catch(NullPointerException e) {
			System.out.println(e.getMessage());
			
		}

		catch (StringIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			e.getStackTrace();

		}
		
		catch(Exception e) {
			
			System.out.println(e);
			
		}

		finally {
			System.out.println("This is finally block");
			System.out.println("Its flows always executes");
		}

	}


	
}