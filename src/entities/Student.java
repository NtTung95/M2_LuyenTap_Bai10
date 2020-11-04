package entities;

import java.io.Serializable;

public class Student implements Serializable {
    private String sbd;
    private String name;
    private String address;
    private int priority;

    public String getSbd() {
        return sbd;
    }

    public void setSbd(String sbd) {
        this.sbd = sbd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int isPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "{" +
                "sbd='" + sbd + '\'' +
                ", Tên='" + name + '\'' +
                ", Địa chỉ='" + address + '\'' +
                ", Diện ưu tiên=" + priority +
                '}';
    }
}
