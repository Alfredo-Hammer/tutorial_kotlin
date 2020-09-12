package com.example.udemycursoskotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ListViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)

        val actionBar = supportActionBar
        actionBar!!.title = "List View Activity"
    }
}