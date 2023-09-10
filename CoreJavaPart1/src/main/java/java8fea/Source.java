package java8fea;
interface Validate{
	boolean isvalidate(String username,String password);
	
}
public class Source {

		   boolean validate(String username,String passsword) {
			  Validate v =(str1,str2)->{return(str1.equals("ABC")&&str2.equals("DEF"))?true:false;};
				  return v.isvalidate(username,passsword); 
		   }
				public static void main(String[] args) {
					Source s=new Source();
 
			  System.out.println(s.validate("ABC","DEF"));
		   }}
			  
	

	
