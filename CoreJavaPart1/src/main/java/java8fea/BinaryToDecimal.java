package java8fea;

public class BinaryToDecimal {

	public static void main(String[] args) {
		
		int a=15;//Decimal
		String b= Integer.toBinaryString(a);//convert decimal to binary
		System.out.println(b);
		
		String f=Integer.toHexString(a);//convert decimal to hexadecimal  
		System.out.println("f");
		
		String c = Integer.toOctalString(a);
		System.out.println(c);
	}

}
