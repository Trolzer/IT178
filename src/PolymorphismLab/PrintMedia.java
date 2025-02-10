package PolymorphismLab;

public class PrintMedia {

    public static void main(String[] args) {

        Media myMedia = new Media();

        myMedia.setDirector("Steven Spielberg");
        myMedia.setDuration(150);

        myMedia.printDirector();
        myMedia.printDuration();

    }

}
