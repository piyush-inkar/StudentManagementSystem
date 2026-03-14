package storage;

import model.Student;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class FileStorage {

    private static final String File_Name="student.txt";

    public static void saveStudents(ArrayList<Student> STUDENTS){

        try {
            BufferedWriter writer=new BufferedWriter(new FileWriter(File_Name));

            for (Student s: STUDENTS){

                writer.write(
                        s.getId()+"\n"+
                                s.getName()+"\n"+
                                s.getAge()
                );
                writer.newLine();
            }
            writer.close();
        } catch (Exception e) {
            System.out.println("Error saving Students!");
        }
    }

    public static ArrayList<Student> loadStudents(){

        ArrayList<Student> STUDENTS = new ArrayList<>();

        try {
            BufferedReader reader=new BufferedReader(new FileReader(File_Name));

            String line;

            while ((line = reader.readLine()) !=null){

                String[] data=line.split(",");

                int id=Integer.parseInt(data[0]);
                String name=data[1];
                int age=Integer.parseInt(data[2]);

                Student student = new Student(id,name,age);
                STUDENTS.add(student);
            }
            reader.close();
        } catch (Exception e) {
            System.out.println("No previous Students found!");
        }
        return STUDENTS;
    }
}
