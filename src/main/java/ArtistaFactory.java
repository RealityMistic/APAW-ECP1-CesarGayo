import java.util.HashMap;

public class ArtistaFactory extends AbstractFactory {
    private HashMap<Integer, Profesional> misArtistas;

    public void ArtistaFactory(){
        if(!allowInstance){
            System.out.print("Debes usar getInstance()");
        }else{
            abstractFactory = new ArtistaFactory();
            System.out.print("Se inicializó una instancia de ArtistaFactory");
            allowInstance = false;
        }
    }

    public boolean buscarArtista(int idArtista){
        if ( misArtistas.get(idArtista) != null)
            return true;
        else return false;
    }


    public Profesional crear(int suId, String suNombre, String suPseudonimo) {

        misArtistas.put(suId, new ArtistaBuilder(suId,
                                        suNombre,
                                        suPseudonimo,
                                        false,
                                        AgenteFactory.
                                                getInstanceFactory().
                                                crear(1, "Pepe Camarón", "El Camarao"))
                                        .buildArtista()
        );
        return misArtistas.get(suId);
    }
    public boolean borrar(int suId){
        if (misArtistas.containsKey(suId)){
            misArtistas.remove(suId);
            return true;
        }
        else return false;
    }
}
