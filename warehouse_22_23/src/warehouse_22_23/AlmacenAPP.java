package warehouse_22_23;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import classes.*;

public class AlmacenAPP {
	public void run() throws FileNotFoundException {
		Almacen almacen = new Almacen();
		ArrayList<Articulo> datos = (ArrayList<Articulo>) almacen.cargarDatos();

		final int REALIZAR_VENTA = 1;
		final int REALIZAR_COMPRA = 2;
		final int VER_ART_SALUDABLES = 3;
		final int VER_ART_MAS_CARO = 4;
		final int VER_ART_MENOS_STOCK_10 = 5;
		final int SALIR = 0;
		int opcion_menu;
		do {
			opcion_menu = Integer.parseInt(JOptionPane.showInputDialog(null,
					"------MENU-------\n" + REALIZAR_VENTA + ". Realizar Venta\n" + REALIZAR_COMPRA
							+ ". Realizar Compra\n" + VER_ART_SALUDABLES + ". Articulos Saludables\n" + VER_ART_MAS_CARO
							+ ". Articulos Mas Caros\n" + VER_ART_MENOS_STOCK_10 + ". Comprobar Stock Bajo\n" + SALIR
							+ ". Salir\n" + "Elije una de las opciones"));
			// fin menú
			switch (opcion_menu) {
			case REALIZAR_VENTA:
				int numeroArticulo;
				Factura factura = new Factura();
				LineaFactura linea = new LineaFactura();

				numeroArticulo = Integer.parseInt(
						JOptionPane.showInputDialog(null, "Introduzca número del artículo a añadir a la factura"));

				break;
			case REALIZAR_COMPRA:
				JOptionPane.showMessageDialog(null, "compra");
				break;
			case VER_ART_SALUDABLES:
				String listaSaludables = "Articulos saludables:\n";
				for (int i = 0; i < datos.size(); i++) {
					if (datos.get(i).saludable())
						listaSaludables += datos.get(i).getCodigo() + " - " + datos.get(i).getNombre() + " - "
								+ datos.get(i).getMarca() + "\n ";
				}
				JOptionPane.showMessageDialog(null, listaSaludables);
				break;
			case VER_ART_MAS_CARO:
				String articuloMasCaro = "El articulo más caro es:\n";
				int caro = 0;
				for (int i = 1; i < datos.size(); i++) {
					if (datos.get(i).getPrecio() > datos.get(caro).getPrecio()) {
						caro = i;
					}
				}

				articuloMasCaro += datos.get(caro).getCodigo() + " - " + datos.get(caro).getNombre() + " - "
						+ datos.get(caro).getMarca() + " - " + datos.get(caro).getPrecio() + "€";
				JOptionPane.showMessageDialog(null, articuloMasCaro);
				break;
			case VER_ART_MENOS_STOCK_10:
				ArrayList<Articulo> menor_10 = almacen.stockJusto(datos);
				String lista = "Articulos a Pedir:\n";
				for (int i = 0; i < menor_10.size(); i++) {
					if (menor_10.get(i).getStock() <= 10) {
						lista += menor_10.get(i).getCodigo() + " - " + menor_10.get(i).getNombre() + " - "
								+ menor_10.get(i).getMarca() + " - " + menor_10.get(i).getStock() + "\n";
					}
				}
				JOptionPane.showMessageDialog(null, lista);
				break;
			case SALIR:
				JOptionPane.showMessageDialog(null, "Adios");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opcion incorrecta");
			}
		} while (opcion_menu != SALIR);
	}
}
