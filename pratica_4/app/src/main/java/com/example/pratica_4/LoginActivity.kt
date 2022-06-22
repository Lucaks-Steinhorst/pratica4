package com.example.pratica_4

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.KeyEvent
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_login)

        val botao = findViewById<Button>(R.id.btnEntrar)
        botao.setOnClickListener {
            val intencao = Intent(applicationContext, ListaActivity::class.java)
            startActivity(intencao)
        }

        val campo = findViewById<EditText>(R.id.edtEmail)
        val campo2 = findViewById<EditText>(R.id.edtSenha)
        campo.setOnKeyListener{ view, i, keyEvent ->
            if (keyEvent.action == KeyEvent.ACTION_DOWN && i == KeyEvent.KEYCODE_ENTER) {
                campo2.requestFocus()
                return@setOnKeyListener true
            } else false
        }
    }
}