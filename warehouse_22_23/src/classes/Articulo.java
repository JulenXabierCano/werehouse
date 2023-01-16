package classes;

public abstract class Articulo {
	private String codigo;
	private String nombre;
	private String marca;
	private int capacidadBotella;
	private double precio;
	private int stock;
	
	public void incrementarStock(int sumaStock) {
		
	}
	
	public void restarStock(int restaStock) {
		
	}
	
	public void visualizarArticulo() {
		
	}
	
	public boolean saludable() {		
		return false;
	}
	
	public void precioTotal() {
		
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getCapacidadBotella() {
		return capacidadBotella;
	}

	public void setCapacidadBotella(int capacidadBotella) {
		this.capacidadBotella = capacidadBotella;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
}
