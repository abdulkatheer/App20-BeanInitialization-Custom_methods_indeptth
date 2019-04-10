package beans;

public class Wish {
    private String name;
    private String message;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void saiHai() {
        System.out.println("Hey " + this.getName() + ". " + this.getMessage());
    }

    public void init() {
        System.out.println("init() method called...");
        this.name = "Abdul";
        this.message = "Have a nice day!";
    }

    public void customDestroy() {
        System.out.println("customDestroy() method called...");
    }
}
