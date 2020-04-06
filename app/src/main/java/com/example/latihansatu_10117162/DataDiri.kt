package com.example.latihansatu_10117162

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class DataDiri : AppCompatActivity() {

    private lateinit var button : Button
    private lateinit var nama   : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_diri)
        button = findViewById(R.id.btnNext)
        nama   = findViewById(R.id.NamaLengkap)

        button.setOnClickListener{
            val intent = Intent(this, Selamat::class.java)
            intent.putExtra("data1", nama.text.toString())
            startActivity(intent)

        }
    }
}
