package ru.systempla.sotdl_background_generator.model.dwarf

import ru.systempla.sotdl_background_generator.model.GenerationTable

class DwarfAgeGenerationTable : GenerationTable {
    override var name = "Age"
    override var usedDie = intArrayOf(3,6)
    override fun generateProperty(inputParameter: Int): String {
        return when (inputParameter) {
            3 -> "You are a child, ${(12..19).random()} years old."
            in 4..7 -> "You are an adolescent, ${(20..30).random()} years old."
            in 8..12 -> "You are a young adult, ${(31..50).random()} years old."
            in 13..15 -> "You are a middle-aged adult, ${(51..100).random()} years old."
            16,17 -> "You are an older adult, ${(101..150).random()} years old."
            18 -> "You are a venerable adult, ${(151..190).random()} years old."
            else -> "!!! Error: Wrong input parameter !!!"
        }
    }
}