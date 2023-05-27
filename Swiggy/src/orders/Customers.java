package orders;

public class Customers {
    private int id;
    private String name;
    private String password;
    private String city;

    public Customers() {
        super();
    }

    public Customers(int id, String name, String password, String city) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.city = city;
    }

    public Customers(String name, String password, String city) {
        this.name = name;
        this.password = password;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getCity() {
        return city;
    }
}
