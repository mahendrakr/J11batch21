package java11;

import java.io.PrintStream;

public class Student {
int hands = 2 ;
int brain = 1 ;
void getDress() {
	System.out.println("students dress tidy");
}
void getNature() {
	System.out.println("hard working");
}
public static void main(String[] args) {
	Student s = new Student ();
	System.out.println(s.brain);
	s.getNature();
	Teacher t = new Teacher();
	PrintStream out = System.out;
	out.print("hello aadi");
	System.out.println("how are you");
	
}
}