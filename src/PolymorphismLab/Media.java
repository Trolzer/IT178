package PolymorphismLab;

public class Media implements Movie, Multimedia{

    private int duration;
    private String director;

    public Media(){};

    @Override
    public void printDirector() {
        System.out.println(director);
    }

    @Override
    public void printDuration() {
        System.out.println(duration);
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setDirector(String director) {
        this.director = director;
    }

}
