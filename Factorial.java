
public class Factorial {
	int i;
	
	int result;
	int cal(int n) {
		if (n==1) return 1;
		result=cal(n-1)*n;
		return result;
		
		
	}
	public static void main(String[] args) {
		Factorial object1= new Factorial();
		System.out.println(object1.cal(3));
		System.out.println(object1.cal(6));
	}

}
