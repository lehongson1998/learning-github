package B4;

public class Person extends Animal{
    private String idCard;
    private float height;
    private float weight;

    public Person(){}

    public Person(String idCard, float height, float weight) {
        this.idCard = idCard;
        this.height = height;
        this.weight = weight;
    }

    public Person(String name, int age, String idCard, float height, float weight) {
        super(name, age);
        this.idCard = idCard;
        this.height = height;
        this.weight = weight;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        String x = super.toString();
        return  x + ", " +
                "idCard='" + idCard + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
