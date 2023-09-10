package pattern;

public class Pattern8 {

	public static void  printFullyPyramidStar(int n1) {
		for(int i=1;i<=n1;i++) {
			for(int j=1;j<=n1-i;j++) {
			System.out.println("");
		}
			for(int j=1;j<=1;j++) {
			//	System.out.print("* ");
				System.out.println(i+"");
			}
	           System.out.println();
		}
	}
	public static void main(String[] args) {
		printFullyPyramidStar(3);
		
	 }
	}
		