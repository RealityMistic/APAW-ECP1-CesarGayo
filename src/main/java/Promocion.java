import java.time.LocalDateTime;

public class Promocion {
    int idPromocion;
    LocalDateTime momentoPromocion;
    String local;
    String ciudad;

    public Promocion(int idPromocion, LocalDateTime momentoPromocion,  String local, String ciudad) {
        this.momentoPromocion = momentoPromocion;
        this.idPromocion = idPromocion;
        this.local = local;
        this.ciudad = ciudad;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
}
