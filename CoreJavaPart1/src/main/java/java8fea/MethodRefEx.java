package java8fea;

@FunctionalInterface
interface Display {
	void display();
	
	
}
public class MethodRefEx {
	public void myMethod() {
		System.out.println("Method reference in java 8");
		
	}

	public static void main(String[] args) {
		MethodRefEx obj = new MethodRefEx();
		obj.myMethod();
		System.out.println("++++++++++++++++++");
		Display ref = obj ::myMethod;  
		 ref.display();
		
	}

}
