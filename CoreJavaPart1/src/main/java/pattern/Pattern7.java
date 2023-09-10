package pattern;

public class Pattern7 {
  public static void printFullPyramidStar (int n1) {
	  for(int i=1;i<=n1;i++) {
		  for(int j=1;j<=n1-i;j++)  {
			  System.out.println("  ");
			  
	  }
	  for ( int j=1;j<=i;j++) {
		  System.out.println("* ");
	  }
       System.out.println();   
	  }
  }
  public static void main(String[]  args) {   
	  printFullPyramidStar(3);
 
  
  }
}
