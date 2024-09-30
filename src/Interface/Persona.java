package Interface;

public class Persona {

    private String nombre;
    private String hora;
    private String valor;

    public Persona( String nombre, String hora, String valor) {

        this.nombre = nombre;
        this.hora = hora;
        this.valor = valor;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}
