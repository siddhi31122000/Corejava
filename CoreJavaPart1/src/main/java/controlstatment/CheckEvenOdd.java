package controlstatment;

public class CheckEvenOdd {

	public static void main(String[] args) {
		int no=89;
		int marks=-92;
        if( no%2 ==0) {
		System.out.println(no+ "is even");
	}
	    else {
	 	System.out.println(no+ "is odd");
  }
        if (marks<100 && marks>90) {
        	System.out.println("a+ grade");
        }
        else if (marks<90 && marks>76) {
        	System.out.println("a+ grade");
        }
        else {
        	System.out.println("Invalid");
        }
	}
}