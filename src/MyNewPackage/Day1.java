package MyNewPackage;

public class Day1 {

	int c=30;// instance variable or global variable
	static int d=40; //static variable
	
	public static void main() {
		
		int a=10;//local variable
		int b=20;//local variable
		
		System.out.println(a+b+d);
		
		
	 }
		
	
	
	 static public void main(String[] args) {
		
		 Day1.main(); 
		System.out.println(d);
		 
		 
	//public ==access modifier
	//static ==keyword
	//void==no return type
	//main==method
  //static and public both are one type of access modifier
	 
		

	}

}
