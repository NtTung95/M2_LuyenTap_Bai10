package program;

import entities.Student;
import entities.StudentA;
import entities.StudentB;
import entities.StudentC;
import manager.TuyenSinh;

import java.util.Scanner;

public class Menus {
    Scanner input = new Scanner(System.in);

    public void inputInfo(Student student){
        do{
            System.out.println("Nhập SBD (VD: AB1234)");
            student.setSbd(input.nextLine());
            if(!InputRegex.isSBDMatch(student.getSbd())){
                System.err.println("Lỗi định dạng SBD ! Nhập lại");
            }
        }while (!InputRegex.isSBDMatch(student.getSbd()));

        do{
            System.out.println("Nhập tên");
            student.setName(input.nextLine());
            if(!InputRegex.isNameMatch(student.getName())){
                System.err.println("Lỗi định dạng tên ! Nhập lại");
            }
        } while (!InputRegex.isNameMatch(student.getName()));

        System.out.println("Nhập địa chỉ");
        student.setAddress(input.nextLine());
        System.out.println("Nhập khu vực (1 hoặc 2)");
        TuyenSinh.checkPriority(student);
    }

    public StudentA addStudentA(){
        StudentA studentA = new StudentA();
        inputInfo(studentA);
        return studentA;
    }

    public StudentB addStudentB(){
        StudentB studentB = new StudentB();
        inputInfo(studentB);
        return studentB;
    }

    public StudentC addStudentC(){
        StudentC studentC = new StudentC();
        inputInfo(studentC);
        return studentC;
    }
}
