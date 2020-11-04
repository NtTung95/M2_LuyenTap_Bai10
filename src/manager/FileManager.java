package manager;

import entities.Student;

import java.io.*;
import java.util.ArrayList;

public class FileManager {
    private static String fileName = "StudentContestList.txt";

    public void writeData(ArrayList<Student> students){
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileName);
            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
            outputStream.writeObject(students);
            outputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Student> readData(){
        try {
            FileInputStream fileInputStream = new FileInputStream(fileName);
            ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
            return (ArrayList<Student>) inputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            return null;
        }
    }
}
