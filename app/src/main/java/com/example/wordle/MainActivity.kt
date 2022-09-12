package com.example.wordle

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Initializes the layout and loads the widgets into the UI
        val guessEditText = findViewById<EditText>(R.id.guess)
        val button = findViewById<Button>(R.id.button)
        var strValue = guessEditText.text.toString()
        val guessTextView=findViewById<TextView>(R.id.textView)
        button.setOnClickListener(
            guessTextView.text=strValue
        )


    }

    private fun checkGuess(guess: String) : String {
        var result = ""
        for (i in 0..3) {
            if (guess[i] == wordToGuess[i]) {
                result += "O"
            }
            else if (guess[i] in wordToGuess) {
                result += "+"
            }
            else {
                result += "X"
            }
        }
        return result
    }
}
