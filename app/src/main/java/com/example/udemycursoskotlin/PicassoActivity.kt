package com.example.udemycursoskotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class PicassoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picasso)

        val actionBar = supportActionBar
        actionBar!!.title = "Picasso Activity"
    }
}