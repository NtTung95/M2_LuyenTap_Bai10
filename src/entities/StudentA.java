package entities;

public class StudentA extends Student {
    private final String subject = "Toán, Lý, Hóa";

    public String getSubject() {
        return subject;
    }

    @Override
    public String toString() {
        return "Khối A{" +
                "Môn thi='" + subject + '\'' +
                "} " + super.toString();
    }
}
