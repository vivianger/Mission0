package com.example.demo;

import com.example.demo.model.Music;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MusicController {

    @Autowired
    private MusicService service;

    @GetMapping ("/music/musicList")
    public List<Music> getList(){
        return MusicService.getList();
    }


    @GetMapping ("/music/{id}")
    public Music getMusic(@PathVariable("id") String id) {
        return MusicService.getMusic(id);
    }
    @PostMapping("/music/addMusic")
    public void addMusic(@RequestBody Music music) {
       MusicService.addMusic(music);
    }

    @PutMapping("/music/updateMusic/{id}")
    public void updateMusic(@RequestBody Music music, @PathVariable("id")String  id){
        MusicService.updateMusic(music,id);
    }

    @DeleteMapping("/music/deleteMusic/{id}")
    public void deleteMusic(@PathVariable("id") String ring id){
        MusicService.deleteMusic(id);
    }
}
