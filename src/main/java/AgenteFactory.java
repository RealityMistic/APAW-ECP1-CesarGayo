import java.util.HashMap;

public class AgenteFactory extends AbstractFactory {
    private HashMap<Integer, Agente> misAgentes;
    private static AgenteFactory agenteFactory;
    private static boolean allowInstance;

    public void AgenteFactory(){
        if(!allowInstance){
            System.out.print("Debes usar getInstance()");
        }else{
            System.out.print("Se inicializó una instancia de AgenteFactory");
        }
    }
    public static AgenteFactory getInstanceAgenteFactory() {

        if ( agenteFactory == null) {
            allowInstance = true;
            agenteFactory = new AgenteFactory();
            allowInstance = false;
        } else {
            System.out.println("Se retorna la instancia existente");
        }
        return agenteFactory;
    }
    public Agente crear(int suId, String suNombre, String suPseudonimo) {
        misAgentes.put(suId, new Agente(suId, suNombre, suPseudonimo) );
        return misAgentes.get(suId);
    }

    public boolean borrar(int suId){
        if (misAgentes.containsKey(suId)){
            misAgentes.remove(suId);
            return true;
        }
        else return false;
    }
}
