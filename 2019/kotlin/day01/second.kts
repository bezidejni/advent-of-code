package day1

import java.io.File

fun getFuelForMass(mass: Int) = (mass / 3) - 2
fun getTotalFuelForMass(mass: Int) = generateSequence(
    seedFunction = { getFuelForMass(mass) },
    nextFunction = { getFuelForMass(it) }).takeWhile { it > 0 }.sum()

fun main() {
    val totalSum = File("input")
            .readLines()
            .sumBy { getTotalFuelForMass(it.toInt()) }
    print(totalSum)
}

main()