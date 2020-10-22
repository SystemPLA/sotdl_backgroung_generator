package ru.systempla.sotdl_background_generator.model.orc

import ru.systempla.sotdl_background_generator.model.GenerationTable

class OrcAgeGenerationTable : GenerationTable {
    override var name = "Age"
    override var usedDie = intArrayOf(3,6)
    override fun generateProperty(inputParameter: Int): String {
        return when (inputParameter) {
            3 -> "You are a child, ${(5..8).random()} years old."
            in 4..7 -> "You are an adolescent, ${(8..12).random()} years old."
            in 8..12 -> "You are a young adult, ${(13..18).random()} years old."
            in 13..15 -> "You are a middle-aged adult, ${(19..26).random()} years old."
            16,17 -> "You are an older adult, ${(27..32).random()} years old."
            18 -> "You are a venerable adult, ${(33..45).random()} years old."
            else -> "!!! Error: Wrong input parameter !!!"
        }
    }
}