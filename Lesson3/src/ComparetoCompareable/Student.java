package ComparetoCompareable;

public class Student implements Comparable<Student> {
    private int id;
    private String name;
    private String clazz;
    private float avgMarks;

    public Student(int id, String name, String clazz, float avgMarks) {
        this.id = id;
        this.name = name;
        this.clazz = clazz;
        this.avgMarks = avgMarks;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    public float getAvgMarks() {
        return avgMarks;
    }

    public void setAvgMarks(float avgMarks) {
        this.avgMarks = avgMarks;
    }

    public String getLastName(){
        String s = this.name.trim();
        if (s.indexOf(" ") >= 0){
            int index = s.lastIndexOf(" ");
            return s.substring(index + 1);
        }
        return s;
    }

    @Override
    public int compareTo(Student o) {
        String s1 = this.getLastName();
        String s2 = o.getLastName();
        return s1.compareTo(s2);
    }
}
