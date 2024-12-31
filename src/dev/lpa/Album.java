package dev.lpa;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist){
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    public boolean addSong(String title, double duration){
        if (findSong(title) == null){
            Song song = new Song(title, duration);
            this.songs.add(song);
            return true;
        }
        return false;
    }

    public Song findSong(String title){
        for (Song song : this.songs){
            if (song.getTitle().equalsIgnoreCase(title)){
                return song;
            }
        }
        return null;
    }

    public boolean addToPlaylist(int trackNumber, LinkedList<Song> playlist){
       int index = trackNumber - 1;
       if ((index >= 0) && (index < songs.size())){
           playlist.add(this.songs.get(index));
           return true;
       }
       return false;
    }

    public boolean addToPlaylist(String title, LinkedList<Song> playlist){
        for (Song s: this.songs){
            if (s.getTitle().equalsIgnoreCase(title)){
                playlist.add(s);
                return true;
            }
        }
        return false;
    }

}
