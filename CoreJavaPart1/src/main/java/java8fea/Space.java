package java8fea;

interface StringSpacing{
      String Space(String str);
}
public class Space {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             StringSpacing S=(String str)->{
            	 for(int i=0;i<str.length();i++) {
            		 char c =str.charAt(i);
            		 System.out.print(c+" "); 
            	 }
            return str;
             };
             S.Space("Capgemini");
             
	}

}
