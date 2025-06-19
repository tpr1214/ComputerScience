package Semseter2.Workshop.Lesson7;

public class Messages {
    private String text;
    private long chatId;

    // בנאי - קונסטרוקטור
    public Messages(String text, long chatId) {
        this.text = text;
        this.chatId = chatId;
    }

    // גטרים (שיטות גישה)
    public String getText() {
        return text;
    }

    public long getChatId() {
        return chatId;
    }

    // אופציונלי: להדפיס את ההודעה בצורה יפה
    @Override
    public String toString() {
        return "Message{" +
                "text='" + text + '\'' +
                ", chatId=" + chatId +
                '}';
    }
}
