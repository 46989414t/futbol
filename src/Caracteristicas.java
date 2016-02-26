/**
 * Created by 46989414t on 26/02/16.
 */
public class Caracteristicas {
    private byte agilidad;
    private byte fuerza;
    private byte velocidad;
    private byte pase;
    private byte penalty;

    public Caracteristicas() {
    }

    public Caracteristicas(byte agilidad, byte fuerza, byte velocidad, byte pase, byte penalty) {
        this.agilidad = agilidad;
        this.fuerza = fuerza;
        this.velocidad = velocidad;
        this.pase = pase;
        this.penalty = penalty;
    }

    public byte getAgilidad() {
        return agilidad;
    }

    public void setAgilidad(byte agilidad) {
        this.agilidad = agilidad;
    }

    public byte getFuerza() {
        return fuerza;
    }

    public void setFuerza(byte fuerza) {
        this.fuerza = fuerza;
    }

    public byte getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(byte velocidad) {
        this.velocidad = velocidad;
    }

    public byte getPase() {
        return pase;
    }

    public void setPase(byte pase) {
        this.pase = pase;
    }

    public byte getPenalty() {
        return penalty;
    }

    public void setPenalty(byte penalty) {
        this.penalty = penalty;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Caracteristicas{" +
                "agilidad=" + agilidad +
                ", fuerza=" + fuerza +
                ", velocidad=" + velocidad +
                ", pase=" + pase +
                ", penalty=" + penalty +
                '}';
    }
}
