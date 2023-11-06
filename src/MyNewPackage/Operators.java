package MyNewPackage;

public class Operators {

	int a=11;
	int b=22;
	int c=33;
	
	public void addition() {
		System.out.println(a+b);
		
	}
	public void subtraction() {
		System.out.println(b-a);
	}
	public void multiply() {
		System.out.println(a*b);
	}
	public void division() {
		System.out.println(b/a);//22/11=2
	}
	public void modulardiv() {
		System.out.println(c/b); //33/22==
	}
	
	public static void main(String[] args) {
		
		Operators op=new Operators();
		op.addition();
		op.subtraction();
		op.multiply();
		op.division();
		op.modulardiv();

	}

}
