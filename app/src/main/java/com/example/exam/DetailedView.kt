package com.example.exam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class DetailedView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailed_view)

        val tDisplay:TextView=findViewById(R.id.textView)
        val btnDisplay:Button=findViewById(R.id.btnDisplay)
        val btnBack:Button=findViewById(R.id.btnBack)
        val DateArray=intent.getStringArrayExtra("ArrayDate")?: arrayOf()
        val MtimeArray=intent.getStringArrayExtra("ArrayMorningTIme")?: arrayOf()
        val AtimeArray=intent.getStringArrayExtra("ArrayAfternoonTime")?: arrayOf()
        val ActNArray=intent.getStringArrayExtra("ArrayActivityNotes")?: arrayOf()

        btnDisplay.setOnClickListener {
            tDisplay.text="Day \n ${DateArray.joinToString ("\n")}"
            //tDisplay.text="Morning Time \n ${MtimeArray.joinToString ("\n")}"
            //tDisplay.text="Afternoon Time \n ${AtimeArray.joinToString ("\n")}"
            //tDisplay.text="Activity Notes \n ${ActNArray.joinToString ("\n")}"
        }


    }


    //var ArrayDate= arrayOf<String>("")
    //var ArrayMtime= arrayOf<String>("")
    //var ArrayAtime= arrayOf<String>("")
    //var ArrayActNotes= arrayOf<String>("")

}