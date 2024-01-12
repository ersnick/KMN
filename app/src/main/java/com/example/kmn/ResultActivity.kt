package com.example.kmn

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val userChoice = intent.getStringExtra("userChoice")
        val computerChoice = generateComputerChoice()
        val result = determineResult(userChoice, computerChoice)

        val resultTextView: TextView = findViewById(R.id.resultTextView)
        resultTextView.text = "Пользователь: $userChoice\nКомпьютер: $computerChoice\nРезультат: $result"
    }

    private fun generateComputerChoice(): String {
        val choices = arrayOf("Камень", "Ножницы", "Бумага")
        return choices.random()
    }

    private fun determineResult(userChoice: String?, computerChoice: String): String {
        if (userChoice == computerChoice) return "Ничья"
        return when {
            (userChoice == "Камень" && computerChoice == "Ножницы") ||
                    (userChoice == "Ножницы" && computerChoice == "Бумага") ||
                    (userChoice == "Бумага" && computerChoice == "Камень") -> "Победа"
            else -> "Поражение"
        }
    }
}
