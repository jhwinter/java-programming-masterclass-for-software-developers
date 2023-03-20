package academy.learnprogramming;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    private Song findSong(String songTitle) {
        for (Song song : this.songs) {
            if (song.getTitle().equals(songTitle)) {
                return song;
            }
        }
        return null;
    }

    public boolean addSong(String songTitle, double songDuration) {
        if (findSong(songTitle) != null) {
            return false;
        }
        songs.add(new Song(songTitle, songDuration));
        return true;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist) {
        int index = trackNumber - 1;
        if (index < 0 || index > songs.size()) {
            return false;
        }
        Song song = songs.get(index);
        playlist.add(song);
        return true;
    }

    public boolean addToPlayList(String songTitle, LinkedList<Song> playlist) {
        Song song = findSong(songTitle);
        if (song == null) {
            return false;
        }
        playlist.add(song);
        return true;
    }
}
