package ReprodutorMusical;

// Interface que contêm funções para escolher e escutar músicas.
public interface IPod {
    
    public void tocar ();

    public void pausar();

    public void selecionarMusica(String musica);
}
