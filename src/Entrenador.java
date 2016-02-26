/**
 * Created by 46989414t on 26/02/16.
 */
public class Entrenador {
    private String nombre;
    private byte experiencia;

    public Entrenador() {
    }

    public Entrenador(String nombre, byte experiencia) {
        this.nombre = nombre;
        this.experiencia = experiencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public byte getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(byte experiencia) {
        this.experiencia = experiencia;
    }
}
