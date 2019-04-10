package beans;

public class Hello {
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

    public void sayHello() {
        System.out.println("Hello " + this.getName() + ". " + this.getMessage());
    }

    public void customInit() {
        System.out.println("customInit() method called...");
        this.name = "Katheer";
        this.message = "Good Evening!";
    }

    public void customDestroy() {
        System.out.println("customDestroy() method called...");
    }
}
