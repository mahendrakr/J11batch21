package controlFlow;

public class Test {

	public static void main(String[] args) {
		Student s1 = new Student("shreya", 90, 95, 70, false);		
		Student s2 = new Student("aadi", 90, 90, 50, false);	
		CampusEligibility ce = new CampusEligibility();
		boolean r1 = ce.isEligible(s2);
		if(r1) {
			System.out.println(s2.getName() + " is eligible");
		}
		else {
			System.out.println(s2.getName() + " is not eligible");
		}
	}

}
