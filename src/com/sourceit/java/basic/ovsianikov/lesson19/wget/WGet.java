package com.sourceit.java.basic.ovsianikov.lesson19.wget;

public class WGet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		if(args.length == 0){
			System.out.println("Usage: some web address");
			System.out.println("       or -i");
			System.out.println("Example: http://google.com");			
			return;
		}
		
		String command = args[0];
		
		if ("-i".equals(command)){
			//TODO ask for URL
			
		} else {
			
		}
		
		//TODO with url
		System.out.println("Select what to do the next: ");
		System.out.println("1) Save page");
		System.out.println("2) Display title");
		System.out.println("3) Find the word");
		System.out.println("4) List all URL's on the page");
		
		
	}
	
	public static String getInstructions(){
		
	}

}
