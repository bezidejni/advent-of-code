package day1

import java.io.File

fun getFuelForMass(mass: Int) = (mass / 3) - 2

fun main() {
    val totalSum = File("input")
            .readLines()
            .sumBy { getFuelForMass(it.toInt()) }
    print(totalSum)
}

main()