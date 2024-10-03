package ArrayList;

import java.util.ArrayList;

public class LearnArrayList {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<Customer>();
        customers.add(new Customer("Tom", 15));
        customers.add(new Customer("Jack", 20));
        customers.add(new Customer("Jane", 25));
        customers.add(new Customer("Bob", 30));

        customers.removeLast();
        System.out.println("size of customers list: " + customers.size());
        customers.get(1).setName("Buscu");

        for (Customer c : customers) {
            System.out.println(c);
        }

    }
}
