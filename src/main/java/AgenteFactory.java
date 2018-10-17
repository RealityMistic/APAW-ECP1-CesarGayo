import java.util.HashMap;

public class AgenteFactory extends AbstractFactory {
    private static HashMap<Integer, Profesional> misAgentes;


    public void AgenteFactory(){
        if(!allowInstance){
            System.out.print("Debes usar getInstance()");
        }else{
            abstractFactory = new AgenteFactory();
            System.out.print("Se inicializó una instancia de AgenteFactory");
            allowInstance = false;
        }
    }

    public Profesional crear(int suId, String suNombre, String suPseudonimo) {
        misAgentes.put(suId, (Profesional) new Agente(suId, suNombre, suPseudonimo) );
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
