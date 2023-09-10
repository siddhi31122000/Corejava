package basic;

public class Marksheet {
	
	
//     string calculateGrade(int marks) {
	String calmark(int marks) {
		   if (marks >=90 && marks <=100) {
			   System.out.println("A+");
    } else if (marks >=76 && marks <89) {
       return"A";
    } else if (marks >=66 && marks <75) {
		return"B+";
    } else if (marks >=50 && marks <65) {  
    	return"B";
    }else {
    	return "fail";
    }
		   return null;
		}
        public static void main(String[] args) {
        	Marksheet m=new Marksheet();
        	m.calmark(98);
        	//.calculateGrade(67);
        	
		

	
      
        }
}