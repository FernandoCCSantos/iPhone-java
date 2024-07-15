package IPhone;

import TelefoneCelular.Telefone;
import NavegadorDeInternet.NavegadorInternet;
import ReprodutorMusical.IPod;

/*
Esta classe representa a planta para a instanciação de objetos IPhone.
Faz a implementação de fato das funções presentes nas interfaces abaixo utilizadas,
a fim de desempenhar diversas funções comumente atribuidas a objetos diferentes, mas como um único objeto.
*/
public class IPhone implements Telefone, IPod, NavegadorInternet  {
    
    // Implementando funções da interface Telefone:
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o número: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    // Implementando funções da interface IPod:
    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada: " + musica);
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música...");
    }


    // Implementando funções da interface NavegadorInternet:
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo a página para a url: " + url);
    } 

    @Override
    public void adicionarNovaAba() {
        System.out.println("Abrindo uma nova aba...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página...");
    }
}
