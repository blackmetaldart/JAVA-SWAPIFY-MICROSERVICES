package com.example.songsapi.service;

import com.example.songsapi.model.Song;
import com.example.songsapi.repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SongServiceImpl implements SongService {

    @Autowired
    SongRepository songRepository;


    /**
     * The song repository extends the CrudRepository which has a save method
     * @param song
     * @return
     */
    @Override
    public Song createSong(Song song) {
        return songRepository.save(song);
    }

    /**
     * The SongRepository extends the CrudRepository which has a findAll method
     * @return
     */
    @Override
    public Iterable<Song> listSongs(){
        return songRepository.findAll();
    }
//
    @Override
    public void deleteSongById(Long songId){
        songRepository.deleteById(songId);
    }
}
