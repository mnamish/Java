package Final;

public class Main {
    public static void main(String[] args) {
        MyArrayList<Song> library = new MyArrayList<>();
        library.add(new Song("Dreams", "Fleetwood Mac", 240));
        library.add(new Song("Blinding Lights", "The Weeknd", 200));
        library.add(new Song("Numb", "Linkin Park", 180));
        library.add(new Song("Bad Guy", "Billie Eilish", 190));
        library.add(new Song("Levitating", "Dua Lipa", 210));

        // Launch the GUI with the custom MyArrayList
        new MusicAppGUI(library);
    }
}


