package p1;

public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void info(){
        System.out.printf("Person %s \n", name);
    }
}
