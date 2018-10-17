public abstract class AbstractFactory {
    protected static AbstractFactory abstractFactory;
    protected static boolean allowInstance = true;

    public abstract Profesional crear(int suId, String suNombre, String suPseudonimo);
    public abstract boolean borrar(int idProfesionalABorrar);

    public static AbstractFactory getInstanceFactory(){
        if (allowInstance = false){
            return abstractFactory;
        } else {
            System.out.println("Se debe crear la factoría primero");
            return null;
        }
    }


}
