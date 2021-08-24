package controlFlow;

public class Student {
	public String name;
	public double tenthPercentage;
	public double twelthPercentage;
	public double bTechPercentage;
	public boolean hasBackLogs;
	public Student(String name, double tenthPercentage, double twelthPercentage, double bTechPercentage,
			boolean hasBackLogs) {
		super();
		this.name = name;
		this.tenthPercentage = tenthPercentage;
		this.twelthPercentage = twelthPercentage;
		this.bTechPercentage = bTechPercentage;
		this.hasBackLogs = hasBackLogs;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getTenthPercentage() {
		return tenthPercentage;
	}
	public void setTenthPercentage(double tenthPercentage) {
		this.tenthPercentage = tenthPercentage;
	}
	public double getTwelthPercentage() {
		return twelthPercentage;
	}
	public void setTwelthPercentage(double twelthPercentage) {
		this.twelthPercentage = twelthPercentage;
	}
	public double getbTechPercentage() {
		return bTechPercentage;
	}
	public void setbTechPercentage(double bTechPercentage) {
		this.bTechPercentage = bTechPercentage;
	}
	public boolean isHasBackLogs() {
		return hasBackLogs;
	}
	public void setHasBackLogs(boolean hasBackLogs) {
		this.hasBackLogs = hasBackLogs;
	}
	
}
