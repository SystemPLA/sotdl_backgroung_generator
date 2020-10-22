package ru.systempla.sotdl_background_generator.model.changeling

import ru.systempla.sotdl_background_generator.model.GenerationTable

class ChangelingAgeGenerationTable : GenerationTable {
    override var name = "True Age"
    override var usedDie = intArrayOf(3,6)
    override fun generateProperty(inputParameter: Int): String {
        return when (inputParameter) {
            3 -> "You are a child, ${(5..8).random()} years old."
            in 4..7 -> "You are an adolescent, ${(9..14).random()} years old."
            in 8..12 -> "You are a young adult, ${(15..25).random()} years old."
            in 13..15 -> "You are a middle-aged adult, ${(26..40).random()} years old."
            16,17 -> "You are an older adult, ${(41..60).random()} years old."
            18 -> "You are a venerable adult, ${(61..80).random()} years old."
            else -> "!!! Error: Wrong input parameter !!!"
        }
    }
}