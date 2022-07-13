package model;

public class Song extends Multimedia{
    private String singer;

    public Song(String name, double duration, String singer) {
        super(name, duration);
        this.singer = singer;
    }

    public Song() {
    }

    @Override
    public String toString() {
        return "Song{" +
                "singer='" + singer + '\'' +
                ", name='" + getName() + '\'' +
                ", duration=" + getDuration() +
                '}';
    }
}
