import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String name;
    private String artist;
    private ArrayList<Song> listOfSongs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.listOfSongs = new ArrayList<Song>();
    }


    public String getName() {
        return name;
    }

    public String getArtist() {
        return artist;
    }

    public ArrayList<Song> getListOfSongs() {
        return listOfSongs;
    }


    private Song findSong(String title) {
        for (Song song : this.listOfSongs) {
            if(song.getTitle().equals(title)) {
                return song;
            }
        }
        return null;
    }

    public boolean addSong(String title, double duration) {
        if (findSong(title) == null) {
            this.listOfSongs.add(new Song(title, duration));
            return true;
        }
        return false;
    }


    public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist) {
        int index = trackNumber - 1;
        if ((index > 0) && (index < this.listOfSongs.size())) {
            playlist.add(this.listOfSongs.get(index));
            System.out.println("Song: " + this.listOfSongs.get(index).getTitle() + " has been stored to playlist: " + playlist + ".");
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playlist) {
        Song searchedSong = findSong(title);
        if(searchedSong != null) {
            playlist.add(searchedSong);
            System.out.println("Song: " + title + " has been stored to playlist: " + playlist + ".");
            return true;
        }
        System.out.println("The song " + title + " is not in this album");
        return false;
    }



}
