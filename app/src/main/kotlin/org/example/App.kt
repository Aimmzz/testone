package org.example

fun main() {
    val numInput = 100
    getNumbersWithRules(numInput)
}

fun checkPrimeNumber(num: Int): Boolean {
    var isPrime = true
    if (num <= 1) return false
    for (i in 2..num / 2) {
        if (num % i == 0) {
            isPrime = false
            break
        }
    }
    return isPrime
}

fun getNumbersWithRules(num: Int) {
    val numbers = (1..num).toList().reversed()
    for (number in numbers) {
        when {
            checkPrimeNumber(number) -> {}
            number % 15 == 0 -> print("FooBar ")
            number % 3 == 0 -> print("Foo ")
            number % 5 == 0 -> print("Bar ")
            else -> print("$number, ")
        }
    }
}