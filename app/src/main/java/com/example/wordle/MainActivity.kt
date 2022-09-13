package com.example.wordle

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import org.w3c.dom.Text


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Initializes the layout and loads the widgets into the UI

        var theWord=FourLetterWordList.FourLetterWordList.getRandomFourLetterWord()
        val theWordTextView=findViewById<TextView>(R.id.textView14)
        theWordTextView.setText("the word: "+ theWord)
        //Assigns the random 4-letter word to the temporary textview

        var counter=1
        val guessEditText = findViewById<EditText>(R.id.guess)
        val button = findViewById<Button>(R.id.button)
        val guessTextView=findViewById<TextView>(R.id.textView)
        button.setOnClickListener(View.OnClickListener {
            if(counter<4){
                var strValue = guessEditText.text.toString()
                guessTextView.setText(strValue)
                if (counter==1){
                        val guess1=findViewById<TextView>(R.id.n1)
                        guess1.setText(strValue)
                    }
                    else if(counter==2){
                        val guess2=findViewById<TextView>(R.id.n2)
                        guess2.setText(strValue)
                    }
                    else if (counter==3){
                        val guess3=findViewById<TextView>(R.id.n3)
                        guess3.setText(strValue)
                    }
                counter++
                }
            //CHECK: the TextViews have to be finally working!!!

            else{
                Toast.makeText(it.context, "You have exceeded your number of attempts!", Toast.LENGTH_SHORT).show()
                button.isEnabled = false
                button.isClickable=false
                button.text="Reset"
                //Alerts the user, disables and greys out the button, changes text to Reset
            }
            })

         fun checkGuess(guess: String) : String {
            var result = ""
            theWord=theWord.uppercase()
            for (i in 0..3) {
                if (guess[i] == theWord[i]) {
                    result += "O"
                }
                else if (guess[i] in theWord) {
                        result += "+"
                    }
                else {
                    result += "X"
                }
            }
            return result
        }
        }

        // Textview from EditText is sent to the main Textview
    }


