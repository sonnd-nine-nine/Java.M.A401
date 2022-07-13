package view;

import model.Song;
import model.Video;
import util.Validator;

public class Menu {
    private static Menu instance;
    public static Menu getInstance(){
        if(instance == null){
            instance = new Menu();
        }
        return instance;
    }
    public int Menu(){
        System.out.println("Choose func \n" +
                "1. Add a new Video\n" +
                "2. Add a new Song\n" +
                "3. Show all Multimedia\n" +
                "4. Exit\n" +
                "You choose: ");
        return Validator.getInstance().validateInt();
    }

    public Video enterVideo(){
        System.out.println("Enter Vieo info:");
        System.out.print("Name:");
        String name = Validator.getInstance().validateString();
        System.out.print("Duration: ");
        Double duration = Validator.getInstance().validateDouble();
        return new Video(name, duration);
    }

    public Song enterSong(){
        System.out.println("Enter Song info");
        System.out.print("Name: ");
        String name = Validator.getInstance().validateString();
        System.out.print("Duration: ");
        Double duration = Validator.getInstance().validateDouble();
        System.out.print("Singer: ");
        String singer = Validator.getInstance().validateString();
        return new Song(name, duration, singer);
    }

    public void showList(){
        System.out.println("Show list info:");
    }
}
