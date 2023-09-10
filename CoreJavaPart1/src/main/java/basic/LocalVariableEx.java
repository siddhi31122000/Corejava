package basic;

public class LocalVariableEx {

	public void display ()  {
		int empNo=10;
		String empName="siddhi";
		int empAge=22;  
        System.out.println("Employee Number :"+empNo);
        System.out.println("Employee Name :"+empName);
        System.out.println("Employee Ager :"+empAge);
}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
LocalVariableEx emp =new LocalVariableEx();
emp.display();
	}

}
