/**
 * Created by 46989414t on 26/02/16.
 */
public class Liga {
    private String nombre;
    private String categoria;
    private String patrocinador;

    public Liga() {
    }

    public Liga(String nombre, String categoria, String patrocinador) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.patrocinador = patrocinador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getPatrocinador() {
        return patrocinador;
    }

    public void setPatrocinador(String patrocinador) {
        this.patrocinador = patrocinador;
    }
}
