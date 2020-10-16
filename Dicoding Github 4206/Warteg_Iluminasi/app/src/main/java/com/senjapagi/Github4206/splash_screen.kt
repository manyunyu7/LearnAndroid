package com.senjapagi.Github4206

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.view.WindowManager
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class splash_screen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener{
            move()
        }

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            val w = window
            w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS)
        }

//        val h : Handler = Handler()
//        h.postDelayed({
//        },3000)
    }
    fun move(){
        val intent = Intent(this,MainActivity::class.java)
        startActivity(intent)
    }
}