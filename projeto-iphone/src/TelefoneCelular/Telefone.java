package TelefoneCelular;

// Interface que contêm a declaração de funções para realizar ligações e ouvir correios de voz.
public interface Telefone {
    
    public void ligar(String numero);

    public void atender();

    public void iniciarCorreioVoz();
}
