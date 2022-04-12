package com.example.zanzibar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var clickLeftbutton:Button = findViewById(R.id.roll)
        var clickRightbutton:Button = findViewById(R.id.roll1)
        var leftDice:ImageView = findViewById(R.id.firstDice)
        var rightDice:ImageView = findViewById(R.id.secondDice)
        var sum:Int = 0
        var score:TextView = findViewById(R.id.currentScore)
        var player1Score:Int = 0
        var scoreP1:TextView = findViewById(R.id.score)
        var scoreP2:TextView = findViewById(R.id.score2)
        var player2Score:Int = 0

        clickLeftbutton.setOnClickListener {
            val randomDiceNum = Random.nextInt(1,7)
            val randomDIceNum2 = Random.nextInt(1,7)
            sum = randomDIceNum2 + randomDiceNum
            if (randomDIceNum2 == randomDiceNum){
                sum *= 2
            }
            if((randomDiceNum == 5 && randomDIceNum2 == 6 )|| (randomDIceNum2 == 5 && randomDiceNum == 6)){
                findViewById<TextView>(R.id.result).text = "PLAYER1 WIN !!!"
                findViewById<ImageView>(R.id.win_pic).setImageResource(R.drawable.ic__win)
                clickLeftbutton.isClickable = false
            }
            if(player1Score >= 111){
                findViewById<TextView>(R.id.result).text = "PLAYER1 WIN !!!"
                findViewById<ImageView>(R.id.win_pic).setImageResource(R.drawable.ic__win)
                clickLeftbutton.isClickable = false

            }
            score.text = sum.toString()
            player1Score += sum
            scoreP1.text = player1Score.toString()
            when(randomDIceNum2){
                1 -> rightDice.setImageResource(R.drawable.ic_dice_1)
                2 -> rightDice.setImageResource(R.drawable.ic_dice_2)
                3 -> rightDice.setImageResource(R.drawable.ic_dice_3)
                4 -> rightDice.setImageResource(R.drawable.ic_dice_4)
                5 -> rightDice.setImageResource(R.drawable.ic_dice_5)
                6 -> rightDice.setImageResource(R.drawable.ic_dice_6)
            }
            when (randomDiceNum){
                1 -> leftDice.setImageResource(R.drawable.ic_dice_1)
                2 -> leftDice.setImageResource(R.drawable.ic_dice_2)
                3 -> leftDice.setImageResource(R.drawable.ic_dice_3)
                4 -> leftDice.setImageResource(R.drawable.ic_dice_4)
                5 -> leftDice.setImageResource(R.drawable.ic_dice_5)
                6 -> leftDice.setImageResource(R.drawable.ic_dice_6)
            }
        }
        clickRightbutton.setOnClickListener {
            val randomDiceNum = Random.nextInt(1,7)
            val randomDIceNum2 = Random.nextInt(1,7)
            sum = randomDIceNum2 + randomDiceNum
            if (randomDIceNum2 == randomDiceNum) {
                sum *= 2
            }
            if((randomDiceNum == 5 && randomDIceNum2 == 6 )|| (randomDIceNum2 == 5 && randomDiceNum == 6)){
                findViewById<TextView>(R.id.result).text = "PLAYER2 WON!!!"
                findViewById<ImageView>(R.id.win_pic).setImageResource(R.drawable.ic__win)
                clickRightbutton.isClickable = false

            }
            if(player2Score >= 111){
                findViewById<TextView>(R.id.result).text = "PLAYER2! WIN !!!"
                findViewById<ImageView>(R.id.win_pic).setImageResource(R.drawable.ic__win)
                clickRightbutton.isClickable = false

            }



            score.text = sum.toString()
            player2Score += sum
            scoreP2.text = player2Score.toString()
            when(randomDIceNum2){
                1 -> leftDice.setImageResource(R.drawable.ic_dice_1)
                2 -> leftDice.setImageResource(R.drawable.ic_dice_2)
                3 -> leftDice.setImageResource(R.drawable.ic_dice_3)
                4 -> leftDice.setImageResource(R.drawable.ic_dice_4)
                5 -> leftDice.setImageResource(R.drawable.ic_dice_5)
                6 -> leftDice.setImageResource(R.drawable.ic_dice_6)
            }
            when (randomDiceNum) {
                1 -> rightDice.setImageResource(R.drawable.ic_dice_1)
                2 -> rightDice.setImageResource(R.drawable.ic_dice_2)
                3 -> rightDice.setImageResource(R.drawable.ic_dice_3)
                4 -> rightDice.setImageResource(R.drawable.ic_dice_4)
                5 -> rightDice.setImageResource(R.drawable.ic_dice_5)
                6 -> rightDice.setImageResource(R.drawable.ic_dice_6)
            }
        }

    }
}