package controlstatment;

public class ReverseNum {

	public static void main(String[] args) {
		int number=12345678, reverse=0;
		while(number!=0) {	
			int reminder =number%10;
			reverse=reverse*10+reminder;
			number=number/10;
		}
       System.out.println("The reverse of the given number:"+reverse);
	}

}