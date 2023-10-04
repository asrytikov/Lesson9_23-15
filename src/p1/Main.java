package p1;

public class Main {

    public static void main(String[] args) {
        Object ivan = new Person("Ivan");
        Object masha = new Employee("Masha", "VTB");
        Object dasha = new Client("Dasha", 200, "Sberbank");
        Person alex = new Client("Alex", 500, "Tinkoff");
        Person alisa = new Employee("Alisa", "Sberbank");

        Object sergey = new Employee("Sergey", "VTB");
        Employee employee = (Employee) sergey;
        employee.info();
        System.out.println(employee.getCompany());

        Object katya = new Client("Katya", 200, "VTB");
        ((Person) katya).info();

        Object tanya = new Client("Tanya", 2000, "VTB");

        if (tanya instanceof Client client){
            client.info();
        }else {
            System.out.println("Convert isn't available");
        }

        if (tanya instanceof Client) {
            /*Employee emp = (Employee) tanya;
            emp.info();*/
            Client client = (Client) tanya;
            client.info();
        }else{
            System.out.println("Convert isn't available");
        }

    }

}
