package level2.exercise6;

import java.time.LocalDateTime;

public class Appointment {
    private LocalDateTime time;
    private String description;

    public Appointment(LocalDateTime time, String description)
    {
        this.time = time;
        this.description = description;
    }

    public LocalDateTime getTime()
    {
        return time;
    }

    public String getDescription()
    {
        return description;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "time=" + time +
                ", description='" + description + '\'' +
                '}';
    }
}
