package controlFlow;

public class CampusEligibility {
	public boolean isEligible (Student s) {
		if(s.getTenthPercentage()>=60) {
			if(s.getTwelthPercentage()>=60) {
				if(s.getbTechPercentage()>=60) {
					if(s.isHasBackLogs()==false) {
						return true;
					}
					else {
						return false;
					}
				}
				else {
					return false;
				}
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}
}
