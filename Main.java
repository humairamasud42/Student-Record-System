import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Ayaz Ali", 3.5));
        students.add(new Student("Faraiha Khan", 2.1));
        students.add(new Student("Zainab Raza", 3.9));
        students.add(new Student("Farhan Khan", 3.5));
        try (BufferedWriter writer=
                     new BufferedWriter(new FileWriter("students.txt"))) {

            for (Student s : students) {
                writer.write(s.toString());
                writer.newLine();
            }
            System.out.println("Student records written to file successfully.");

        }
        catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
        System.out.println("\nReading from file:\n");

        try (BufferedReader reader=
                     new BufferedReader(new FileReader("students.txt"))) {

            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        }
        catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        Student topStudent= students.get(0);

        for (Student s : students) {

            if (s.getCgpa() > topStudent.getCgpa()) {
                topStudent= s;
            }
        }

        System.out.println("\nStudent with Highest CGPA:-");
        System.out.println(topStudent);

        int count= 0;
        for (Student s : students) {

            if (s.getCgpa() < 2.5) {
                count++;
            }
        }
        System.out.println("\nStudents below CGPA 2.5: " + count);
    }
}
