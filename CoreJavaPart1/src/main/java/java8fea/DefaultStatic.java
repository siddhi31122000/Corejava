package java8fea;
interface MyInter1{
      void msg();
      default void display( ) {
    	System.out.println("Default method of interface"); 
      }
static void displaySatic () {
	 System.out.println("Satic dsiplay method");
}
}

public class DefaultStatic implements MyInter1 {

	public static void main(String[] args) {
		// DefaultMethodEx d=new DefauktMethodEx();	}
        DefaultStatic d=new DefaultStatic();
        d.msg ();
        d.display();
        MyInter1.dispalyStatic();
        
	@Override
	public void msg() {
		// TODO Auto-generated method stub
		
	}

}
