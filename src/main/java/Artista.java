import java.util.ArrayList;

public class Artista extends Profesional {
    int idArtista;
    Boolean anonimo;
    Agente suAgente;
    AgenteFactory agenteFactory;
    ArrayList<Album> susAlbumes;

    public Artista(int idArtista, String nombre, String pseudonimo, Boolean anonimo, Agente suAgente) {
        this.idArtista = idArtista;
        this.nombre = nombre;
        this.pseudonimo = pseudonimo;
        this.anonimo = anonimo;
        this.suAgente = suAgente;
    }

    public int getIdArtista() {
        return idArtista;
    }

    public Agente getSuAgente(){
        if (suAgente == null){
            agenteFactory = new AgenteFactory();
            suAgente = agenteFactory.crear(1, "Pepe Camarón", "121212");
        }
        return (Agente) suAgente;
    }

    public void setIdArtista(int idArtista) {
        this.idArtista = idArtista;
    }

    public ArrayList<Album> getSusAlbumes() {
        return susAlbumes;
    }

    public void setSusAlbumes(ArrayList<Album> susAlbumes) {
        this.susAlbumes = susAlbumes;
    }

    public Boolean getAnonimo() {
        return anonimo;
    }

    public void setAnonimo(Boolean anonimo) {
        this.anonimo = anonimo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPseudonimo() {
        return pseudonimo;
    }

    public void setPseudonimo(String pseudonimo) {
        this.pseudonimo = pseudonimo;
    }
}
