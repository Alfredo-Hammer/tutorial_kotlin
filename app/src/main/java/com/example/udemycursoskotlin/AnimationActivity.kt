package com.example.udemycursoskotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_animation.*

class AnimationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animation)


        // codigo para animar una imagen
        iv_image.setOnClickListener {
            iv_image.animate().apply {
                duration = 1000
                rotationXBy(360f)
            }.withEndAction {
                iv_image.animate().apply {
                    duration = 1000
                    rotationYBy(3600f)
                }.start()
            }
        }
    }
}
