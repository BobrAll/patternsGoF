package org.example.structural.adapter;

public class Program {
    public static void main(String[] args) {
        Database db = new BackendToDatabaseAdapter();

        db.insert();
        db.update();
        db.select();
        db.remove();
    }
}
