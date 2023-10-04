package org.example.creational.singleton;

public class Program {
    public static void main(String[] args) {
        DataBaseService dbService = DataBaseService.getInstance();

        dbService.showConnectionInfo();
    }
}
