/**
 * Created by 46989414t on 26/02/16.
 */
public class Equipo {
    private String nombre;
    private String estadio;

    public Equipo() {
    }

    public Equipo(String nombre, String estadio) {
        this.nombre = nombre;
        this.estadio = estadio;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
