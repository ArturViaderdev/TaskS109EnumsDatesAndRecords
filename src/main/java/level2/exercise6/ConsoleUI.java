package level2.exercise6;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class ConsoleUI {
    private final Scanner scanner = new Scanner(System.in);
    public ConsoleUI()
    {

    }

    public String showMenu()
    {
        System.out.println("Sel.lecciona una opció:");
        System.out.println("1-Introduir cita");
        System.out.println("2-Mostrar pròximes cites.");
        System.out.println("3-Mostrar totes les cites.");
        System.out.println("0-Sortir");
        return scanner.nextLine();
    }

    public void showIncorrectOption()
    {
        System.out.println("Opció Incorrecta.");
    }

    public Appointment getNewAppointment() throws DateTimeParseException, EmptyDescriptionException {
        System.out.println("Introdueix la descripció de la cita.");
        String description = scanner.nextLine();
        if (description.isEmpty()){
            throw new EmptyDescriptionException();
        }
        System.out.println("Introdueix la data i hora en el següent format: dd/MM/yyyy HH:mm:ss");
        String dateString = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime dateTime = LocalDateTime.parse(dateString,formatter);
        Appointment appointment = new Appointment(dateTime,description);
        return appointment;
    }

    public void showAppointment(Appointment appointment)
    {
        System.out.println(appointment.toString());
    }
}
