import java.util.HashMap;

public class AgenteFactory implements AbstractFactory {
    private Agente miAgente;
    private static agenteFactory;
    private static boolean allowInstance;
    public Agente crearAgente() {
        return miAgente=new Agente();
    }
    public AgenteFactory AgenteFactory(){
        if(!allowInstance){
            System.out.print("Debes usar getInstance()");
        }else{
            System.out.print("Se inicializó una instancia de AgenteFactory");
        }
    }
    public static AgenteFactory getInstanceAgenteFactory() {
        if (agenteFactory == null) {
            allowInstance = true;
            agenteFactory = new AgenteFactory();
            allowInstance = false;
        } else {
            System.out.println("Se retorna la instancia existente");
        }
        return agenteFactory;
    }
}
