package com.example.udemycursoskotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_kotlin_extension.*

class KotlinExtensionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin_extension)

        val actionBar = supportActionBar
        actionBar!!.title = "Extension Activity"


        // evento click de la manera java
        val btn = findViewById<Button>(R.id.btnById)
        btn.setOnClickListener {
            Toast.makeText(this, " Click button by id", Toast.LENGTH_SHORT).show()}

        btnByKat.setOnClickListener { Toast.makeText(this, " Click button by Kat", Toast.LENGTH_SHORT).show()}
    }

}

