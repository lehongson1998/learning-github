package EqualAndHashcode;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyDate myDate1 = new MyDate(2019, 1, 1);
        MyDate myDate2 = new MyDate(2019, 1, 2);
        MyDate myDate3 = new MyDate(2019, 1, 1);

        List<MyDate> myDates = new ArrayList<>();
        myDates.add(myDate1);
        myDates.add(myDate2);
        myDates.add(myDate3);

        for (MyDate myDate : myDates) {
            System.out.println("Son" + myDate);
        }

        System.out.println(myDate1.equals(myDate2));
        System.out.println(myDate1.equals(myDate3));

        System.out.println(myDate1.hashCode());
        System.out.println(myDate2.hashCode());
        System.out.println(myDate3.hashCode());

        String equal1 = (myDate1.hashCode() == myDate2.hashCode()) ? "1 equal 2" : "1 not equal 2";
        String equal2 = (myDate1.hashCode() == myDate3.hashCode()) ? "1 equal 3" : "1 not equal 3";

        System.out.println(equal1);
        System.out.println(equal2);
    }
}
