package com.techrecipes.file.csv;

public class students {
    private final String Name;

    private final int standard;
    private final int year;

    private final int RegNum;

    public students(String name, int standard, int year, int RegNum) {
        this.Name = Name;
        this.standard = standard;
        this.year = year;
        this.RegNum = RegNum;
    }

    public String getName() {
        return Name;
    }

    public int getStandard() {
        return standard;
    }

    public int getYear() {
        return year;
    }

    public int getRegNum() {
        return RegNum;
    }

    @Override
    public String toString() {
        return "Students{" +
                "Name=" + Name +
                ", Standard='" + standard + '\'' +
                ", year='" + year + '\'' +
                ", RegNum='" + RegNum + '\'' +
                '}';
    }
}
