package java11;

public class Animal {
int tail = 2 ;
int ears = 1 ;
void nature() {
	System.out.println("Animals are innocent");
}
void food() {
	System.out.println("some animals eat both herbs and meat where some eat either meat or herbs ");
}
public static void main(String[] args) {
	Animal a  = new Animal();
	System.out.println(a.ears);
	a.food();
}
}
