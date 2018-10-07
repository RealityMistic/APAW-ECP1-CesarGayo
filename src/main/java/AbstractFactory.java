public interface AbstractFactory {
    ArtistaFactory artistaFactory;
    AgenteFactory agenteFactory;

    public abstract Agente crearAgente();
    public abstract Artista crearArtista(){

    }
}
