package homework1.task7;

import homework1.task7.instruments.keyboards.Harpsichord;
import homework1.task7.instruments.keyboards.Organ;
import homework1.task7.instruments.keyboards.Piano;

public class KeysOrchestra {
    private Harpsichord harpsichord;
    private Organ organ;
    private Piano piano;

    public KeysOrchestra () {
        this.harpsichord = new Harpsichord();
        this.organ = new Organ();
        this.piano = new Piano();
    }

    public void playYourParts () {
        harpsichord.playKeys();
        organ.playKeys();
        piano.playKeys();
    }
}
