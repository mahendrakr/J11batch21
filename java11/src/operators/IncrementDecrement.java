package operators;

public class IncrementDecrement {
public static void main(String[] args) {
	int a = 10;
	System.out.println(a++ +a + a-- -a-- +a++);
	int y = 10;
	y= y++ +y-- +y+ ++y- --y+ ++y;
	System.out.println(y);
}
}
