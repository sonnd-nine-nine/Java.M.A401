package model;

public class Video extends Multimedia{
    public Video() {
    }

    public Video(String name, double duration) {
        super(name, duration);
    }

    @Override
    public String toString() {
        return "Video{" +
                "name='" + getName() + '\'' +
                ", duration=" + getDuration() +
                '}';
    }
}
