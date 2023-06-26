package n3e1;

public class Generic {
	
	public Generic() {
		
	}
	
	public <U extends Smartphone & Telephone> void call(U u) {
		System.out.println("Calling from Generic Method.");
	}
	
	public <U extends Smartphone> void takePhoto(U u) {
		System.out.println("Taking a photo from Generic Method.");
	}

}
/*To do this exercise you need an interface called Telephone 
 * and three classes: Smartphone, Generic and Principal.

The Telephone interface must have a method called call(). 
The Smartphone class must implement Telephone, and in addition 
to the call() method, it must also have the makePhotos() method.

The Generic class must have two generic methods, the first must 
receive an argument type limited by the Telephone interface and 
the second must receive an argument limited by the Smartphone class.
 From these two methods, call the relevant Telephone and Smartphone 
 methods. In the main() of the Main class, an object of the Smartphone 
 class is passed to the two generic methods of the Generic class.

Can the method bounded by the Phone interface, of the Generic class, 
call the makePhotos() method?
 * 
 */
