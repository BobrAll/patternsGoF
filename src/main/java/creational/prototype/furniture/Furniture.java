package creational.prototype.furniture;

import creational.prototype.Cloneable;
import creational.prototype.Material;

public abstract class Furniture implements Cloneable {
    protected Material material;

    public Furniture(Material material) {
        this.material = material;
    }

    public Material getMaterial() {
        return material;
    }

    @Override
    public abstract Cloneable clone();
}
