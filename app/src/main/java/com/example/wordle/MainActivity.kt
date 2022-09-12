package com.example.wordle

import android.os.Bundle
import android.view.View
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
        val guessTextView=findViewById<TextView>(R.id.textView)
        val textView1=findViewById<TextView>(R.id.textView4)
        button.setOnClickListener(View.OnClickListener {
            var strValue = guessEditText.text.toString()
            guessTextView.setText(strValue)
            textView1.setText(strValue)
        })
        // Textview from edittext is sent to the main textview

    }

//    private fun checkGuess(guess: String) : String {
//        var result = ""
//        for (i in 0..3) {
//            if (guess[i] == wordToGuess[i]) {
//                result += "O"
//            }
//            else if (guess[i] in wordToGuess) {
//                result += "+"
//            }
//            else {
//                result += "X"
//            }
//        }
//        return result
//    }
}
