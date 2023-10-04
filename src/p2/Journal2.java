package p2;

public class Journal2 implements Printer.IPrint{

    private String name;

    public Journal2(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println(name);
    }
}
