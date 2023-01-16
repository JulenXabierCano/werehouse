package classes;
public class Vino extends Articulo {
	private String color;
	private String origen;
	private String anio;
	private String tipoUva;
	private double gradosAlcohol;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getAnio() {
		return anio;
	}

	public void setAnio(String anio) {
		this.anio = anio;
	}

	public String getTipoUva() {
		return tipoUva;
	}

	public void setTipoUva(String tipoUva) {
		this.tipoUva = tipoUva;
	}

	public double getGradosAlcohol() {
		return gradosAlcohol;
	}

	public void setGradosAlcohol(double gradosAlcohol) {
		this.gradosAlcohol = gradosAlcohol;
	}

	public boolean saludable() {
		if (gradosAlcohol>13) return false; else return true;
	}
}
