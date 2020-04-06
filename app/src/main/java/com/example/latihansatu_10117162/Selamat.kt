package com.example.latihansatu_10117162

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_selamat.*

class Selamat : AppCompatActivity() {

    private lateinit var datanama : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_selamat)

        datanama = findViewById(R.id.txtNama)

        if(intent.extras != null)
        {
            txtNama.setText(intent.getStringExtra("data1"))
        }
    }

}
