# 📚 Kotlin

#### Hello World

```kotlin
fun main() { //fun is a keyword of kotlin for creating a new function, fun main() {...} must always exist 
	println("Hello World!")
	//print() doesn't create a new line
}
```

#### Create and using variables

```kotlin
val myVariable = 50  			//it can only be set once with this method
val anotherVariable = 21 * 3
val myNameVariable = "Ivan"
${myVariable} 		 		//use the variable inside a print statement
${anotherVariable}
${...}
...

```

#### Create a function

```kotlin
fun myNiceLittleFunction() {
	print("Some pretty text")
}

fun main() {
	myNiceLittleFunction()		//use or call the function
}

```

> *Do something __many times__ :*

```kotlin
repeat(23) {
	println("Some pretty text")
}
```

#### Using arguments

```kotlin
fun myNiceLittleFunction(myPrettyText: String) {	//define what type of argument is going through
	repeat(23) {
		println(myPrettyText)
	}
}

fun main() {
	val myPrettyText = "Who's a good boy?"		//declaring a string variable
	myNiceLittleFunction(myPrettyText)		//using the identifier as an argument
}
```

> *Two or more arguments :*

```kotlin
fun myNiceLittleFunction(myPrettyText: String, repeatText: Int) {	//define what type of argument is going through
	repeat(repeatText) {
		println(myPrettyText)
	}
}

fun main() {
	val repeatText = 23
	val myPrettyText = "Who's a good boy?"				//declaring a string variable
	myNiceLittleFunction(myPrettyText, repeatText)			//using the identifier as an argument
}
```

#### Dice Roll example

> *Roll random numbers using the __IntRange__ :*

```kotlin
fun main() {
	val numberDiceRange = 1..6 //intRange, a range of values of type Int
	val randomNumber = numberDiceRange.random()
	println("Random number from the dice: ${randomNumber}")
}
```

> *Create a Dice __Class__ and create the method for rolling the Dice :*

```kotlin
fun main() {
	val myFirstDice = Dice()
	println(myFirstDice.diceSides)
	myFirstDice.rollDice()
}

class Dice {
	var diceSides = 6
	fun rollDice() {				//method inside the class Dice
		val randomNumber = (1..6).random()	//another way to use the IntRange
		println("Random number from the dice: ${randomNumber}")
	}
}
```

> *__Return__ the dice roll value :*

```kotlin
fun main() {
	val myFirstDice = Dice()
	println(myFirstDice.diceSides)
	val returnValueDiceRoll = myFirstDice.rollDice()
	println(returnValueDiceRoll)
}

class Dice {
	var diceSides = 6
	fun rollDice(): Int {					//data type of Int will be returned to main()			
		val randomNumber = (1..6).random()		//we can write also (1..diceSides).random
		return randomNumber
	}
}
```

> *Modify the class definition for __accepting arguments__ and a __little refractoring__ :*

```kotlin
fun main() {
	val myFirstDice = Dice(20)				//call the class with the correct data type 
	//val returnValueDiceRoll = myFirstDice.rollDice()
	println("${myFirstDice.rollDice()}")
}

class Dice(val diceSides: Int ) {				//class definition modified, accepting an Integer
	//var diceSides = 6
	fun rollDice(): Int {								
		//val randomNumber = (1..diceSides).random()
		return (1..diceSides).random()			//we got rid of the randomNumber variable and return the essential
	}
}
```

#### Conditions and loops

> *__if-else__ statement :*

```kotlin
fun main() {
	if((1..20).random() > 10) {
		println("Greater than 10")
	} else {
		println("Less than 10")
	}
}
```

> *__When__ statement :*

```kotlin
fun displayUnluckyNumber(unluckyNumber: Int) {
	println("${unluckyNumber} isn't the lucky number")
}
fun main() {
	var luckyNumber = 4
	var randomDiceRoll = (1..6).random()

	when(randomDiceRoll) {
		luckyNumber -> println("You win!!")
		1 -> displayUnluckyNumber(1)
		2 -> displayUnluckyNumber(2)
		3 -> displayUnluckyNumber(3)
		5 -> displayUnluckyNumber(5)
		6 -> displayUnluckyNumber(6)
	}
}
```