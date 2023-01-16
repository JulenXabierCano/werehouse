package classes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Almacen {
	public ArrayList<Articulo> cargarDatos() throws FileNotFoundException {
		ArrayList<Articulo> datos = new ArrayList<Articulo>();

		String[] linea;

		File file = new File("src/data/julen_werehouse.txt");
		Scanner scan = new Scanner(file);

		int i = 0;
		while (scan.hasNextLine()) {
			linea = scan.nextLine().split(":");
			switch (linea[1]) {
			case "vino":
				Vino vino = new Vino();
				vino.setCodigo(linea[0]);
				vino.setNombre(linea[1]);
				vino.setMarca(linea[2]);
				vino.setCapacidadBotella(Integer.parseInt(linea[3]));
				vino.setPrecio(Double.parseDouble(linea[4]));
				vino.setStock(Integer.parseInt(linea[5]));

				vino.setColor(linea[6]);
				vino.setOrigen(linea[7]);
				vino.setAnio(linea[8]);
				vino.setTipoUva(linea[9]);
				vino.setGradosAlcohol(Double.parseDouble(linea[10]));

				datos.add(vino);
				break;//

			case "refresco":
				Refresco refresco = new Refresco();
				refresco.setCodigo(linea[0]);
				refresco.setNombre(linea[1]);
				refresco.setMarca(linea[2]);
				refresco.setCapacidadBotella(Integer.parseInt(linea[3]));
				refresco.setPrecio(Double.parseDouble(linea[4]));
				refresco.setStock(Integer.parseInt(linea[5]));

				refresco.setSabor(linea[6]);
				refresco.setZumo(Boolean.parseBoolean(linea[7]));
				refresco.setGaseoso(Boolean.parseBoolean(linea[8]));
				refresco.setCantidadAzucar(Integer.parseInt(linea[9]));

				datos.add(refresco);
				break;//

			case "cerveza":
				Cerveza cerveza = new Cerveza();
				cerveza.setCodigo(linea[0]);
				cerveza.setNombre(linea[1]);
				cerveza.setMarca(linea[2]);
				cerveza.setCapacidadBotella(Integer.parseInt(linea[3]));
				cerveza.setPrecio(Double.parseDouble(linea[4]));
				cerveza.setStock(Integer.parseInt(linea[5]));

				cerveza.setOrigen(linea[6]);
				cerveza.setGradosAlcohol(Double.parseDouble(linea[7]));
				cerveza.setCereales(linea[8].split("/"));

				datos.add(cerveza);
				break;//
			}
		}
		scan.close();
		return datos;
	}

	public void elMasCaro() {

	}

	public double precios(String codigoProducto) {
		double precio = 0;

		return precio;
	}

	public boolean hayEnStock(String codigoProducto) {
		boolean hay = false;

		return hay;
	}

	public ArrayList<Articulo> stockJusto(ArrayList<Articulo> datos) {
		ArrayList<Articulo> menor_10 = new ArrayList<Articulo>();
		for (int i = 0; i < datos.size(); i++) {
			if (datos.get(i).getStock() <= 10) {
				menor_10.add(datos.get(i));
			}
		}
		return menor_10;
	}

	public void articulo(String codigoProducto) {

	}

	public boolean disponibilidad(int cantidad, String codigoProducto) {
		return false;
	}

	public ArrayList equivalentes(Articulo articulo) {
		ArrayList random = new ArrayList();
		return random;
	}

	public ArrayList ordenarPorPrecio(String orden) {
		ArrayList random = new ArrayList();
		return random;
	}

	public void ordenarPorStock(String orden) {

	}
}
