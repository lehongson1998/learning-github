package GenericInJava;

public class Person <T extends Number>{
    private T id;
    private String name;

    public Person(T id, String name) {
        this.id = id;
        this.name = name;
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public <V> void printValue(V value){
        System.out.println(value);
    }

    @Override
    public String toString(){
        return "id = " + this.id + ", name = " + this.name;
    }

    public <S extends Number> float sub(S value){
        return (float) value / 2;
    }
}
