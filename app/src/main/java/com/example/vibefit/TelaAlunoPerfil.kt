package com.example.vibefit

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.vibefit.fragments.EnderecFragment
import com.example.vibefit.fragments.FichaMaluno
import com.example.vibefit.fragments.InfoPessoaisFragment

class TelaAlunoPerfil : AppCompatActivity() {

    private lateinit var btnInfoPerfilAluno: Button
    private lateinit var btnEnderecoPerfilAluno: Button
    private lateinit var btnFMAlunoPerfil: Button
    lateinit var btnFecharAlunoPerfil: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tela_aluno_perfil)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.TelaAlunoPerfil)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        btnInfoPerfilAluno = findViewById(R.id.btnInfoPerfilAluno)
        btnEnderecoPerfilAluno = findViewById(R.id.btnEnderecoPerfilAluno)
        btnFMAlunoPerfil = findViewById(R.id.btnFMAlunoPerfil)
        btnFecharAlunoPerfil = findViewById(R.id.btnFecharAlunoPerfil)

        btnFecharAlunoPerfil.setOnClickListener {
            finish()
        }

        btnFMAlunoPerfil.setOnClickListener {
            val fragmentManager3 = supportFragmentManager.beginTransaction()
            fragmentManager3.replace( R.id.FragmentAlunoTelas, FichaMaluno())
            fragmentManager3.commit()
        }

        btnInfoPerfilAluno.setOnClickListener {
        val fragmentManager = supportFragmentManager.beginTransaction()
        fragmentManager.replace( R.id.FragmentAlunoTelas, InfoPessoaisFragment())
        fragmentManager.commit()
    }
        btnEnderecoPerfilAluno.setOnClickListener {
        val fragmentManager2 = supportFragmentManager.beginTransaction()
            fragmentManager2.replace( R.id.FragmentAlunoTelas, EnderecFragment())
            fragmentManager2.commit()
        }
    }


}