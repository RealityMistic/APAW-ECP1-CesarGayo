public abstract class AbstractFactory {

    public abstract Profesional crear(int suId, String suNombre, String suPseudonimo);
    public abstract boolean borrar(int idProfesionalABorrar);
}
