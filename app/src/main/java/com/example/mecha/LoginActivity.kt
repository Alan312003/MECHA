package com.example.mecha

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val edtcorreo = findViewById<EditText>(R.id.edtCorreo)
        val edtpassword = findViewById<EditText>(R.id.edtPassword)
        val btningresar= findViewById<Button>(R.id.btnLogin)
        val btnregistrar = findViewById<Button>(R.id.btnRegistrar)
        val tvdatos = findViewById<TextView>(R.id.tvDatos)

        btningresar.setOnClickListener {
            val correo = edtcorreo.text.toString()
            val psw= edtpassword.text.toString()

            if (correo.isNotEmpty() && psw.isNotEmpty()){
                Toast.makeText(this, "Campos llenos", Toast.LENGTH_SHORT).show()
            }
            else{
                tvdatos.text = "Llena todos los campos."
                Toast.makeText(this, "faltan llenar los campos", Toast.LENGTH_SHORT).show()
            }

        }

        btnregistrar.setOnClickListener {

        }


    }
}