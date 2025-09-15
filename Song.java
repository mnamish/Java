package Final;

public class Song {
    String title;
    String artist;
    int duration; // in seconds

    public Song(String title, String artist, int duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    public String toString() {
        return title + " by " + artist + " (" + duration + "s)";
    }
}
