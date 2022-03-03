package com.company;

public final class BMW extends Model {
    private double volume;
    private int yearOfIssue;

    public BMW(String motor, String kkp, String model, Color color, double volume, int yearOfIssue) {
        super(motor, kkp, model, color);
        this.volume = volume;
        this.yearOfIssue = yearOfIssue;
    }

    public double getVolume() {
        return volume;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\nVolume: " + volume + "\nYears: " + yearOfIssue;
    }
}
