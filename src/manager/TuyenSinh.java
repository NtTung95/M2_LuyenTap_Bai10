package manager;

import entities.Student;
import program.Menus;

import java.util.ArrayList;
import java.util.Scanner;

public class TuyenSinh {
    FileManager fileManager = new FileManager();
    Menus menus = new Menus();
    ArrayList<Student> studentList = fileManager.readData();

    public void addStudent(Student student){
        if(studentList == null){
            studentList = new ArrayList<>();
        }
        if(isSBDExist(student.getSbd())){
            System.err.println("Trùng SBD! Nhập lại");
        } else {
            studentList.add(student);
            fileManager.writeData(studentList);
        }
    }

    public void displayAll(){
        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    public void update(String sbd){
        for (Student student : studentList) {
            if(student.getSbd().equals(sbd)){
                menus.inputInfo(student);
            }
        }
        fileManager.writeData(studentList);
    }

    public void search(String sbd){
        for (Student student : studentList) {
            if(student.getSbd().equals(sbd)){
                System.out.println(student);
            }
        }
        System.err.println("K tìm thấy SBD tương ứng");
    }

    public void delete(String sbd){
        Student student = null;
        for (Student studentDelete : studentList) {
            if(studentDelete.getSbd().equals(sbd)){
                student = studentDelete;
            }
        }
        studentList.remove(student);
        fileManager.writeData(studentList);
    }

    public boolean isSBDExist(String sbd){
        boolean checkID = false;
        for (Student studenID : studentList) {
            if(studenID.getSbd().equals(sbd)){
                checkID = true;
            }
        }
        return checkID;
    }

    public static int checkPriority(Student student){
        Scanner input = new Scanner(System.in);
        try{
            int priority = Integer.parseInt(input.nextLine());
            switch (priority){
                case 1:
                    student.setPriority(1);
                    break;
                case 2:
                    student.setPriority(2);
                    break;
                default:
                    System.err.println("Lỗi! Nhập lại");
                    checkPriority(student);
            }
        } catch (NumberFormatException e){
            System.err.println("Lỗi định dạng");
            checkPriority(student);
        }

        return student.getPriority();
    }
}
