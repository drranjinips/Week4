
public class UnderstandingStatic {
	static int a=3;
	static int b=4;
	static void method(int x) {
		System.out.println("a is   " + a);
		System.out.println("b is   " + b);
		System.out.println(a*5);
			}
	static {
		//b=a*4;
	}
	public static void main(String[] args) {
		method(42);

	}

}
