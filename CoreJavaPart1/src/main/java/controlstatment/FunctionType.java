package controlstatment;

    public class FunctionType {
    
	
	void add(int a,int b)
	{
		System.out.println("Addition: "+(a+b));
	
	}
     static void mul(int a,int b) {
    	 System.out.println("Multiplication : "+(a*b));
       }
	  static void sub(int a, int b)
	  {
		  System.out.println("Substraction:"+(a-b));
		
	  }
	static void  div(int a, int b) {
		System.out.println("Division: "+(a/b));
			}
		String displayName(String name ) {
			return "Hello"+name;
			
		}
		
		public static void main(String[] args) {
			FunctionType f= new FunctionType();
			f.add(2,4);
			mul(12,12);
			sub(100,85);
			div(120,12);
			System.out.println(f.displayName("lekha"));
		}
		
		
		
			
		}
