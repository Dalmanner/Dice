package com.example.dice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dice: Button = findViewById(R.id.dice);
        dice.setOnClickListener { rollDice() }
    }

    private fun rollDice() {
        val resultText: TextView = findViewById(R.id.result);
        val randomInt = (1..6).random()
        resultText.text = randomInt.toString()
        Toast.makeText(this, "Dice Rolled", Toast.LENGTH_SHORT).show();
    }
}