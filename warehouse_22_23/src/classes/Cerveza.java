package classes;

public class Cerveza extends Articulo {
	private String origen;
	private double gradosAlcohol;
	private String[] cereales = new String[2];

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public double getGradosAlcohol() {
		return gradosAlcohol;
	}

	public void setGradosAlcohol(double gradosAlcohol) {
		this.gradosAlcohol = gradosAlcohol;
	}

	public String getCereales() {
		String listaCereales = "";
		listaCereales += cereales[1] + ", " + cereales[2];
		return listaCereales;
	}

	public void setCereales(String[] cereales) {
		this.cereales = cereales;
	}

	public boolean saludable() {
		if (gradosAlcohol>7) return false; else return true;
	}
}
