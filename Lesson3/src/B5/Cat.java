package B5;

import java.util.Objects;

public class Cat extends Animal {
    private String color;

    public Cat(){}

    public Cat(String color) {
        this.color = color;
    }

    public Cat(String name, int age, float weight, String color) {
        super(name, age, weight);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object objects) {
        if (this.equals(objects)) return true;
        if (objects == null) return false;
        if (this.getClass() != objects.getClass()) return false;
        Cat cat = (Cat) objects;
        return (Objects.equals(this.getName(), cat.getName()) && this.getAge() == cat.getAge() && this.getWeight() == cat.getWeight() && Objects.equals(this.color, cat.color));
    }

    @Override
    public String toString() {
        return super.toString() + "Cat{" +
                "color='" + color + '\'' +
                '}';
    }
}
