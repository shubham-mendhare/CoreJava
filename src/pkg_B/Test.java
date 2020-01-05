package pkg_B;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*check obj = new check();
		
		System.out.println(obj.a);
		System.out.println(obj.b);
*/
		
		WebDriver driver = new ChromeDriver();
		
		driver.findElement();
		System.out.println(driver.get("aaa"));
		driver.quite();
		
	/*	int roll[]; 
		roll = new int[5];
		int[] lll; 
		lll= new int[5];
		
		String[] arr = {"Shubham", "Rushikesh", "Sanket"};
		
		roll[0]=1;
		System.out.println(arr[0]);*/
	
	}
	

	
	

}

interface A{
	int a =100;
	
	void kkk();
	
}

interface B{
	int b =200;
	
	void vvv();
	
}

class opo{
	
	void njkl() {
		System.out.println("Some stuff!");
	}
}

class check extends opo implements A,B {

	@Override
	public void vvv() {
		System.out.println("from interface B");
		
	}

	@Override
	public void kkk() {
		// TODO Auto-generated method stub
		System.out.println("from interface A");
	}
	
	
}

interface WebDriver{
 void quite();
void findElement();
 void findElements();
 String get(String a);
 void close();
 String getTitle();
 
}

class ChromeDriver implements WebDriver{

	@Override
	public void quite() {
		System.out.println("Browser all intances closed successfully.");
		
	}

	@Override
	public void findElement() {
		System.out.println("Element");
		
	}

	@Override
	public void findElements() {
		System.out.println("Elements");
		
	}
	@Override
	public void close() {
		System.out.println("Browser closed");
		
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		String aaa1="page title";
		return aaa1;
	}

	@Override
	public String get(String a) {
		// TODO Auto-generated method stub
		return a;
	}

	
}