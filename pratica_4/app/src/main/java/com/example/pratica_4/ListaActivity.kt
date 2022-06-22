package com.example.pratica_4

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ListaActivity: AppCompatActivity() {
    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_lista)
        setSupportActionBar(findViewById(R.id.tbrLista))
        title = "Cardápio O Rei do Hamburguer"

        val recipes = arrayOf("\nX-Hamburger \nHamburguer com queijo simples.\nR$5,00\n", "\nX-tudo \nHamburguer, queijo, tomate, cebola, picles, ovo, salsicha e molho da casa.\nR$15,00\n", "\nX-egg \nHamburguer, queijo, tomate, cebola, ovo e molho da casa\nR$10,00\n", "\nX-salada \nHamburguer, queijo, tomate, cebola, alface, picles e molho da casa\nR$10,00\n")
        var adaptador = ArrayAdapter<String>(this,
            android.R.layout.simple_list_item_1, recipes)

        val lista = findViewById<ListView>(R.id.lstLista)
        lista.adapter = adaptador

        val botao = findViewById<FloatingActionButton>(R.id.fabAdicionar)
        botao.setOnClickListener {
            val intencao = Intent(applicationContext, CadastroActivity::class.java)
            startActivity(intencao)
        }

        botao.setOnLongClickListener{
            return@setOnLongClickListener false
        }

        botao.setOnTouchListener{ view, motionEvent ->
            return@setOnTouchListener false
        }
    }

}