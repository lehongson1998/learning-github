package B3;

public class StaticMembers {
    public static int id = 1000;
    public static String name = "Bob";
    private int mId;
    private String mName;

    public StaticMembers() {
        this.mId = ++id;
        this.mName = name;
    }

    public int getMId() {
        return mId;
    }

    public void setMId(int mId) {
        this.mId = mId;
    }

    public String getMName() {
        return mName;
    }

    public void setMName(String mName) {
        this.mName = mName;
    }

    public static void main(String[] args) {
        StaticMembers s1 = new StaticMembers();
        StaticMembers s2 = new StaticMembers();
        StaticMembers s3 = new StaticMembers();
        StaticMembers s4 = new StaticMembers();

        System.out.println("Id s1 = " + s1.getMId());
        System.out.println("Id s2 = " + s2.getMId());
        System.out.println("Id s3 = " + s3.getMId());
        System.out.println("Id s4 = " + s4.getMId());

        int a = 1;
        float b = (float) a;

        float c = 3.5f;
        int d = (int) c;
    }
}
