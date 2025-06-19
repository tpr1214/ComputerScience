package Semseter2.Workshop.Lesson5API;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[]args){
        try {
            // יוצרים את מערכת הבוטים
            TelegramBotsApi botsApi = new TelegramBotsApi(DefaultBotSession.class);

            // רושמים את הבוט שכתבנו
            botsApi.registerBot(new MyBot());

            System.out.println("הבוט הופעל בהצלחה!");
        } catch (Exception e) {
            System.out.println("שגיאה בהרצת הבוט:");
            e.printStackTrace();
        }


    }

    public static class MyBot extends TelegramLongPollingBot {
        private Map<Long, String> userStates = new HashMap<>();

        @Override
        public String getBotUsername() {
            return "Mytpr1214Bot";
        }

        public String getBotToken() {
            return "7710536170:AAETq1n0LUUNKGXp3Dc_dKz-HKRE6JNHzHg";
        }
        @Override
        public void onUpdateReceived(Update update) {
            if (update.hasMessage() && update.getMessage().hasText()) {
                String userText = update.getMessage().getText().toLowerCase();
                long chatId = update.getMessage().getChatId();

                // הדפסת תוכן ההודעה
                System.out.println("---------------------------------------------------");
                System.out.println("התקבלה הודעה:");
                System.out.println("שם משתמש: @" + update.getMessage().getFrom().getUserName());
                System.out.println("תוכן ההודעה: " + userText);
                System.out.println("מצב נוכחי: " + userStates.getOrDefault(chatId, "אין"));

                String responseText;

                if (userText.contains("מה שלומך")) {
                    responseText = "אני מצוין! מה אכלת היום?";
                    userStates.put(chatId, "awaiting_feeling");
                    System.out.println("שינוי מצב: awaiting_feeling");
                }

                else if (userStates.containsKey(chatId) && userStates.get(chatId).equals("awaiting_feeling")) {
                    if (userText.contains("טוב") || userText.contains("מצוין") || userText.contains("סבבה")) {
                        responseText = "איזה כיף לשמוע! 😊";
                    } else if (userText.contains("לא") || userText.contains("רע") || userText.contains("עייף")) {
                        responseText = "מצטער לשמוע... מקווה שהמצב ישתפר 💪";
                    } else {
                        responseText = "תודה ששיתפת אותי!";
                    }

                    userStates.remove(chatId);
                    System.out.println("מצב אופס - שיחה הושלמה.");
                }

                else if (userText.contains("מה השעה")) {
                    LocalTime now = LocalTime.now();
                    responseText = "השעה עכשיו: " + now.format(DateTimeFormatter.ofPattern("HH:mm"));
                }

                else {
                    responseText = "אני כאן בשבילך. נסי לכתוב 'מה שלומך?' או 'מה השעה'.";
                }

                // שליחת ההודעה
                SendMessage message = new SendMessage();
                message.setChatId(String.valueOf(chatId));
                message.setText(responseText);

                try {
                    execute(message);
                    System.out.println("נשלחה תגובה: " + responseText);
                } catch (TelegramApiException e) {
                    System.out.println("שגיאה בשליחת הודעה!");
                    e.printStackTrace();
                }

                System.out.println("---------------------------------------------------\n");
            }
            }
        }
}
