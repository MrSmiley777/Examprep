package com.example.exam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.service.autofill.Validators.or
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_screen)

        val sDate:EditText=findViewById(R.id.editTextDate)
        val sMornTime:EditText=findViewById(R.id.editTextMScrTime)
        val sAftrTime:EditText=findViewById(R.id.editTextAScrTime)
        val sActNotes:EditText=findViewById(R.id.editTextActNotes)
        val btnEnter:Button=findViewById(R.id.btnClear)
        val btnDisplay:Button=findViewById(R.id.btnNext)


        var counter=7
        btnEnter.setOnClickListener {

            val inputMornTime=sMornTime.text.toString()
            val inputAftrTime=sAftrTime.text.toString()
            val inputMornValid:Int?=inputMornTime.toIntOrNull()
            val inputAftrValid:Int?=inputAftrTime.toIntOrNull()

            if (sDate.text.toString().isEmpty() or sMornTime.text.toString().isEmpty() or sAftrTime.text.toString().isEmpty() or sActNotes.text.toString().isEmpty()){
                Toast.makeText(this, "You must enter values in ALL boxes before adding data!", Toast.LENGTH_SHORT).show()
            } else {
                if (inputMornValid == null || inputAftrValid == null){
                    Toast.makeText(this, "You must enter only numbers for the time spent in the morning and afternoon!", Toast.LENGTH_SHORT).show()
                }else{
                    val ArrayDate
                    ArrayDate += sDate.text.toString()
                    ArrayMtime += inputMornTime
                    ArrayAtime += inputAftrTime
                    ArrayActNotes += sActNotes.text.toString()
                    textvieww.text= ArrayDate.toString()
                    //counter+=1
                    sDate.text.clear()
                    sMornTime.text.clear()
                    sAftrTime.text.clear()
                    sActNotes.text.clear()
                }
            }
        }
        btnDisplay.setOnClickListener {
            if (counter==7){
                val intentdetailed= Intent(this,DetailedView::class.java).apply {
                    putExtra("ArrayDate",ArrayDate)
                    putExtra("ArrayMorningTIme",ArrayMtime)
                    putExtra("ArrayAfternoonTime",ArrayAtime)
                    putExtra("ArrayActivityNotes",ArrayActNotes)

                }
                val next=Intent(this,DetailedView::class.java)
                    startActivity(next)

            }else {
                Toast.makeText(this, "You must enter 7 times! As this is a weekly schedule!", Toast.LENGTH_SHORT).show()
            }

        }
    }
}