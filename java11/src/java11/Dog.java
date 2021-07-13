package java11;

public class Dog {
int age = 10 ;
int leg = 4 ;
void speak() {
	System.out.println("Dog can bark");
}
void eat() {
	System.out.println("Dog eats meat");
}
public static void main(String[] args) {
	Dog d = new Dog();
	System.out.println(d.age);
	d.speak();
}
}
