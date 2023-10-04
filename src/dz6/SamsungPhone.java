public class SamsungPhone extends Phone{
    @Override
    public void info() {
        System.out.println("Samsung phone: " + getModel() + " " + getNumber());
    }
}
