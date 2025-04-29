package com.example.vibefit

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class TelaInicioAluno : AppCompatActivity() {
    lateinit var btnPerfilAluno: Button
    lateinit var btnSairContaAluno: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tela_inicio_aluno)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.TelaAlunoInicio)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        btnSairContaAluno = findViewById(R.id.btnSairContaAluno)
        btnSairContaAluno.setOnClickListener {
            finish()
        }
        btnPerfilAluno = findViewById(R.id.btnPerfilAluno)
        btnPerfilAluno.setOnClickListener {
            val intent = Intent(this, TelaAlunoPerfil::class.java)
            startActivity(intent)
        }
    }
}