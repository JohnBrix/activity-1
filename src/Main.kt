import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {

    val input = Scanner(System.`in`)
    val bf = BufferedReader(InputStreamReader(System.`in`))

    initial(input, bf)
}

fun initial(input: Scanner, bf: BufferedReader) {
    try {
        println("Enter your Name:")
        val name: String? = input.nextLine()
        println("Enter your Course:")
        val course: String? = input.nextLine()
        println("Enter your Age:")
        val age: Int? = input.nextInt()

        println("Please Type if [1] KgToPounds, [2] OuncesToGrams, [3] MetersToFeet, [4] InchesToCentimeters, [5] KiloToMiles.")
        val type = input.nextInt()

        if (type == 1) {
            convertKgToPounds(bf)
            poundsToKg(bf)
            println("Hello My name is: $name, $course and I'm $age years old!")
        } else if (type == 2) {
            convertOuncesToGrams(bf)
            gramsToOunces(bf)

            println("Hello My name is: $name, $course and I'm $age years old!")
        } else if (type == 3) {
            convertMetersToFeet(input)
            feetToMeters(input)
            println("Hello My name is: $name, $course and I'm $age years old!")
        } else if (type == 4) {
            convertInchesToCentimeters(bf)

            convertCentimetersToInches(bf)
            println("Hello My name is: $name, $course and I'm $age years old!")
        } else if (type == 5) {
            convertToKiloToMiles(input)

            convertToMilesToKilo(input)
            println("Hello My name is: $name, $course and I'm $age years old!")
        } else {
            repeat(input)
        }

    } catch (e: InputMismatchException) {
        val input = Scanner(System.`in`)
        val bf = BufferedReader(InputStreamReader(System.`in`))
        println("Please Correct inputs: $e")
        println("Repeat...")

        initial(input, bf)

    }
}

fun repeat(input: Scanner) {
    try {
        println("That's invalid option! ")
        print("Do you want to repeat again? type [y] or [n] \n")
        val option = input.next().single()

        if (option == 'y') {
            println("proceed")

            val input = Scanner(System.`in`)
            val bf = BufferedReader(InputStreamReader(System.`in`))
            initial(input, bf)

        } else if (option == 'n') {
            print("Exiting..")
        } else {
            val input = Scanner(System.`in`)
            println("Repeating..")
            repeat(input)
        }
    } catch (e: IllegalArgumentException) {
        val input = Scanner(System.`in`)
        println("Argument: $e")
        println("Repeating..")
        repeat(input)
    }

}

fun convertKgToPounds(bf: BufferedReader) {
    println("Enter the Kilogram:")
    val kilo = bf.readLine().toInt()
    val totalPound = kilo * 2.20462262
    println("Kg To Pounds: $totalPound")
}

fun poundsToKg(bf: BufferedReader) {
    println("Enter the Pounds:")
    val pounds = bf.readLine().toInt()
    val totalPound = pounds * 0.45359237
    println("Pounds to Kg: $totalPound")
}


fun convertOuncesToGrams(bf: BufferedReader) {
    println("Enter the Ounces:")
    val ounces = bf.readLine().toInt()
    val total = ounces * 28.349523125
    println("Ounces to Grams: $total")
}

fun gramsToOunces(bf: BufferedReader) {
    println("Enter the Grams:")
    val grams = bf.readLine().toInt()
    val total = grams * 0.035273962
    println("Grams to Ounces: $total")
}

fun convertMetersToFeet(input: Scanner) {
    println("Enter Value in Meters :")
    val meter = input.nextDouble()
    val feet = meter * 3.28084
    println("$meter Meters to $feet Feets")
}

fun feetToMeters(input: Scanner) {
    println("Enter Value in Feet :")
    val feet = input.nextDouble()
    val meter = feet / 3.2808
    println("$feet feet to $meter meter")
}

fun convertInchesToCentimeters(bf: BufferedReader) {
    print("Enter the inches: ")
    val inches = bf.readLine().toFloat()
    val cm = inches * 2.54f
    println("$inches inches is $cm centimeters.")
}

fun convertCentimetersToInches(bf: BufferedReader) {
    print("Enter the Centimeters: ")
    val centi = bf.readLine().toFloat()
    val inches = centi * 0.393700787;
    println("$centi centimeters is $inches inches.")
}

fun convertToKiloToMiles(input: Scanner) {
    println("Enter the distance value in Kilometers: ")
    val kiloMeters: Double = input.nextDouble()
    val miles = kiloMeters / 1.609344

    println("The distance in Miles : $miles")
}

fun convertToMilesToKilo(input: Scanner) {
    println("Enter the distance value in Miles : ")
    val miles: Double = input.nextDouble()
    val kiloMeters = miles * 1.609344f

    println("The distance in Kilo : $kiloMeters")
}