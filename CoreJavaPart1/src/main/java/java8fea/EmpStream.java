package java8fea;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmpStream {

	public static void main(String[] args) {
		ArrayList<Emp> al = new ArrayList<> ();
		al.add(new Emp(1,"Siddhi","Manager",23000));
		al.add(new Emp(2,"Akshu","T1",24000));
		al.add(new Emp(3,"Munna","Devr",32000));
		al.add(new Emp(4,"Pooja","Trainer",23000));
		al.add(new Emp(3,"Munna" ,"Dev",31000));
		
		Emp e1 =new Emp ();
		e1.setEid(10);
		e1.setEname("Priya");
		e1.setDesignation("Devops");
		e1.setSalary(23000);
		e1.add(e1);
		Emp e2=new Emp ();
		e2=new Emp();
		e2.setEid(11);;
		e2.setEname("Aksh");
		e2.setDesignation("Devops");
		
		

	}

}
