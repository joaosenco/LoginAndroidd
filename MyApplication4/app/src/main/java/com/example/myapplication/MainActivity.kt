package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var editTextObject = this.findViewById<EditText>(R.id.editTextTextPersonName)
        var button = findViewById<Button>(R.id.button3)
        button.setOnClickListener {
            editTextObject.setText("TEXTO DE EXEMPLO")
        }
    }
}