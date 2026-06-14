package main;

import modelo.*;
import vista.*;

import java.util.Scanner;

@SuppressWarnings("java:S106")
public class Main {

	private static final String DESPEDIDA = """
	················································································································
	%18s---------->>> Apagando máquina... ¡Hasta la próxima! <<<<<--------------
	················································································································
	""".formatted("");

	public static final Scanner teclado = new Scanner(System.in);

	static void main() {
		
		BaseDeDatos baseDeDatos = new BaseDeDatos();
		int			seleccionPrograma = -1;
		String[]		opcionesMenu = {"Comprar productos", "Administrar máquina expendedora", "Apagar máquina expendedora"};
		
		while (seleccionPrograma != 2) {
			MsgInfo.msgBienvenida();
			teclado.nextLine();
			
			seleccionPrograma = MsgPeticion.menuOpciones("Operaciones disponibles", opcionesMenu, "Seleccione una operación");
			
			if (seleccionPrograma == 0) {
				MenuCliente.ejecutarCliente(baseDeDatos.productos);
				try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			else if (seleccionPrograma == 1) {
				baseDeDatos = MenuAdmin.ejecutarAdmin(baseDeDatos);
			}
			System.out.println("\n".repeat(10));
		}
		
		System.out.println(DESPEDIDA);
		
		teclado.close();
	}	
}
