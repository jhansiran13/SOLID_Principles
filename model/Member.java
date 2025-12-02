package SOLID_principle.model;

public class Member {
    private final String id;
    private final String name;
    private final String constituency;

    public Member(String id, String name, String constituency) {
        this.id = id;
        this.name = name;
        this.constituency = constituency;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public String getConstituency() { return constituency; }
}