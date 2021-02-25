package com.dindinn

import java.lang.StringBuilder

const val offsetAscii = 97
const val AZ_SIZE = 26
fun azOffset(input: String, n: Int): String {
    val builder = StringBuilder(input.length)
    input.toLowerCase().forEach { char ->
        val intRep: Int = char.toInt()
        val finalPos = (((intRep - offsetAscii) + n) % AZ_SIZE) + offsetAscii
        val newPosition = finalPos.toChar()
        builder.append(newPosition)
    }
    return builder.toString()
}