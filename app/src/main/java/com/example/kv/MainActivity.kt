package com.example.kv

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var magazineButton:Button = findViewById<Button>(R.id.magazineBtn)

        magazineButton.setOnClickListener {
            val intent = Intent(this,Magazine::class.java)
            startActivity(intent)
        }
    }
}
