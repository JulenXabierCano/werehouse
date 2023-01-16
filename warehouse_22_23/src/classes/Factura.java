package classes;

public class Factura {
	private static int IVA=21;
	private int numeroFactura;
	private String nombreEmpresa;
	private java.sql.Date fecha;
	private String concepto;
	
	public void addLinea(LineaFactura lineaDeFactura) {
		
	}
	
	public void eliminarLinea(int numeroLinea) {
	
	}
	
	public double precioTotal() {
		double precio=0;
		
		return precio;
	}
	
	public void mostrarFacturaEnPantalla() {
		
	}
	
	public void guardarEnFichero() {
		
	}
}
