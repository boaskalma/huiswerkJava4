import java.util.Scanner;

public class Command {

    private Link firstLink;
    private Student newStudent;

    public Command()

    {

        firstLink = new Link(null, 0);
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println();
            System.out.println("Wat wil je doen?");
            System.out.println("Je kan kiezen uit:push, pop, size, peek, print_stack, print_man, print_women");
            String command = scanner.next();
            System.out.println("Je hebt gekozen voor: " + command);
            System.out.println();


            if (command.equals("push")) {
                newStudent = new NewStudent().getStudent();
                if (firstLink.peek(newStudent)) {

                    System.out.println("Deze student staat al op de stack.");
                } else {
                firstLink.push(newStudent);
                }

            } else if (command.equals("pop")) {
                Student popStudent = firstLink.pop();
                if (popStudent == null) {
                    System.out.println("De stack is leeg.");
                } else {
                    popStudent.printStudent();
                }
            } else if (command.equals("size")) {
                System.out.println("er zijn: "+(firstLink.getSize())+" records in de data base. ");
            } else if (command.equals("peek")) {
                newStudent = new NewStudent().getStudent();
                if (firstLink.peek(newStudent)) {

                    System.out.println("Deze student staat al op de stack.");
                } else {
                    System.out.println("Deze student staat nog niet op de stack.");
                }
            } else if (command.equals("print_stack")) {
                firstLink.printStack();
            } else if (command.equals("print_man")) {
                firstLink.printMan();
            } else if (command.equals("print_women")) {
                firstLink.printWomen();
            } else {
                System.out.println("Commend niet herkend.");
            }

        }
    }
}
