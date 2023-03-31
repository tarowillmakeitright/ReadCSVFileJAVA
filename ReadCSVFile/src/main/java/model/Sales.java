package model;

import java.io.Serializable;

public class Sales implements Serializable {
	private String year;
	private String salesA;
	private String salesB;

	public Sales() {
	}

	public Sales(String year, String salesA, String salesB) {
		this.year = year;
		this.salesA = salesA;
		this.salesB = salesB;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getSalesA() {
		return salesA;
	}

	public void setSalesA(String salesA) {
		this.salesA = salesA;
	}

	public String getSalesB() {
		return salesB;
	}

	public void setSalesB(String salesB) {
		this.salesB = salesB;
	}
}