package org.example.creational.builder;

public class Program {
    public static void main(String[] args) {
        Worker worker1 = new Worker.Builder()
                .age(21)
                .name("Alexander")
                .build();

        Worker worker2 = new Worker.Builder()
                .age(19)
                .name("Daniel")
                .role(Role.MANAGER)
                .salary(100000)
                .build();

        System.out.println(worker1 + "\n" + worker2);
    }
}
