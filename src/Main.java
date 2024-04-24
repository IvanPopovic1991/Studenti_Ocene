import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Student> allStudents = new ArrayList<>();
        List<Student> passedStudents = new ArrayList<>();
        Student student;

        while (true) {
            System.out.println("Unesite podatke za studenta ili quit ukoliko zelite da izadjete iz programa");
            System.out.println("Unesite ime studenta: ");
            String ime = scanner.next();
            if (ime.equalsIgnoreCase("quit")) {
                break;
            }
            System.out.println("Unesite prezime studenta :");
            String prezime = scanner.next();
            if (prezime.equalsIgnoreCase("quit")) {
                break;
            }
            System.out.println("Unesite ocenu studenta :");
            String ocena = scanner.next();
            if (ocena.equalsIgnoreCase("quit")) {
                break;
            }
            int unetaOcena = Integer.parseInt(ocena);
            student = new Student(ime, prezime, unetaOcena);

            allStudents.add(student);
        }
        for (int i = 0; i < allStudents.size(); i++) {
            if (allStudents.get(i).getOcena() > 5) {
                passedStudents.add(allStudents.get(i));
            }
        }
        System.out.println("All students : " + allStudents);
        System.out.println("Passed students : " + passedStudents);
    }
}