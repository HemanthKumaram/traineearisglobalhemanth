package training;

public class LocalInner {
private int num=47;

void show() {
class Local{
void display() {
System.out.println("HI");
}
}
Local l=new Local();
l.display();
}
void method2() {
	System.out.println("HI");

}



public static void main(String[] args) {

LocalInner li=new LocalInner();
li.show();
li.method2();
}



}