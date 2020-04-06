package com.example.latihansatu_10117162

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class DataDiri : AppCompatActivity() {

    private lateinit var button : Button
    private lateinit var nama   : EditText
    private lateinit var umur   : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_diri)
        button = findViewById(R.id.btnNext)
        nama   = findViewById(R.id.NamaLengkap)
        umur   = findViewById(R.id.Umur)

        button.setOnClickListener{
            val warn: String = nama.text.toString()
            val warn2: String = umur.text.toString()

            if (warn.trim().length>0 && warn2.trim().length>0) {
                val intent = Intent(this, Selamat::class.java)
                intent.putExtra("data1", nama.text.toString())
                startActivity(intent)
            }else{
                Toast.makeText(applicationContext,"Tolong isi dulu dengan benar ya! ", Toast.LENGTH_SHORT).show()
            }


        }
    }
}
