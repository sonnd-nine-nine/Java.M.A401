package model;

import java.util.Scanner;

public class Multimedia {
    private String name;
    private double duration;

    Scanner scanner = new Scanner(System.in);
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public Multimedia(String name, double duration) {
        this.name = name;
        this.duration = duration;
    }

    public Multimedia() {
    }
    @Override
    public String toString() {
        return "Multimedia{" +
                "name='" + name + '\'' +
                ", duration=" + duration +
                '}';
    }
}
