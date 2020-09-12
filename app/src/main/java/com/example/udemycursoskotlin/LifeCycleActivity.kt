package com.example.udemycursoskotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Toast

class LifeCycleActivity : LifeCycleEventActivity() {

    private var exitEnabled = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_life_cycle)

        val actionBar = supportActionBar
        actionBar!!.title = "Cycle Activity"
    }

    // Codigo para para salir de la app
    override fun onBackPressed() {
        if (exitEnabled) {
            super.onBackPressed()
        }
        exitEnabled = true
        Toast.makeText(this, "Presione de nuevo para cerrar la App", Toast.LENGTH_SHORT).show()
        Handler().postDelayed(Runnable { exitEnabled = false }, 2000)

    }
}