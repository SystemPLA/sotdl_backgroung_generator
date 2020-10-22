package ru.systempla.sotdl_background_generator.model.human

import ru.systempla.sotdl_background_generator.model.GenerationTable

class HumanAgeGenerationTable : GenerationTable {
    override var name = "Age"
    override var usedDie = intArrayOf(3,6)
    override fun generateProperty(inputParameter: Int): String {
        return when (inputParameter) {
            3 -> "You are a child, ${(5..11).random()} years old."
            in 4..7 -> "You are an adolescent, ${(12..17).random()} years old."
            in 8..12 -> "You are a young adult, ${(18..35).random()} years old."
            in 13..15 -> "You are a middle-aged adult, ${(36..55).random()} years old."
            16,17 -> "You are an older adult, ${(56..75).random()} years old."
            18 -> "You are a venerable adult, ${(76..90).random()} years old."
            else -> "!!! Error: Wrong input parameter !!!"
        }
    }
}