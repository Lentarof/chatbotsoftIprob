package edu.com.chatbotsoftI;
import org.springframework.stereotype.Component;
//import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

@Component
public class Wladisbot extends TelegramLongPollingBot {
    @Override
    public void onUpdateReceived(Update update) {

        System.out.println(update.getMessage().getText()); //por el momento esto solo captura los mensajes del user y lo muestra en terminal
    }

    @Override
    public String getBotUsername() {
        return "Wladisbot";     //Nombre del bot creado en telegram @Wladisbot si quieren le cambian el nombre usando el token para tener el control
    }

    @Override
    public String getBotToken() {
        return "882974617:AAGlH5jSnqC1GELGLzIpwd-e5BZnpvvGBKA"; //Token del bot
    }
}
