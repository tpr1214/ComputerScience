package Semseter2.Workshop.Lesson7;

public enum Type {//פתחתי מחלקה שמקצרת ופותחת שלוש אובייקטים ששונים בבחירה של אחד מהם
     SEND_MESSAGE("send-message"),
     CLEAR_HISTORY("clear-history"),
     CHECK_BALANCE("check-balance");

     private final String label;//

    Type(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
