package com.example.ejemplo_github;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Carro carro1            = new Carro();
        carro1.color            = "negro";
        carro1.marca            = "Toyota";
        carro1.modelo           = 2024;
        carro1.velocidadActual  = 100;
        carro1.encenderCarro();
        carro1.apagarCarro();

        Carro carro2 = new Carro("blanco", "Mazda", 2020, 100);

        Log.e("msg", carro1.mostrarCarro());
        Log.e("msg", carro2.mostrarCarro());


        Automobil miAutomobil = new Automobil("amarillo", "Renault", 2021, 50);
        Log.e("msg", miAutomobil.mostrarCarro());

    }
}