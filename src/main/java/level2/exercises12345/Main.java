package level2.exercises12345;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args)
    {
        LocalDate date = LocalDate.now();
        System.out.println("La data actual amb LocalDate és " + date.toString());
        LocalTime time = LocalTime.now();
        System.out.println("La hora actual amb LocalTime és " + time.toString());
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("La data i hora actual amb LocalDateTime és " + dateTime.toString());
        LocalDate christmas = LocalDate.of(2025,12,25);
        Period fromChristmasTime = Period.between(christmas,date);
        System.out.println("Ha passat " + Long.toString(fromChristmasTime.getYears()) + " anys " + Long.toString(fromChristmasTime.getMonths()) + " mesos " + Long.toString(fromChristmasTime.getDays()) + " díes des de Nadal del 2025.");
        LocalDate tomorrow = date.plusDays(1);
        System.out.println("Demà és " + tomorrow.toString());
        LocalDate yesterday = date.minusDays(1);
        System.out.println("Ahir era " + yesterday.toString());
        LocalDate nextMonth = date.plusMonths(1);
        System.out.println("D'aquí un mes estarem a " + nextMonth.toString());
        LocalDate previousMonth = date.minusMonths(1);
        System.out.println("Fa un mes estavem a " + previousMonth.toString());
        LocalTime nextHour = time.plusHours(1);
        System.out.println("D'aquí una hora seran les " + nextHour);
        LocalTime previousHour = time.minusHours(1);
        System.out.println("Fa una hora eren les " + previousHour.toString());
        Duration duration = Duration.between(time,nextHour);
        System.out.println("D'aqui a una hora hauran passat " + Long.toString(duration.getSeconds()) + " segons.");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");
        String textDate = "2025 09 06";
        LocalDate birthday = LocalDate.parse(textDate,formatter);
        System.out.println("El meu cumpleanys llegit de un string va esser el " + birthday.toString());
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate firstDayOfYear = LocalDate.parse("01/01/2025",formatter2);
        System.out.println("El primer día del any 2025 era " + firstDayOfYear.toString());

        if(dateIsPreviousToToday(yesterday))
        {
            System.out.println("Ahir va ser abans que avui.");
        }
        if(!(dateIsPreviousToToday(tomorrow)))
        {
            System.out.println("Demà es després de avui.");
        }
    }

    private static boolean dateIsPreviousToToday(LocalDate date)
    {
        return (date.isBefore(LocalDate.now()));
    }
}
