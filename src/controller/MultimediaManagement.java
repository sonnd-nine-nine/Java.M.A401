package controller;

import service.MultimediaService;
import service.MultimediaServiceImp;
import view.Menu;

public class MultimediaManagement {
private static MultimediaService multimediaService = new MultimediaServiceImp();

    public static void main(String[] args) {
        int choose;
        do {
            choose = Menu.getInstance().Menu();
            switch (choose){
                case 1:
                    boolean resVideo = multimediaService.createVideo();
                    System.out.println("Create Video" + (resVideo ? "success" : "fail, again!!"));
                    break;
                case 2:
                    boolean resSong = multimediaService.createSong();
                    System.out.println("Create Song " + (resSong ? "success" : "fail, again!!"));
                    break;
                case 3:
                    multimediaService.show();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("choose case:");
                    break;
            }
        }while (choose!=4);
    }
}
