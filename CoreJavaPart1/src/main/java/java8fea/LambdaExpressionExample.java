package java8fea;

import java.util.ArrayList;

interface Myinterface{
	int add( int a,int b);
	 
}
interface EvenOdd{
	int evod(int a);
}
interface RevString{
	String rev(String s);
}

public class LambdaExpressionExample {
// private static int var = 10;
	public static void main(String[] args) {
        
		Myinterface mf = (int a, int b)->a+b;
		System.out.println("Sum is :......"+mf.add(4, 7));
		Myinterface mf1 =(int a, int b)->a*b;
		System.out.println("Multiplication :......"+mf1.add(4, 7));
	
	    EvenOdd eo =( int a)->
	    {
	    if(a%2==0)
	    	System.out.println("even no.");
	    else
	    	System.out.println("odd no.");
	    return a;
	    };
	    System.out.println(eo.evod(8)); 
	    
	    RevString rs =(String s)->
	    {
	    	String revs="";
	    	for(int i =s.length()-1;i>=0;i--) {
	    		char w= s.charAt(i);
	    		revs = revs+w;
	    	}
	      return revs;
	    };
	    System.out.println("Reverse:"+rs.rev("Welcome"));
	    
	}

}
