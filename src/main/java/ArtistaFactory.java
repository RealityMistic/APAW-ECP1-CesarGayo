import java.util.HashMap;

public class ArtistaFactory extends AbstractFactory {
    private HashMap<Integer, Artista> misArtistas;
    private static ArtistaFactory artistaFactory;
    private static boolean allowInstance;

    public void ArtistaFactory(){
        if(!allowInstance){
            System.out.print("Debes usar getInstance()");
        }else{
            System.out.print("Se inicializó una instancia de ArtistaFactory");
        }
    }

    public boolean buscarArtista(int idArtista){
        if ( misArtistas.get(idArtista) != null)
            return true;
        else return false;
    }

    public ArtistaFactory getInstanceArtistaFactory(int idArtista) {
        if (buscarArtista(idArtista)){
            allowInstance = true;
            artistaFactory = new ArtistaFactory();
            allowInstance = false;
        } else {
            System.out.println("Se retorna la instancia existente");
        }
        return artistaFactory;
    }

    public Profesional crear(int suId, String suNombre, String suPseudonimo) {
        misArtistas.put(suId, new Artista(suId,
                                        suNombre,
                                        suPseudonimo,
                                        false,
                                        new Agente(1, "Pepe Camarón", "1212") )
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
