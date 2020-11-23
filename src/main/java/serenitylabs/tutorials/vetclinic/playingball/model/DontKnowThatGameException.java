package serenitylabs.tutorials.vetclinic.playingball.model;

public class DontKnowThatGameException implements Player {
    public void play() {
        System.out.print("That game is not recognised");
    }
}
