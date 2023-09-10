package serialization;
import java.io.FileOutputSream;


public class SerializeDemo {

public static void main(String[] args) throws  IOException {
  Employee e = new Employee();
  e.id = 4567;
  e.name="Sharley";
  FileOutputtream fos=new FileOutputStream("emp.txt");
  ObjectOutputStream oos=new ObjectOutputStream(fos);
  oos.writeObject(e);
  System.out.println("data inserted in file");
  oos.closr();
  
  


 }
}

	