public class IPhoneRobot {
    private String name;
    private iPhone iPhone;

    public IPhoneRobot(String name, iPhone iPhone) {
        this.name = name;
        this.iPhone = iPhone;
    }

    public void usePhone(String message) {
        this.iPhone.call(message);
    }
}
