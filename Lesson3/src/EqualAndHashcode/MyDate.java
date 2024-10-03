package EqualAndHashcode;

public class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        if(year >= 1){
            this.year = year;
        }else {
            this.year = 1900;
        }

        if(month >= 1 && month <= 12){
            this.month = month;
        }else {
            this.month = 12;
        }

        if(day >= 1 && day <= 31){
            this.day = day;
        }else {
            this.day = 31;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return this.year + "-" + this.month + "-" + this.day;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        MyDate other = (MyDate) obj;
        return this.year == other.year && this.month == other.month && this.day == other.day;
    }

    @Override
    public int hashCode() {
        int result = 17;
        final int prime = 31;
        result = prime * result + year;
        result = prime * result + month;
        result = prime * result + day;
        return result;
    }
}
