package java11;

public class Student {
int hands = 2 ;
int brain = 1 ;
void dress() {
	System.out.println("students dress tidy");
}
void nature() {
	System.out.println("hard working");
}
public static void main(String[] args) {
	Student s = new Student ();
	System.out.println(s.brain);
	s.nature();
}
}