package com.example.udemycursoskotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class ClickEventActivity : AppCompatActivity(), View.OnLongClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_click_event)

        val actionBar = supportActionBar
        actionBar!!.title = "Click Event Activity"

        clickInLine()

        val btn1 = findViewById<Button>(R.id.buttonClickMulti_1)
        val btn2 = findViewById<Button>(R.id.buttonClickMulti_2)
        val btn3 = findViewById<Button>(R.id.buttonClickMulti_3)


        btn1.setOnLongClickListener(this)
        btn2.setOnLongClickListener(this)
        btn3.setOnLongClickListener(this)

    }

    // boton click desde el xml
    fun xmlClick(view: View) {
        Toast.makeText(this, "Click en boton xml", Toast.LENGTH_SHORT).show()
    }

    // boton con click privado
    private fun clickInLine() {
        val btn = findViewById<Button>(R.id.buttonClickInLine)
        btn.setOnClickListener {
            Toast.makeText(this, "Click in line", Toast.LENGTH_SHORT).show()
        }
    }

    // Boton con click Largo
    override fun onLongClick(view: View): Boolean {
        when (view.id) {
            R.id.buttonClickMulti_1 -> Toast.makeText(
                this,
                "Click en boton multi 1",
                Toast.LENGTH_SHORT
            ).show()
            R.id.buttonClickMulti_2 -> Toast.makeText(
                this,
                "Click en boton multi 2",
                Toast.LENGTH_SHORT
            ).show()
            R.id.buttonClickMulti_3 -> Toast.makeText(
                this,
                "Click en boton multi 3 ",
                Toast.LENGTH_SHORT
            ).show()
        }
        return true
    }


}