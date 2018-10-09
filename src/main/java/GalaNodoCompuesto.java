import java.time.LocalDateTime;
import java.util.HashMap;

public class GalaNodoCompuesto extends PromocionComponent {
    String cadena;
    String nombreGala;
    HashMap<Integer, PromocionComponent> Composite;


    public GalaNodoCompuesto(int idPromocion,
                             LocalDateTime momentoPromocion,
                             String local,
                             String ciudad,
                             String cadena,
                             String nombreGala,
                             HashMap<Integer, PromocionComponent> composite) {
        super(idPromocion, momentoPromocion, local, ciudad);
        this.cadena = cadena;
        this.nombreGala = nombreGala;
        Composite = composite;
    }

    public void view (){
        System.out.println(nombreGala);
    }

    public boolean isComposite(){
        if (Composite.isEmpty())
            return false;
        else
            return true;
    }


    public void addPromocion(int idPromocion, PromocionComponent promocion){
        Composite.put(idPromocion, promocion);
    }

    public boolean remove(int idPromocion){
        if (Composite.containsKey(idPromocion)) {
            Composite.remove(idPromocion);
            return true;
        }
        else return false;
    }
}
