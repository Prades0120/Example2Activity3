package com.example.example2activity3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.math.sqrt

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textNum1 = findViewById<TextView>(R.id.editTextCateto)
        val textNum2 = findViewById<TextView>(R.id.editTextCateto2)
        val button = findViewById<Button>(R.id.button)
        val hipotenusa = findViewById<TextView>(R.id.textViewHipotenusa)

        button.setOnClickListener {
            val num = textNum1.text.toString().toDouble()
            val num2 = textNum2.text.toString().toDouble()
            val numH = sqrt((num*num)+(num2*num2)).toString()
            hipotenusa.text = numH
        }
    }
}