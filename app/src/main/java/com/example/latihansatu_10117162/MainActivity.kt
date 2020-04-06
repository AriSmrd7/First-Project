package com.example.latihansatu_10117162

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button

//10117162 - Ari Sumardi - IF4

class MainActivity : AppCompatActivity() {

    private lateinit var button : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button = findViewById(R.id.btnMulai)
        button.setOnClickListener{
            startActivity(Intent(this, KodeKeluarga::class.java))
        }
    }
}
