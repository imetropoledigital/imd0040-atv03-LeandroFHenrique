package br.ufrn.imd;

public class Musician extends Person {
    private boolean playClassicalMusic;
    private boolean canImprovise;
    private boolean canCompose;

    public Musician(String name, String hometown, boolean playClassicalMusic, boolean canImprovise, boolean canCompose) {
        super(name, hometown);
        this.playClassicalMusic = playClassicalMusic;
        this.canImprovise = canImprovise;
        this.canCompose = canCompose;
    }

    public void play() {
    }
}