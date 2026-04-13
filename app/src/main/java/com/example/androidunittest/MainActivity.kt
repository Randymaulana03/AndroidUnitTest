package com.example.androidunittest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private val calculator = Calculator()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnAdd = findViewById<Button>(R.id.btnAdd)
        val resultText = findViewById<TextView>(R.id.resultText)

        btnAdd.setOnClickListener {
            val result = calculator.add(2, 3)
            resultText.text = result.toString()
        }
    }
}