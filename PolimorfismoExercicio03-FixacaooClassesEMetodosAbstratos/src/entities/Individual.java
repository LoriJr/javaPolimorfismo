package entities;


public class Individual extends TaxPayer {
	private double healthExpenditues;

	public Individual() {
		super();
	}

	public Individual(String name, double anualIncome, double healthExpenditues) {
		super(name, anualIncome);
		this.healthExpenditues = healthExpenditues;
	}

	public double getHealthExpenditues() {
		return healthExpenditues;
	}

	public void setHealthExpenditues(double healthExpenditues) {
		this.healthExpenditues = healthExpenditues;
	}

	@Override
	public double tax() {

		if (anualIncome >= 20000.00 && healthExpenditues > 1) {
			double tx = (anualIncome * 0.25) - (healthExpenditues * 0.5);
			return tx;
		}
		if (anualIncome < 20000.00 && healthExpenditues > 1) {
			double tx = (anualIncome * 0.15) - (healthExpenditues * 0.5);
			return tx;
		}
		if (anualIncome >= 20000.00 && healthExpenditues == 0) {
			double tx = (anualIncome * 0.25);
			return tx;
		}
		if (anualIncome < 20000.00 && healthExpenditues == 0) {
			double tx = (anualIncome * 0.15);
			return tx;
		}
		return anualIncome;
	}

}
