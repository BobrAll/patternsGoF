package creational.prototype.furniture;

import creational.prototype.Cloneable;
import creational.prototype.Material;

public class Closet extends Furniture {
    private int shelfValue;

    public Closet(Material material, int shelfValue) {
        super(material);
        this.shelfValue = shelfValue;
    }

    @Override
    public Cloneable clone() {
        return new Closet(material, shelfValue);
    }

    @Override
    public String toString() {
        return "Closet{shelfValue=" + shelfValue + ", material=" + material + '}';
    }
}
