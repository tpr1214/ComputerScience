package Semseter2.Workshop.Lesson7;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class MyBot2 extends TelegramLongPollingBot {
    @Override
    public void onUpdateReceived(Update update) {
        System.out.println(" name: " + update.getMessage().getFrom().getFirstName());
        System.out.println(update.getMessage().getText());
        long chatId = update.getMessage().getChatId();

        String text = update.getMessage().getText();
        String responseGpt = ApiManager2.ApiManage(text);
        System.out.println(responseGpt);
        sentResponse(chatId,responseGpt);


    }


    public void sentResponse(long chetId, String text){// קוד דרישה להחזיר תשובה אפשרי לעשות בלי מתודה
        SendMessage message = new SendMessage();
        message.setChatId(chetId);
        message.setText(text);

        try {
            execute(message);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public String getBotUsername() {
        return "My123567ShiraBot";
    }

    @Override
    public String getBotToken() {
        return "7707638116:AAEq8_RpiBtTx5YIyPg6bQ0IRGtgb_LOmp4";
    }
}
