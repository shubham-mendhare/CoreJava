package pkg_A;

public class X extends V {
	final int a;
	final static int b;
	 X(){
			a = 100;	 
			 }
	 
	 static {
		 b=200;
	 }
			

	@Override
	void abc() {
		System.out.println("Method implemented successfully!");
		
	}
	

	public static void main(String... args) {
		
	 X obj = new X();
	 
	 obj.abc();
	
	 System.out.println(obj.a);
	 System.out.println(X.b);
	 
	}

}


 abstract class V{
	
	abstract void abc();
}