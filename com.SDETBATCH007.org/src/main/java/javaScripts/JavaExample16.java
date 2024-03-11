package javaScripts;

public class JavaExample16{
	
	public static void main(String[] args){
		int a = 10;
		int b = 101;
		int c = 200;
		
		if(a>b && a>c) {
			System.out.println("a is big value");
		}
		else if(b>a && b>c){
			System.out.println("b is big value");
		}
		else if (c>a && c>b){
			System.out.println("c is big value");
		}
		else{
			System.out.println("please check the values");
		}
		
	}
	
	
	}
