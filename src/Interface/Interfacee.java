package Interface;

import java.util.*;

public class Interfacee {
    static Scanner sc = new Scanner(System.in);

    public static   AbstractMap<Double, Persona> crearusuario(HashMap<Double, Persona> personas) {

        System.out.println("Ingrece Documento de usuario");
        double doc=sc.nextDouble();
        sc.nextLine();
        System.out.println("Ingrse nombre de usuario");
        String nombre=sc.next();
        System.out.println("Ingrse horas trabajadas por el usuario");
        String hora=sc.next();
        System.out.println("ingrese el valor de la hora ");
        String valor=sc.next();
        List<Persona> personasList=new ArrayList<>();
        Persona persona=new Persona(nombre,hora,valor);
        personas.put(doc,persona);
        return personas;

    }

    public static void editarusuario( HashMap<Double,Persona> personas) {
        System.out.println("ingrese documento del usuario a editar");
        double doc=sc.nextDouble();
        if (personas.containsKey(doc)) {
            System.out.println("que dato desea cambiar? \n 1)nombre \n 2)horas trabajadas \n 3)valor horas");
            int opcion=sc.nextInt();
            switch (opcion){
                case 1: System.out.println("ingrese el nuevo nombre");
                        String n=sc.nextLine();
                        sc.nextLine();
                        personas.get(doc).setNombre( n);
                        System.out.println("nombre cambiado");
                break;
                case 2: System.out.println("ingrese las nuevas horas trabajadas");
                        String h=sc.nextLine();
                        sc.nextLine();
                        personas.get(doc).setHora( h);
                        System.out.println("horas trabajadas cambiado");
                        break;
                        case 3: System.out.println("ingrese el valor de la hora ");
            }

        }else {
            System.out.println("el documento no existe");
        }

    }

    public static void buscarusuario(HashMap<Double, Persona> personas) {

    }

    public static void eliminarusuario(HashMap<Double, Persona> personas) {
    }

    public static void mostrarusuarios(HashMap<Double, Persona> personas) {
    }
}
