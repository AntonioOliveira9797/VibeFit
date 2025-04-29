package com.example.vibefit

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class EsqueciSenha : AppCompatActivity() {
    lateinit var btnSairEsqSenha: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_esqueci_senha)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.EsqueciSenhaP)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        btnSairEsqSenha = findViewById(R.id.btnSairEsqSenha)
        btnSairEsqSenha.setOnClickListener {
            finish()
        }

    }
}