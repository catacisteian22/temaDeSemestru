package main.model.BuchFactory;

import main.model.Buch;

public class ChemieBuchFactory implements BuchFactory{
    @Override
    public Buch createBuch(String idBuch, String title, String autor, int anzahlSeiten, int erstellungsjahr, float preis) {
        return new Buch(idBuch, title, autor, "Chemie", anzahlSeiten, erstellungsjahr, preis);
    }
}