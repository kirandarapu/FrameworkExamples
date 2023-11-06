package MyNewPackage;

public class Day2 {

	
	int a=10;
	byte b=11;
	short s=123;
	long l=12345678;
	char c='K';
	float f=5.6f;
	double d=10.11d;
	boolean B=true;
	boolean B1=false;
	public void sum() {
		
		System.out.println(a+b+s+l);
		System.out.println(f+d);
		System.out.println(B1);
		System.out.println(B);
		System.out.println(c);
		
	}
	
	
	public static void main(String[] args) {
		Day2 d2=new Day2();
		d2.sum();

	}

}
