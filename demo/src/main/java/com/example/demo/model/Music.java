package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

public class Music  {

    public String id;
    public String name;
    public  String artist;

    public Music(String id, String name, String artist) {this.id=id;
    this.name = name;
    this.artist = artist;
    }
}