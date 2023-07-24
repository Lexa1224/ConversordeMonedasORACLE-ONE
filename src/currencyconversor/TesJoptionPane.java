package currencyconversor;

import javax.swing.JOptionPane;

public class TesJoptionPane {


	    public static void main(String[] args) {
	        mostrarListaDesplegable();
	    }

	    public static void mostrarListaDesplegable() {
	        String[] opciones = { "Opción 1", "Opción 2", "Opción 3", "Cancelar" };
	        
	        String seleccion = (String) JOptionPane.showInputDialog(
	            null,
	            "Selecciona una opción:",
	            "Lista Desplegable",
	            JOptionPane.PLAIN_MESSAGE,
	            null,
	            opciones,
	            opciones[0]
	        );

	        // Procesar la selección del usuario
	        if (seleccion != null) {
	            switch (seleccion) {
	                case "Opción 1":
	                    JOptionPane.showMessageDialog(null, "Seleccionaste la Opción 1");
	                    mostrarListaDesplegable(); // Vuelve a mostrar la lista desplegable
	                    break;
	                case "Opción 2":
	                    JOptionPane.showMessageDialog(null, "Seleccionaste la Opción 2");
	                    mostrarListaDesplegable();
	                    break;
	                case "Opción 3":
	                    JOptionPane.showMessageDialog(null, "Seleccionaste la Opción 3");
	                    mostrarListaDesplegable();
	                    break;
	                default:
	                    JOptionPane.showMessageDialog(null, "Hasta luego.");
	                    break;
	            }
	        } else {
	            JOptionPane.showMessageDialog(null, "Operación cancelada.");
	        }
	    }
	}


