import Interface.Interfacee;
import Interface.Persona;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;
public  class Main {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Double,Persona> personas=new HashMap<>();
        while (true) {
            try {
                System.out.println("**MENU** \n 1) Crear usuario \n 2) Editar usuario \n 3) Buscar usuario \n 4) Eliminar \n 5) Mostrar usuarios \n 6) Salir");
                int out = sc.nextInt();
                switch (out) {
                    case 1:
                        // Crear usuario
                        Interfacee.crearusuario(personas);
                        break;
                    case 2:
                        // Editar usuario
                        Interfacee.editarusuario(personas);
                        break;
                    case 3:
                        // Buscar usuario
                        Interfacee.buscarusuario(personas);
                        break;
                    case 4:
                        // Eliminar usuario
                        Interfacee.eliminarusuario(personas);
                        break;
                    case 5:
                        // Mostrar todos los usuarios
                        Interfacee.mostrarusuarios(personas);
                        break;
                    case 6:
                        // Salir
                        System.out.println("Saliendo...");
                        sc.close();
                        return; // Termina el programa

                }

            } catch (InputMismatchException e) {
                System.out.println("no es una opcion del menu");
           return;

            }

        }

    }
}