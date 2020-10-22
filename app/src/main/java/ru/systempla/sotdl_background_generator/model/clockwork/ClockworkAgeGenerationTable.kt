package ru.systempla.sotdl_background_generator.model.clockwork

import ru.systempla.sotdl_background_generator.model.GenerationTable

class ClockworkAgeGenerationTable : GenerationTable {
    override var name = "Age"
    override var usedDie = intArrayOf(3,6)
    override fun generateProperty(inputParameter: Int): String {
        return when (inputParameter) {
            in 3..8 -> "You are new, ${(1..5).random()} years old."
            in 9..12 -> "You are experienced, ${(6..10).random()} years old."
            in 13..15 -> "You are old, ${(11..50).random()} years old."
            in 16..17 -> "You are very old, ${(51..150).random()} years old."
            18 -> "You are ancient, more than 150 years old."
            else -> "!!! Error: Wrong input parameter !!!"
        }
    }
}