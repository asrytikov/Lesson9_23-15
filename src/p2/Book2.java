package p2;

public class Book2 implements BookPrintable{
    @Override
    public void paint() {

    }

    @Override
    public void print() {
        BookPrintable.super.print();
    }
}
