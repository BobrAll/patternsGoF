package creational.prototype;

import creational.prototype.furniture.Closet;

public class Program {
    public static void main(String[] args) {
        Closet closet = new Closet(Material.WOOD, 4);

        //Can't make clone directly, because field shelfValue is private and haven't getter
        //Closet anotherCloset = new Closet(closet.getMaterial(), closet.getShelfValue());

        //Clone using prototype pattern
        Cloneable anotherCloset = closet.clone();
        System.out.println("First closet: " + closet);
        System.out.println("Second closet: " + anotherCloset);
        System.out.println("Comparing by ref: " + (closet == anotherCloset));
    }
}
