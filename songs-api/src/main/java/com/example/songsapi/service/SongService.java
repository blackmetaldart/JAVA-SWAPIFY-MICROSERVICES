package com.example.songsapi.service;

import com.example.songsapi.model.Song;


public interface SongService {

    public Song createSong(Song song);

    public Iterable<Song> listSongs();

    public void deleteSongById(Long songId);
}