package com.company;

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

    public boolean addSong(String title, double duration){
        Song newSong = new Song(title,duration);
        return songs.add(newSong);
    }

    private Song findSong(String title){
        for(int i = 0; i < songs.size(); i++){
            if(songs.get(i).getTitle().equals(title)){
                return songs.get(i);
            }
        }
        return null;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> thePlaylist){
        if(trackNumber - 1 > songs.size()){
            System.out.println("Track" + trackNumber+ " does not exist.");
            return false;
        }
        Song findSong = songs.get(trackNumber - 1);
        if(findSong == null){
            System.out.println("Track does not exist");
            return false;
        }
        return thePlaylist.add(findSong);
    }

    public boolean addToPlayList(String title, LinkedList<Song> thePlaylist){
        Song findSong = findSong(title);
        if(findSong == null){
            System.out.println("Track does not exist");
            return false;
        }
        return thePlaylist.add(findSong);
    }


}
