package serialization;
import java.io.FileInputStream;


public class DeserializeDemo {

	public static void main(String[] args) { throws IOException,ClassNotFoundException;
		{
		new Employee e=null;
		FileInputStream fis=new FileStream("emp.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		e=(Employee) ois.readObject();
		System.out.println("Desirialiaztion object.");
		System.out.println("name:"+e.name);
		System.out.println("Id:"+e.id);
		e.displayEmployee();
		ois.close();
		fis.close();
		
		}

	}

}
