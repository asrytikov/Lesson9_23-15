package p1;

public class Client extends Person{

    private int sum;
    private String bank;

    public Client(String name, int sum, String bank) {
        super(name);
        this.sum = sum;
        this.bank = bank;
    }

    public int getSum() {
        return sum;
    }

    public String getBank() {
        return bank;
    }

    public void info() {
        System.out.printf("Client %s has account in %s \n", super.getName(), bank);
    }
}
