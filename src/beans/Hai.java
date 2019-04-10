package beans;

public class Hai {
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
        System.out.println("Hai " + this.getName() + ". " + this.getMessage());
    }

    public void customInit() {
        System.out.println("customInit() method called...");
        this.name = "Abdul";
        this.message = "Good Morning!";
    }

    public void customDestroy() {
        System.out.println("customDestroy() method called...");
    }
}
