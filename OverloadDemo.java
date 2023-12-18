package underStanding;

public class OverloadDemo {

	public static void main(String[] args) {
		Box mybox1=new Box(10,20,30);
		Box mybox2=new Box(10);
		Box cube= new Box(3);
		Box noarg=new Box();
		System.out.println("Using Parameter - constructor " + mybox1.volume());
		System.out.println("Using one Parameter - constructor " + mybox2.volume());
		System.out.println("Using Parameter-Cube  - constructor " + mybox1.volume());
		System.out.println("Using no arg  - constructor " + noarg.volume());
		//Next demonstrate how we pass object as parameter
		Box copy= new Box(mybox1); // Created a copy of mybox1 object
		
		Box mybox3= new Box(mybox1); /* Created a box object by passing an object through 
		the constructor*/
		System.out.println("By passing object through constructor " + mybox3.volume());
		
	}

}
