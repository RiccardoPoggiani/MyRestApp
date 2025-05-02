package com.example.poggiani_myrestapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val name = findViewById<EditText>(R.id.editTextName)
        val pwd = findViewById<EditText>(R.id.editTextPassword)
        val btn = findViewById<Button>(R.id.buttonLogIn)

        btn.setOnClickListener {

            val Intent = Intent(this, SecondActivity::class.java).apply {
                putExtra("name", name)
            }

            startActivity(Intent)
        }

        }
    }
}