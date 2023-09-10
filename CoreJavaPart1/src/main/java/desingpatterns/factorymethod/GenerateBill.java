package desingpatterns.factorymethod;
import java.io.BufferedReader;
import java.sql.SQLOutput;

import javax.sql.rowset.serial.SQLOutputImpl;



public class GenerateBill {

	
	
	
	
	public static void main (String[] args) throws IOException {
       GetPlanFactory gpf =new GetPlamFactory();
      BuffereadReader br=new BufferedReadre(new InputStreamReader(System.in));
      System.out.println("\"Enter the name of plan for which the bill will be generated:");
      String planNmae=br.readLine();
      System.out.println("Enter the Number of units for bill will be calculated:");
      int units=Integer.parseInt(br.readLine());
      Plan p= gpf.getPlan(planName) ;
      System.out.println("Bill amount for "+planName+"of"+units+" units is:" );
      p.getRate();
      p.calculateBill(units);
      
                 
     
	}
f