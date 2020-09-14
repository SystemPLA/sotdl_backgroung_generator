package ru.systempla.sotdl_background_generator.model.human

import ru.systempla.sotdl_background_generator.model.GenerationTable

class HumanAgeGenerationTable : GenerationTable {
    override var name = "Age"
    override var usedDie = IntArray(2) {3;6}
    override fun generateProperty(inputParameter: Int): String {
        return when (inputParameter) {
            3 -> "You are a child, ${(5..12).random()} years old."
            in 4..7 -> "You are an adolescent, ${(11..18).random()} years old."
            in 8..12 -> "You are a young adult, ${(17..36).random()} years old."
            in 13..15 -> "You are a middle-aged adult, ${(35..56).random()} years old."
            16,17 -> "You are an older adult, ${(55..76).random()} years old."
            18 -> "You are a venerable adult, ${(75..91).random()} years or older."
            else -> "!!! Error: Wrong input parameter !!!"
        }
    }
}