package thread;

class ThreadOne extends Thread{
	public void run() {
		System.out.println("Thread1");
		for(int i=0;i<5;i++) {
		System.out.println(i);
		}
		
	}
}
class Threadtwo extends Thread {
	public void run() {
	System.out.println("Thread2");
	for (int i=11;i<=15;i++) {
		System.out.println(i);
	}
  }
}
public class ThreadUsingInheritance {

	public static void main(String[] args) {
     ThreadOne =new ThreadOne();
     t1.start();
     Threadtwo t1=new Threadtwo();
     t2.start();
     

}
}