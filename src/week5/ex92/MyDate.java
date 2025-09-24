package week5.ex92;

public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared){
        if (this.year < compared.year) {
            return true;
        }
        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }
        if (this.year == compared.year && this.month == compared.month &&
                this.day < compared.day) {
            return true;
        }
        return false;
    }
    public int differenceInYears(MyDate comparedDate){
        MyDate earlier = this;
        MyDate later = comparedDate;

        if (this.earlier(comparedDate)){
            earlier = this;
            later = comparedDate;
        } else {
            earlier = comparedDate;
            later = this;
        }

        int yearDiff = later.year - earlier.year;

        if (later.month < earlier.month ||
                (later.month == earlier.month && later.day < earlier.day)) {
            yearDiff--;
        }
        return yearDiff;
    }
}
