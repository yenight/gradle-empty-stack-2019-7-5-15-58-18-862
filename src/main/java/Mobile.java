public class Mobile {
    private String name;
    private String color;
    private String brand;

    Mobile(String name, String color, String brand) {
        this.name = name;
        this.color = color;
        this.brand = brand;
    }

    public void call(String message) {
        System.out.println("Message : [" + message + "]");

    }

    public void printInfo() {
        System.out.println("name: " + this.name + ", color: " +  this.color + ", brand: " + this.brand);
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}
