package entities;

public class StudentB extends Student {
    private final String subject = "Toán, Hóa, Sinh";

    public String getSubject() {
        return subject;
    }

    @Override
    public String toString() {
        return "Khối B{" +
                "subject='" + subject + '\'' +
                "} " + super.toString();
    }
}
