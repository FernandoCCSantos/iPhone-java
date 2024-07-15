package Usuario;

import IPhone.IPhone;

/*
Esta classe representa um usuario que adquiriu o novo produto da marca Apple, o IPhone,
e que irá utilizar as suas diversas funcionalidades como um único dispositivo capaz de atuar
como telefone, reprodutor de música e navegador de internet. 
*/
public class Usuario {
    
    public static void main(String[] args) {
        
        IPhone iphone = new IPhone();

        // O usuário vai fazer uma ligação para exibir o seu novo IPhone.
        iphone.ligar("11 9765-5473");

        // Opa! Parece que alguém está ligando para ele.
        iphone.atender();

        // Vixe... Caiu a ligação, mas o contato deixou um correio de voz.
        iphone.iniciarCorreioVoz();

        // O usuário cansou de fazer ligações, agora ele quer ouvir música em seu novo IPhone.
        iphone.selecionarMusica("Depeche Mode: Strangelove");
        iphone.tocar();

        // Maravilha! Mas agora ele ficou com saudades do clipe da música e decidiu procurá-la na internet.
        // Ele ainda não baixou o aplicativo do Youtube.
        iphone.pausar();
        iphone.adicionarNovaAba();
        iphone.exibirPagina("https://youtu.be/MHRabky4Ajc");

        // Parece que a página está tendo alguns problemas para carregar. Problemas de produtos muito novos, sabe como é.
        iphone.atualizarPagina();

        // Pronto, agora sim!
        // Muito legal esse novo IPhone hein!
    }
}
