package com.example.exam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val eNextbutton:Button=findViewById(R.id.Next)
        val eExitbutton:Button=findViewById(R.id.quit)

        eNextbutton.setOnClickListener {
            val intentNext=Intent(this,MainScreen::class.java)
            startActivity(intentNext)
        }
        eExitbutton.setOnClickListener {
            System.exit(0)
        }
    }



}