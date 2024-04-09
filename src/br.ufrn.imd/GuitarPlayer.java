package br.ufrn.imd;

public class GuitarPlayer extends Musician {
    private int howManyYears;
    private boolean playElectronicGuitar;
    private boolean playAcousticGuitar;

    public GuitarPlayer(String name, String hometown, boolean playClassicalMusic, boolean canImprovise, boolean canCompose, int howManyYears, boolean playElectronicGuitar, boolean playAcousticGuitar) {
        super(name, hometown, playClassicalMusic, canImprovise, canCompose);
        this.howManyYears = howManyYears;
        this.playElectronicGuitar = playElectronicGuitar;
        this.playAcousticGuitar = playAcousticGuitar;
    }

    public void playGuitar() {
    }
}