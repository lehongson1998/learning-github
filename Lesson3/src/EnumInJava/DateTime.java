package EnumInJava;

public enum DateTime {
    JANUARY(31),
    FEBRUARY(29),
    MARCH(31),
    APRIL(30),
    MAY(31),
    JUNE(30),
    JULY(31),
    AUGUST(31),
    SEPTEMBER(30),
    OCTOBER(31),
    NOVEMBER(30),
    DECEMBER(31);

    private final int day;

    DateTime(int day) {
        this.day = day;
    }

    public int getDay() {
        return this.day;
    }
}
