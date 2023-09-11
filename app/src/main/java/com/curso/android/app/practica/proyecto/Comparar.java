package com.curso.android.app.practica.proyecto;

public class Comparar {
    public String comparartexto (String textouno, String textodos, String resultado ){
        String textouno = textouno.getText().toString();
        String textodos = textodos.getText().toString();

        if (textouno == textodos) {
            resultado.setText("Los textos son iguales");

        }else{
            resultado.setText("Los textos no son iguales");
        }
    }
}

