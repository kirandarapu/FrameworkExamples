package MyNewPackage;

public class ForLoop {
	int a=11;
	
	public void sum() {
		
		for(int i=0;i<a;i++) {
			
			System.out.println(i);
		}
		
	}

	public static void main(String[] args) {
		
		ForLoop fl=new ForLoop();
		fl.sum();
	}

}
