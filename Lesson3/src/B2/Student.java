package B2;

public class Student {
    private String id;
    private String name;
    private int age;
    private float grade;

    public Student(){
    }

    public Student(String id, String name){
        this();
        this.id = id;
        this.name = name;
    }

    public Student(String id, String name, int age, float grade){
        this(id, name);
        this.age = age;
        this.grade = grade;
    }

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public float getGrade(){
        return grade;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }

    public void displayInfo(){
        System.out.println("[Id : " + id + ", Name : " + name + ", Age : " + age + ", grade : "
                + (isPass()? "Pass" : "Fail") + "]");
    }

    public boolean isPass(){
        return grade >= 8.0;
    }
}
