package B2;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("123", "John Doe", 18, 8.5f);

        System.out.println("ID: " + student.getId());
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Grade: " + student.getGrade());
        System.out.println("isPass: " + (student.isPass() ? "Pass" : "Fail"));

        student.setId("456");
        student.setName("Jane Doe");
        student.setAge(20);
        student.setGrade(5.0f);

        System.out.println("\nAfter updating:");
        student.displayInfo();

        Student[] s = new Student[3];
        System.out.println("\nList of students: ");
        s[0] = new Student("789", "Michael Johnson", 19, 5.7f);
        s[1] = new Student("101", "Emily Davis", 18, 9.2f);
        s[2] = new Student("124", "Maria Ozan", 20,     9.5f);

        for (Student st : s) {
            st.displayInfo();
        }

        if (!(student.isPass())){
            System.out.println("Fail");
        }
    }
}
