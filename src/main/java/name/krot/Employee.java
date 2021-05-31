package name.krot;

public class Employee {
    private String lastname;
    private String name;

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee(String lastname, String name) {
        this.lastname = lastname;
        this.name = name;
    }
}
