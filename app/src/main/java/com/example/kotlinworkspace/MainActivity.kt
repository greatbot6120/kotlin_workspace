package com.example.kotlinworkspace

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.math.log

private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {

    //testing the log messages
    /*fun loggingDivision(num: Int, den: Int) {
        var denReassign = den
        repeat(5) {
            Log.v(TAG, "${num / denReassign}")
            denReassign--
        }
    }*/

    fun logging() {
        Log.v(TAG, "Hello World!!")
        Log.e(TAG, "THIS IS AN ERROR")
    }

    class Dice(private val diceSides: Int) {
        fun rollDice(): Int {
            return (1..diceSides).random()
        }
    }

    private fun setDiceImage(numberToAssociate: Int) {
        val diceImage: ImageView = findViewById(R.id.diceImage)
        when(numberToAssociate) {
            1 -> diceImage.setImageResource(R.drawable.dice_1)
            2 -> diceImage.setImageResource(R.drawable.dice_2)
            3 -> diceImage.setImageResource(R.drawable.dice_3)
            4 -> diceImage.setImageResource(R.drawable.dice_4)
            5 -> diceImage.setImageResource(R.drawable.dice_5)
            6 -> diceImage.setImageResource(R.drawable.dice_6)
        }
    }

    private fun rollDice() {
        val myFirstDice = Dice(6)
        val returnValueDiceRoll = myFirstDice.rollDice()

        setDiceImage(returnValueDiceRoll)

        //val diceResult: TextView = findViewById(R.id.diceRollResult)
        //diceResult.text = returnValueDiceRoll.toString()
    }

    private fun startDiceRoll() {
        val rollButton: Button = findViewById(R.id.rollButton)
        rollButton.setOnClickListener {
            //val displayMessage = Toast.makeText(this, "Dice Rolled!!", Toast.LENGTH_SHORT)
            Toast.makeText(this, "Dice Rolled!!", Toast.LENGTH_SHORT).show()    //without creating the variable
            //diceResult.text = "6"
            rollDice()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //my code
        startDiceRoll()
        logging()
        //loggingDivision(60, 4)

    }
}