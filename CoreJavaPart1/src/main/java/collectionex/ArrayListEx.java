package collectionex;
import java.util.ArrayList;

public class ArrayListEx {


	public static void main(String[] args) {
         ArrayList<String> al=new ArrayList<>();
         al.add("Rutika");
         al.add("Pragati");
         al.add("Lekha");
         al.add("Siddhi");
         al.add("Angel");
         al.add( 1," Shweta");
         al.add(4,null);
         al.add("Rutika");
         al.add(null);
         System.out.println("My arraylist:"+al);
         al.remove (3);
         System.out.println("My arraylist:"+al);
         System.out.println("First Position :"+al.get(1));
         al.set(2, "Neha");
         System.out.println("My arraylist:"+al.size());
         System.out.println("My arraylist:"+al);
        ArrayList<String> all=new ArrayList<>();
         all.addAll(al);
         System.out.println("My arraylist1:"+all);
         ArrayList<Float>af=new ArrayList<>();
         af.add(1.2f);
         System.out.println("My arrylist1:"+af);
         


         
		
        	 
	}

}
