package SingleObject;

public class SingleonOatternDemo {

	public static void main (String[] args) {
		///  illegal construct
		//Complie Time Error: The constructor SingleObject( is not visible
		//SingleObject object = new SingleObject();
		//get the only object available
		
		SingleObject object =SingleObject.getInstance();
		//show the message
		object.showMessage();
		
		
	}
}
