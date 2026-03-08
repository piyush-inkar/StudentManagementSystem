import model.Student;
import service.StudentService;
import util.InputUtil;

public class Main {
    public static void main(String[]args){

        StudentService service=new StudentService();

        while(true){
            System.out.println("\n========== Student Management System ===========");
            System.out.println("1 Add Student");
            System.out.println("2 View Students");
            System.out.println("3 Search Student");
            System.out.println("4 Delete Student");
            System.out.println("5 Exit\n");

            int choice = InputUtil.getint("Enter Choice: ");
            System.out.println("-------------------------------");

            switch (choice){

                case 1:
                    int id=InputUtil.getint("Enter ID: ");
                    String name=InputUtil.getString("Enter Name: ");
                    int age=InputUtil.getint("Enter Age: ");

                    Student student = new Student(id,name,age);
                    service.addStudent(student);
                    break;

                case 2:
                    service.viewStudents();
                    break;

                case 3:
                    int searchID=InputUtil.getint("Enter ID to search: ");
                    service.searchStudent(searchID);
                    break;

                case 4:
                    int deletestudent=InputUtil.getint("Enter ID to delete: ");
                    service.deleteStudent(deletestudent);
                    break;

                case 5:
                    System.out.println("Exiting Program...");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice!");
            }

        }
    }
}