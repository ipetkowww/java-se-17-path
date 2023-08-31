package understanding_polymorphism.musicinstruments;

public class Studio {

    public void record(MusicalInstrument musicalInstrument) {
        String sound = musicalInstrument.play();
        System.out.println(sound);
    }
}
