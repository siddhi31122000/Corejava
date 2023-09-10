package pattern;

public class TypeCast {

	public static void main(String[] args) {
		byte b=10;
		int i=b;
		//smaller-->bigger---->Implicit-->Widening
		System.out.println(i);
		//bigger-->smaller-->Explicit--->Narrowing
		int ii=30;
		byte b1=(byte) ii;
		float f=ii;
	}

}