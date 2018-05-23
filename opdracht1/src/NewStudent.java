import java.util.Scanner;

public class NewStudent {
    private Student student;

    public NewStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welke naam heeft de Student? (gebuik een _ inplaats van een <spatie>.");
        String naam = scanner.next();
        System.out.println("Welke nummer heeft de Student?");
        int nummer = Integer.parseInt(scanner.next());
        System.out.println("Welke leeftijd heeft de Student?");
        int leeftijd = Integer.parseInt(scanner.next());
        System.out.println("Welk geslacht heeft de Student?");
        String geslacht = scanner.next();
        student = new Student(naam, nummer, leeftijd, geslacht);

    }


    public Student getStudent() {
        return student;
    }
}
