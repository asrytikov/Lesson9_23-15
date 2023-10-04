package p2;

public class Main {

    public static void main(String[] args) {
        Book book = new Book("Java", "Ekkel");
        book.print();

        Journal journal = new Journal("Popular Mechanics");
        journal.print();

        Printable printable = new Book("Java 2", "Ekkel");
        printable.print();
        printable = new Journal("NatGeo");
        printable.print();
        String nameJournal = ((Journal) printable).getName();
        System.out.println(nameJournal);

        Printable.read();

        Calculatable calculatable = new Calculation();
        ((Calculation)calculatable).info();
        System.out.println(calculatable.sum(10, 20));

        Printer.IPrint iPrint = new Journal2("NatGeo Wild");
        iPrint.print();

    }

}
