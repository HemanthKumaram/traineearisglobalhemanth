

public class Emp1 {
	public static void main(String[] args) {
		Emp employee1= new Emp("abc",123,"9876",20000,"CS","Male"); 
		Emp employee2= new Emp("def",124,"7654",22000,"EC","Female");
		Emp employee3= new Emp("xyz",125,"7974",25000,"CS","Male");
		employee1.show(); 
		employee2.show(); 
		employee3.show(); 
		double com3=employee3.print(5.0);
		double com2=employee2.print(5.0);
		double com1=employee1.print(5.0);
		System.out.println(employee1.salary+com1);
		System.out.println(employee2.salary+com2);
		System.out.println(employee3.salary+com3);
		}
	}