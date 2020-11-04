package entities;

public class StudentC extends Student {
    private final String subject = "Văn, Sử, Địa";

    public String getSubject() {
        return subject;
    }

    @Override
    public String toString() {
        return "Khối C{" +
                "subject='" + subject + '\'' +
                "} " + super.toString();
    }
}
