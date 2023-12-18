package employee;

public class Employee {
String  ID;
float salary;
Employee(String ID, float salary){
	this.ID=ID;
	this.salary=salary;
}
double raise() {
	return (salary + (salary*(0.3)));
		/*When a float is multipled with int it will convert to float data type. 
	When we pass to println command it will be converted to a byte data type. 
	So we have to narrow down it by prefixing float*/
}
	public static void main(String[] args) {
		Employee obj= new Employee("15",200);
		System.out.println("The salry is " + obj.raise());
	}

}
