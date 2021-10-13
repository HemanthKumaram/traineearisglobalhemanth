


public class Emp {
String name;
int empid;
double salary; 
String department;
String gender;
Address address;
String designation;

Emp(String name,int empid,String contact, int salary,String department, String gender){
this.name=name;
this.empid=empid;
this.salary=salary;
this.department=department;
this.gender=gender;
}
double print(double percentage) {
double commission= percentage/100* salary;
return commission; }
void show() {
System.out.println(name);
System.out.println(empid);
System.out.println(salary);
System.out.println(department);
System.out.println(gender);

} 
}


