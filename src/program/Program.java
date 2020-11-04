package program;

import entities.StudentA;
import entities.StudentB;
import entities.StudentC;
import manager.TuyenSinh;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TuyenSinh tuyenSinh = new TuyenSinh();
        Menus menus = new Menus();
        do{
            try{
                System.out.println("1.Thêm thí sinh");
                System.out.println("2.Hiện danh sách thí sinh");
                System.out.println("3.Sửa thông tin thí sinh theo SBD");
                System.out.println("4.Xóa");
                System.out.println("5.Tìm kiếm theo SBD");
                int choice = Integer.parseInt(input.nextLine());
                switch (choice){
                    case 1:
                        System.out.println("1.Thêm thí sinh thi khối A");
                        System.out.println("2.Thêm thí sinh thi khối B");
                        System.out.println("3.Thêm thí sinh thi khối C");
                        int studenType = Integer.parseInt(input.nextLine());
                        switch (studenType){
                            case 1:
                                StudentA studentA = menus.addStudentA();
                                tuyenSinh.addStudent(studentA);
                                break;
                            case 2:
                                StudentB studentB = menus.addStudentB();
                                tuyenSinh.addStudent(studentB);
                                break;
                            case 3:
                                StudentC studentC = menus.addStudentC();
                                tuyenSinh.addStudent(studentC);
                                break;
                        }
                        tuyenSinh.displayAll();
                        break;
                    case 2:
                        tuyenSinh.displayAll();
                        break;
                    case 3:
                        System.out.println("Nhập SBD cần sửa");
                        tuyenSinh.update(input.nextLine());
                        break;
                    case 4:
                        System.out.println("Nhập SBD cần xóa");
                        tuyenSinh.delete(input.nextLine());
                        break;
                    case 5:
                        System.out.println("Nhập SBD cần tìm");
                        tuyenSinh.search(input.nextLine());
                        break;
                }
            } catch (NumberFormatException e){
                System.err.println("Select a number!");
            }
        }while (true);
    }
}
