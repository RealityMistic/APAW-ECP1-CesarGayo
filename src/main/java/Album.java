import java.time.LocalDateTime;

public class Album {
    LocalDateTime fechaLanzamiento;
    GeneroMusical generoMusical;

    public GeneroMusical getGeneroMusical() {
        return generoMusical;
    }

    public void setGeneroMusical(GeneroMusical generoMusical) {
        this.generoMusical = generoMusical;
    }

    public LocalDateTime getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(LocalDateTime fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }
}
