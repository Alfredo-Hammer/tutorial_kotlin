package com.example.udemycursoskotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class PermissionsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_permissions)

        val actionBar = supportActionBar
        actionBar!!.title = "Permissions Activity"
    }
}