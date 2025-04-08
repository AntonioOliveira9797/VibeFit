package com.example.vibefit

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class TelaCadastro3 : AppCompatActivity() {
    lateinit var btnFinalizarCadastro: Button
    lateinit var btnFechar3: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tela_cadastro3)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnFechar3 = findViewById(R.id.btnFechar3)
        btnFechar3.setOnClickListener {
            finish()
        }
        btnFinalizarCadastro = findViewById(R.id.btnFinalizarCadastro)
        btnFinalizarCadastro.setOnClickListener {
            val intent = Intent(this@TelaCadastro3, MainActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(intent)
            finish() //
        }

    }
}