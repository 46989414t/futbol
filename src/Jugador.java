/**
 * Created by 46989414t on 26/02/16.
 */
public class Jugador {
    private String DNI;
    private String nombre;
    private String apellido;
    private double altura;
    private Caracteristicas caracteristicas;

    public Jugador() {
    }

    public Jugador(String DNI, String nombre, String apellido, double altura) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.altura = altura;
        caracteristicas = new Caracteristicas();

    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Jugador{" +
                "DNI='" + DNI + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", altura=" + altura +
                '}';
    }
}
