package com.example.kotlinworkspace
import org.junit.Assert.assertTrue
import org.junit.Test

class ExampleUnitTest {

    @Test
    fun generates_numbers() {
        val anotherDice = MainActivity.Dice(6)
        val rollResult = anotherDice.rollDice()
        assertTrue("The value of the rollResult wasn't between 1 and 6", rollResult in 1..6)
    }
}