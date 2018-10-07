public interface AbstractFactory {

    public abstract Agente crearAgente();
    public abstract Artista crearArtista();
    public abstract boolean borrarArtista(Artista artistaABorrar);
    public abstract boolean borrarAgente(Agente agenteABorrar);
}
