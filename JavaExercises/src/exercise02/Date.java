package exercise02;

public class Date {
    private int year, month, day;
    private String[] months = { "January" , "February", "March", "April", "May", "June", "July", "August",
            "September", "October", "November", "December"};

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
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

    public void print1() {
        System.out.println(year + "." + month + "." + day);
    }

    public void print2() {
        System.out.println(months[month-1] + " " + day + ", " + year);
    }
}
