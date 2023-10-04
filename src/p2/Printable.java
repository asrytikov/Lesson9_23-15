package p2;

public interface Printable {

    default void print(){
        System.out.println("Not realized printable");
    }

    static void read(){
        System.out.println("Read printable");
    }

}
