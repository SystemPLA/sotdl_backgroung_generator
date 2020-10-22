package ru.systempla.sotdl_background_generator.model.goblin

import ru.systempla.sotdl_background_generator.model.GenerationTable

class GoblinAgeGenerationTable : GenerationTable {
    override var name = "Age"
    override var usedDie = intArrayOf(3,6)
    override fun generateProperty(inputParameter: Int): String {
        return when (inputParameter) {
            3 -> "You are a child, ${(3..6).random()} years old."
            in 4..7 -> "You are an adolescent, ${(7..10).random()} years old."
            in 8..12 -> "You are a young adult, ${(11..25).random()} years old."
            in 13..15 -> "You are a middle-aged adult, ${(26..50).random()} years old."
            16,17 -> "You are an older adult, ${(51..75).random()} years old."
            18 -> "You are a venerable adult, ${(76..90).random()} years old."
            else -> "!!! Error: Wrong input parameter !!!"
        }
    }
}