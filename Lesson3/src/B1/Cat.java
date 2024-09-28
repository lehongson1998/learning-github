package B1;

public class Cat {
    public String name;
    public int age;
    public float weight;
    public String color;
    public String eyesColor;

    public Cat() {
    }

    public Cat(String name, int age, float weight, String color, String eyesColor) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
        this.eyesColor = eyesColor;
    }

    public void speak(String message){
        System.out.println(name + " is speaking " + message);
    }

    public void sleep(){
        System.out.println(name + " is sleeping!");
    }

    public void eat(String food){
        System.out.println(name + " is eat " + food);
    }
}
