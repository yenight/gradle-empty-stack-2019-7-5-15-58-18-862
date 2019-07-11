public class Person {
    private String name;
    private Mobile mobile;

    public Person(String name) {
        this.name = name;
    }

    public void setMobile(Mobile mobile) {
        this.mobile = mobile;
    }

    public void usePhone(String message) {
        this.mobile.call(message);
    }
}
