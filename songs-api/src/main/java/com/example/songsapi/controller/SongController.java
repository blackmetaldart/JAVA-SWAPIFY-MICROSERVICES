package com.example.songsapi.controller;

import com.example.songsapi.model.Song;
import com.example.songsapi.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class SongController {

    @Autowired
    SongService songService;

    @GetMapping("/list")
    public Iterable<Song> showSongs(){
        return songService.listSongs();
    }

    @PostMapping("/create")
    public Song createSong(@RequestBody Song song){
        return songService.createSong(song);
    }

    @DeleteMapping("/delete/{songId}")
    public void deleteSong(@PathVariable Long songId){
        songService.deleteSongById(songId);
    }
}
