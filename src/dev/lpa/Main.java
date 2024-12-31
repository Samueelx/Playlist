package dev.lpa;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Album> albums = new ArrayList<>();
        /**
         * HNDRXX Album
         */
        Album hndrxx = new Album("HNDRXX", "Future");
        hndrxx.addSong("My Collection", 4.25);
        hndrxx.addSong("Coming Out Strong", 4.25);
        hndrxx.addSong("Looking Exotic", 3.75);
        hndrxx.addSong("Damage", 4.0);
        hndrxx.addSong("Use Me", 4.25);
        hndrxx.addSong("Incredible", 4.0);
        hndrxx.addSong("Testify", 3.0);
        hndrxx.addSong("Fresh Air", 4.5);
        hndrxx.addSong("Neva Missa Lost", 4.0);
        hndrxx.addSong("Keep Quiet", 3.33);
        hndrxx.addSong("Hallucinating", 3.66);
        hndrxx.addSong("Turn On Me", 4.4);

        /**
         * After Hours Album
         */
        Album afterHours = new Album("After Hours", "The Weeknd");
        afterHours.addSong("Alone Again", 4.1);
        afterHours.addSong("Too Late", 4.0);
        afterHours.addSong("Hardest To Love", 3.5);
        afterHours.addSong("Scared To Live", 3.1);
        afterHours.addSong("Snowchild", 4);
        afterHours.addSong("Escape From LA", 5.9);
        afterHours.addSong("Heartless", 3.3);
        afterHours.addSong("Faith", 4.75);
        afterHours.addSong("Blinding Lights", 3.3);
        afterHours.addSong("In Your Eyes", 4.0);
        afterHours.addSong("Save Your Tears", 3.55);
        afterHours.addSong("Repeat After Me", 3.25);
        afterHours.addSong("After Hours", 6.0);
        afterHours.addSong("Until I Bleed Out", 3.1);

        albums.add(hndrxx);
        albums.add(afterHours);
        for (Album album: albums){
            System.out.println(album.toString());
        }

        //LinkedList<Song> playlist = new LinkedList<>();


    }
}
