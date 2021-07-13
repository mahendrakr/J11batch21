package java11;

public class Cat {
int age = 6 ;
int eyes = 2 ;
void speak() {
	System.out.println("Cat meow's ");
}
void eat() {
	System.out.println("cat eats fish");
}
public static void main(String[] args) {
	Cat c = new Cat();
	System.out.println(c.eyes);
	c.speak();
}
}