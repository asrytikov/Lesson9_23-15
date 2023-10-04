package dz6;

public class Main {
    public static void main(String[] args) {
       Phone phone = new SamsungPhone();
       phone.setModel("Samsung S12");
       phone.setNumber(1234560);
       phone.info();

       SamsungPhone phone1 = new SamsungPhone();
       phone1.setModel("Samsung s11");
       phone1.setNumber(888888);
       phone1.info();

       Phone[] masPhone = new Phone[5];
       masPhone[0] = new SamsungPhone();

    }
}