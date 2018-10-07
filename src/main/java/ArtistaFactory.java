import java.util.HashMap;

public class ArtistaFactory implements AbstractFactory {
    private HashMap<Integer, Artista> misArtistas;
    private static ArtistaFactory;
    private static boolean allowInstance;

    public ArtistaFactory ArtistaFactory(){
        if(!allowInstance){
            System.out.print("Debes usar getInstance()");
        }else{
            System.out.print("Se inicializó una instancia de ArtistaFactory");
        }
    }

    public boolean buscarArtista(int idArtista){
        if ( misArtistas.get(idArtista != null){
            return true;
        }
        else return false;
    }

    public static ArtistaFactory getInstanceArtistaFactory(int idArtista) {
        if (buscarArtista(idArtista) {
            allowInstance = true;
            ArtistaFactory = new ArtistaFactory();
            allowInstance = false;
        } else {
            System.out.println("Se retorna la instancia existente");
        }
        return ArtistaFactory;
    }

    public Artista crearArtista(int suId, String suNombre, String suPseudonimo, Boolean esAnonimo, Agente suAgente) {
        misArtistas.put(suId, new Artista(suId, suNombre, suPseudonimo, esAnonimo, suAgente) );
    }
}
