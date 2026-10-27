package java_lab;
import java.io.*;
import java.util.Scanner;

public class StudentInfoFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fileName = "students.txt";

        try {
            // Writing student info
            FileWriter fw = new FileWriter(fileName, true);
            BufferedWriter bw = new BufferedWriter(fw);

            System.out.print("Enter number of students: ");
            int n = sc.nextInt();
            sc.nextLine(); // consume newline

            for (int i = 0; i < n; i++) {
                System.out.println("Enter details for Student " + (i + 1));
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Roll Number: ");
                String roll = sc.nextLine();
                System.out.print("Department: ");
                String dept = sc.nextLine();
                System.out.print("Marks: ");
                int marks = sc.nextInt();
                sc.nextLine(); // consume newline

                bw.write(name + "," + roll + "," + dept + "," + marks);
                bw.newLine();
            }

            bw.close();
            fw.close();
            System.out.println("\nStudent details written to file successfully.");

            // Reading student info
            System.out.println("\nReading student details from file:");
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                System.out.println("Name: " + parts[0] + ", Roll No: " + parts[1] + ", Dept: " + parts[2] + ", Marks: " + parts[3]);
            }
            br.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
