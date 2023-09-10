package SingleObject;

public class SingleObject {
	//create n object of SingleObject
	private static SingleObject instance =new SingleObject();
	//make the constructor private so that this class cannot be
	//instantaited
	private SingleObject() {}
	//get the only object available
	public static SingleObject getInstance() {
		return instance;
	}
    public void showMessage(){
    System.out.println("Hellow World");
    }
}