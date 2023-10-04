package p3;

public class Main {

    public static void main(String[] args) {
        Printable printable = createPrintable("NatGeo", true);
        printable.print();

        read(new Book("Java", "Ekkel"));
        read(new Journal("NatGeo Wild"));
    }

    static void read(Printable printable){
        printable.print();
    }

    static Printable createPrintable(String name, boolean option){
        if (option){
            return new Book(name, "Undefined");
        }else {
            return new Journal(name);
        }
    }
}
