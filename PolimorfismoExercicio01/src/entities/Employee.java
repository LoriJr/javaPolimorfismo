package entities;

public class Employee {
	
	private String name;
	protected Integer hours;
	protected double valuePerHour;
	
	public Employee(){
		super();
	}

	public Employee(String name, Integer hours, double valuePerHour) {
		super();
		this.name = name;
		this.hours = hours;
		this.valuePerHour = valuePerHour;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getHours() {
		return hours;
	}	

	public double getValuePerHour() {
		return valuePerHour;
	}

	public double payment() {
		 return hours * valuePerHour;		
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(name + " - $ ");
		sb.append(String.format("%.2f" + payment()));
		
		
		
		
		return sb.toString();
		}

	
	
	

}
