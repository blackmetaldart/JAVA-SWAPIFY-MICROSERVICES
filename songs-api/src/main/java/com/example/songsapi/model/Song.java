package com.example.songsapi.model;

import javax.persistence.*;

@Entity
@Table(name = "song")
public class Song {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column
    public String title;

    @Column
    public int songLength;

    @Column
    public String artist;

    public Song (){}

    public Song(String title, int songLength, String artist) {
        this.title = title;
        this.songLength = songLength;
        this.artist = artist;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle() {return title;}

    public void setArtist(String artist) {this.artist = artist;}

    public String getArtist() {return artist;}

    public void setSongLength(int songLength) {this.songLength = songLength;}

    public int getSongLength() {return songLength;}
}
