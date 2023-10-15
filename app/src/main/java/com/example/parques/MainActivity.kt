package com.example.parques

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.parques.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bGuardar.setOnClickListener{
            Log.d("Nombre", binding.nombre.text.toString())
            Log.d("Descripción", binding.descripcion.text.toString())
            Log.d("Teléfono", binding.telefono.text.toString())
            Log.d("Web", binding.web.text.toString())
            Log.d("Hora de apertura", binding.hApertura.selectedItem.toString())
            Log.d("Hora de cierre", binding.hCierre.selectedItem.toString())

            if(binding.cBdeportes.isChecked) Log.d("Deportes", binding.cBdeportes.text.toString())
            if(binding.cBParque.isChecked) Log.d("Parque Infantil", binding.cBParque.text.toString())
            if(binding.cBRestaurante.isChecked) Log.d("Restaurante", binding.cBRestaurante.text.toString())
            if(binding.cBMascotas.isChecked) Log.d("Zona de mascotas", binding.cBMascotas.text.toString())

        }
    }
}