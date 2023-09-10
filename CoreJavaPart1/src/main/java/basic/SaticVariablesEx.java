package basic;
class Emp{
	static int empNo;
	static String empName;
	static int empAge;
	
}
public class SaticVariablesEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Emp.empNo=10;
        Emp.empName="Siddhi";
        Emp.empAge=25;
        System.out.println("Employee number :"+Emp.empNo);
        System.out.println("Employee Name :"+Emp.empName);
        System.out.println("Employee Age :"+Emp.empAge);

        
        
	}

}
