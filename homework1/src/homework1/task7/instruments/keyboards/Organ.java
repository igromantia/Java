package homework1.task7.instruments.keyboards;

import homework1.task7.interfaces.Keyboards;

public class Organ implements Keyboards {
    @Override
    public void playKeys() {
        System.out.println("Играет орган");
    }
}
