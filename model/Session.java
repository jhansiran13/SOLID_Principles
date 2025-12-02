package SOLID_principle.model;

import java.time.LocalDate;

public class Session {
    private final String name;
    private final LocalDate date;

    public Session(String name, LocalDate date) {
        this.name = name;
        this.date = date;
    }

    public String getName() { return name; }
    public LocalDate getDate() { return date; }
}
