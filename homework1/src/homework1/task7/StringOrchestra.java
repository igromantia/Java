package homework1.task7;

import homework1.task7.instruments.strings.Bass;
import homework1.task7.instruments.strings.Cello;
import homework1.task7.instruments.strings.Guitar;
import homework1.task7.instruments.strings.Violin;
import homework1.task7.interfaces.Strings;

public class StringOrchestra {
    private Guitar guitar;
    private Violin violin;
    private Cello cello;
    private Bass bass;

    StringOrchestra () {
        this.guitar = new Guitar();
        this.violin = new Violin();
        this.cello = new Cello();
        this.bass = new Bass();
    }

    public void playYourParts () {
        guitar.playStrings();
        violin.playStrings();
        cello.playStrings();
        bass.playStrings();
    }
}
