package collectionex;

import java.util.HashSet;

public class HashSet1 {

	public static void main(String[] args) {
	 HashSet<Integer>  even = new HashSet<>();
	 even .add(2);
	 even.add(4);
	 System.out.println("Hashset.1: "+ even);
	 
	 HashSet<Integer> numbers = new HashSet <> ();
	 numbers.add(1);
	 numbers.add(3);
	 System.out.println("HashSet2: " + numbers);
	 
	 //Union of two set
	 numbers.addAll(even);
	 System.out.println("Union is : " + numbers);
	 numbers.retainAll(even);
	 System.out.println("Intersection is: " + numbers);
	 numbers.retainAll(even);
     System.out.println("Diffrence: " + numbers);
}
	}
		
