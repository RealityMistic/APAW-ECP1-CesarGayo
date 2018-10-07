import java.util.HashMap;

public class AgenteFactory implements AbstractFactory {
    private HashMap<Integer, Agente> misAgentes;
    private static AgenteFactory agenteFactory;
    private static boolean allowInstance;

    public AgenteFactory AgenteFactory(){
        if(!allowInstance){
            System.out.print("Debes usar getInstance()");
        }else{
            System.out.print("Se inicializó una instancia de AgenteFactory");
        }
    }
    public static AgenteFactory getInstanceAgenteFactory() {

        if ( agenteFactory == null) {
            allowInstance = true;
            agenteFactory = new AgenteFactory;
            allowInstance = false;
        } else {
            System.out.println("Se retorna la instancia existente");
        }
        return agenteFactory;
    }
    public Artista crearAgente(int suId, String suNombre, String suTelefono) {
        misAgentes.put(suId, new Agente(suId, suNombre, suTelefono) );
    }

    public boolean borrarAgente(int suId){
        if (misAgentes.containsKey(suId)){
            misAgentes.remove(suId);
            return true;
        }
        else return false;
    }
}
