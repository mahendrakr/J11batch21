package java11;
import book.Book;
import book.A;
import book.B;
import book.*;
import book.author.Author;
import static book.author.Author.m1;
import static book.author.Author.name;
public class Test {
	

public static void main(String[] args) {
	System.out.println("Welcome to Java11");
//	book.Book b = new book.Book();
	Book b = new Book();
	b.m1();
	A a = new A();
	B b1 = new B();
	Author au = new Author();
	book.author.Author.m1();
	m1();
	String name2 = book.author.Author.name;
	String name1 = name;
	java.lang.System.out.println("hello aadi");
//	System.out.println("hello aadi");
}
}
   