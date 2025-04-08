package com.example.vibefit

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var btnLogin: Button
    lateinit var btnCriarConta: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.Cadastro1)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets


        }

        btnCriarConta = findViewById(R.id.btnCriarConta)
        btnCriarConta.setOnClickListener {
            val icCadastro1 = Intent(this, TelaCadastro1::class.java)

            startActivity(icCadastro1)
        }

        btnLogin = findViewById(R.id.btnLogin)
        btnLogin.setOnClickListener {
            val intent = Intent(this, TelaLogin::class.java)

            startActivity(intent)
        }
    }
}