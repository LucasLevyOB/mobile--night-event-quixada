package com.example.nighteventquixada

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val events = ArrayList<Event>();
        events.add(Event("Matulão", "Gastrobar regional na cidade de Quixadá. Somos a cara do NORDESTE!", R.drawable.matulao));
        events.add(Event("Rustik", "Uma nova experiência em gastrobar, que traz para Quixadá opções de refeições regionais com toques sofisticados e bebidas no ponto que você gosta!", R.drawable.rustik));

        val recyclerView = findViewById<RecyclerView>(R.id.rv_list);
        recyclerView.layoutManager = LinearLayoutManager(this);
        recyclerView.setHasFixedSize(true);
        recyclerView.adapter = Adapter(events);
    }
}