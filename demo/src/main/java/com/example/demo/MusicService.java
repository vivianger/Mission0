package com.example.demo;

import com.example.demo.model.Music;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

@Service
public class MusicService {

    private static List<Music> musicList = new ArrayList<>(Arrays.asList(

            new Music("1", "Song1", "x"),
            new Music("2", "Hello", "XX"),
            new  Music("3", "Goodbye", "XXX")

    ));

    public static List<Music> getList(){
        return musicList;
    }

    public static Music getMusic(String id) {
        return musicList.stream().filter(topic -> topic.getId().equals(id)).findFirst().get();
    }

    public static void addMusic(Music music){
        musicList.add(music);
    }

    public static void updateMusic(Music music, String id) {
        int counter = 0;
        for (Music music1 : musicList) {
            if (music1.getId().equals(id)) {
                musicList.set(counter, music);
            }
            counter++;
        }
    }
    public static void deleteMusic(String id){
    musicList.removeIf(music ->  music.getId().equals(id));

    }

}
