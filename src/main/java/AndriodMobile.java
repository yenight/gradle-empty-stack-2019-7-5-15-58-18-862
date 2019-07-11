public class AndriodMobile extends Mobile{
    AndriodMobile(String name, String color, String brand) {
        super(name, color, brand);
    }

    @Override
    public void call(String message) {
        if (message.length() < 3) {
            System.out.println("<Andriod> Message cannot be sent");
        } else {
            System.out.println("<Andriod>Message : [" + message + "]");
        }
    }
}
