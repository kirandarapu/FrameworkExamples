package MyNewPackage;

public class Condtionalstatements {

	int a=15,b=20;
	int c=20, d=25;
	
	public void compare() {
		
		if(a<b) {
			System.out.println(a);
			System.out.println(b);
			if(c<d) {
				System.out.println(c);
				if(d>b) {
					System.out.println(d);
					
					if(a<c) {
						System.out.println(c+d);
					}
				}
			}
		}
		
	}
	
	
	
	public static void main(String[] args) {
		
		Condtionalstatements cs=new Condtionalstatements();
		cs.compare();
		

	}

}
