package com.example.latihansatu_10117162

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class KodeKeluarga : AppCompatActivity() {

    private lateinit var button : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kode_keluarga)
        button = findViewById(R.id.btnMasuk)
        button.setOnClickListener{
            startActivity(Intent(this, DataDiri::class.java))
        }
    }
}
