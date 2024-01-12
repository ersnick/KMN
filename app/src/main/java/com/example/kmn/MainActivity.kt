package com.example.kmn

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rockButton: Button = findViewById(R.id.rockButton)
        val scissorsButton: Button = findViewById(R.id.scissorsButton)
        val paperButton: Button = findViewById(R.id.paperButton)

        rockButton.setOnClickListener { onOptionSelected("Камень") }
        scissorsButton.setOnClickListener { onOptionSelected("Ножницы") }
        paperButton.setOnClickListener { onOptionSelected("Бумага") }
    }

    private fun onOptionSelected(option: String) {
        val intent = Intent(this, ResultActivity::class.java)
        intent.putExtra("userChoice", option)
        startActivity(intent)
    }
}
