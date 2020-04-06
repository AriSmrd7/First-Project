package com.example.latihansatu_10117162

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class KodeKeluarga : AppCompatActivity() {

    private lateinit var button : Button
    private lateinit var pesan  : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kode_keluarga)
        button = findViewById(R.id.btnMasuk)
        pesan = findViewById(R.id.Kode)
        button.setOnClickListener{
            val warn: String = pesan.text.toString()
            if (warn.trim().length>0) {
                startActivity(Intent(this, DataDiri::class.java))
            }else{
                Toast.makeText(applicationContext,"Tolong masukkin dulu kodenya ya! ",Toast.LENGTH_SHORT).show()
            }
        }
    }
}
