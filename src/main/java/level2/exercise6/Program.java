package level2.exercise6;

import java.time.LocalDateTime;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;

public class Program {
    private ConsoleUI consoleUI;
    ArrayList<Appointment> appointments;
    public Program()
    {
        consoleUI = new ConsoleUI();
        appointments = new ArrayList<>();
    }

    public void start()
    {
        String option;
        do
        {
            option = consoleUI.showMenu();
            switch(option)
            {
                case "1":
                    insertAppointment();
                    break;
                case "2":
                    showNextAppointments();
                    break;
                case "3":
                    showAllAppointments();
                    break;
                case "0":
                    break;
                default:
                    consoleUI.showIncorrectOption();
            }
        }while(!(option.equals("0")));
    }

    private void insertAppointment()
    {
        try
        {
            Appointment appointment = consoleUI.getNewAppointment();
            appointments.add(appointment);
            System.out.println("Cita afegida.");
        }
        catch(DateTimeParseException | EmptyDescriptionException ex)
        {
            System.out.println(ex.getMessage());
        }

    }

    private void showNextAppointments()
    {
        for(Appointment appointment:appointments)
        {
            if(appointment.getTime().isAfter(LocalDateTime.now()))
            {
                consoleUI.showAppointment(appointment);
            }
        }
    }

    private void showAllAppointments()
    {
        for(Appointment appointment:appointments)
        {
            consoleUI.showAppointment(appointment);
        }
    }
}
