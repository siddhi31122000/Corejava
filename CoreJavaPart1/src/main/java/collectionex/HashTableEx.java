package collectionex;


import java.util.Hashtable;


public class HashTableEx {

	
	public static void main(String[] args) {
		Hashtable<String, String> hash_table = new Hashtable();//creating
		hash_table.put("1", "Monday");
		hash_table.put("2", "Tuesday");
		hash_table.put("3", "Wednesday");
		hash_table.put("4", "Thusday");
		hash_table.put("5", "Frinday");
		hash_table.put("6", "Saturday");
		hash_table.put("7", "sunday");
		System.out.println(hash_table);
		
 }

}
