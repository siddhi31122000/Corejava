package basic;



public class Source{
	interface StringSpacing{
	      insertSpace(String str);
	}
	public class Space {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	             insertSpace(String str){
	            	 for(int i=0;i<str.length();i++) {
	            		 char c=str.charAt(i);
	            		 System.out.print(c+" "); 
	            	 }
	            return str;
	             };
	             Str.Space("Capgemini");
	             
		}

	}

}
