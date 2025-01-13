package org.example

fun main() {
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