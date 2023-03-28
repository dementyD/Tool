package Guru;

public class Main {

    public static void main(String[] args) {

        Tool multitool = new Knife(new TurnScrew(new NailPuller(new Opener())));
        multitool.work();
    }
}
