package com.example.nighteventquixada

class Event {
    var title: String = "";
    var description: String = "";
    var idImage: Int = 0;

    constructor(title: String, description: String, idImage: Int) {
        this.title = title;
        this.description = description;
        this.idImage = idImage;
    }
}