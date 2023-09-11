package com.curso.android.app.practica.proyecto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.view.View
import android.widget.EditText
import android.widget.TextView


class MainActivity() : AppCompatActivity(){
    //Defino las variables

    lateinit var textouno: EditText
    lateinit var textodos: EditText
    lateinit var resultado: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }
    private fun init() {

        textouno = findViewById(R.id.textouno)
        textodos = findViewById(R.id.textouno)
        resultado = findViewById(R.id.resultado)
    }
            }

