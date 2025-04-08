package com.example.vibefit

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class TelaCadastro2 : AppCompatActivity() {
    lateinit var btnProxc2: Button
    lateinit var btnFechar2: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tela_cadastro2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.Cadastro2)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets


        }

        btnFechar2 = findViewById(R.id.btnFechar2)
        btnFechar2.setOnClickListener {
            finish()
        }

        btnProxc2 = findViewById(R.id.btnProxc2)
        btnProxc2.setOnClickListener {
            val iprox2 = Intent(this, TelaCadastro3::class.java)
            startActivity(iprox2)
        }
    }
}