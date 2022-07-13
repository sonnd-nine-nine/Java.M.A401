package service;

import model.Multimedia;
import model.Song;
import model.Video;
import view.Menu;

import java.util.*;

public class MultimediaServiceImp implements MultimediaService{

    private List<Multimedia> multimedia = new ArrayList<>();

    @Override
    public boolean createVideo() {
        Video video = Menu.getInstance().enterVideo();
        multimedia.add(video);
        return true;
    }

    @Override
    public boolean createSong() {
        Song song = Menu.getInstance().enterSong();
        multimedia.add(song);
        return true;
    }

    @Override
    public void show() {
        Menu.getInstance().showList();
        multimedia.forEach(System.out::println);
    }
}
