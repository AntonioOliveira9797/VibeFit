package com.example.vibefit

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class TelaCadastro1 : AppCompatActivity() {
    lateinit var btnProxC1: Button
    lateinit var btnFechar1: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tela_cadastro1)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.Cadastro1)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets


        }
        btnFechar1 = findViewById(R.id.btnFechar1)
        btnFechar1.setOnClickListener {
            finish()
        }

        btnProxC1 = findViewById(R.id.btnProxC1)
        btnProxC1.setOnClickListener {
            val iprox1 = Intent(this, TelaCadastro2::class.java)
            startActivity(iprox1)
        }
    }
}