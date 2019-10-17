package com.example.usersapi.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import sun.plugin.util.UserProfile;

import javax.persistence.*;
import java.util.ArrayList;

@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "id")
@Entity
@Table(name = "users")
public class User {

    //ID / USERNAME / PASSWORD COLUMNS FOR TABLES
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String username;

    @Column
    private String password;

    //CONNECTS ONE USER TO THE ONE USER PROFILE TABLE
//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name="user_profile_id")
//    private UserProfile userProfile;

    //CONNECTS THE USER TO A USER ROLE
//    @ManyToOne(cascade = {CascadeType.DETACH,
//            CascadeType.MERGE, CascadeType.REFRESH})
//    @JoinColumn(name = "user_role_id", nullable = false)
//    private UserRole userRole;

    //CONNECTS MANY SONGS TO MANY USERS
//    @ManyToMany(fetch = FetchType.LAZY,
//            cascade = {CascadeType.DETACH,
//                    CascadeType.MERGE, CascadeType.REFRESH})
//    @JoinTable(name = "user_song",
//            joinColumns = {@JoinColumn(name = "user_id")},
//            inverseJoinColumns = @JoinColumn(name = "song_id"))
//    private List<Song> songs;

    //AN EMPTY USER CONSTRUCTOR
    public User() {}

//    public List<Song> addSong(Song song){
//        if(songs == null)
//            songs = new ArrayList<>();
//        songs.add(song);
//
//        return songs;
//    }

    //THE GETTERS AND SETTERS FOR THE COLUMNS
//    public List<Song> getSongs(){ return songs; }
//
//    public void setSongs(List<Song> songs) { this.songs = songs; }

//    public UserRole getUserRole() { return userRole; }
//
//    public void setUserRole(UserRole userRole) { this.userRole = userRole; }

//    public UserProfile getUserProfile() { return userProfile; }
//
//    public void setUserProfile(UserProfile userProfile) { this.userProfile = userProfile; }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
