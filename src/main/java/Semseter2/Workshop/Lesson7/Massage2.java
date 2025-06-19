package Semseter2.Workshop.Lesson7;

public class Massage2 {
    private String text;
    private long chatId;

    public Massage2(String text,long chatId ){
        this.text=text;
        this.chatId=chatId;
    }
    public String getText() {
        return text;
    }

    public long getChatId() {
        return chatId;
    }
    public String toString() {
        return "Message2{" +
                "text='" + text + '\'' +
                ", chatId=" + chatId +
                '}';
    }
}
