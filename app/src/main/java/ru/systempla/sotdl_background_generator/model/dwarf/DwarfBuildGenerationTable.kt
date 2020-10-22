package ru.systempla.sotdl_background_generator.model.dwarf

import ru.systempla.sotdl_background_generator.model.GenerationTable

class DwarfBuildGenerationTable : GenerationTable {
    override var name = "Build"
    override var usedDie = intArrayOf(3,6)
    override fun generateProperty(inputParameter: Int): String {
        return when (inputParameter) {
            3 -> "You are short and scrawny."
            in 4..6 -> "You are short and fat."
            7, 8  -> "You stand a bit shorter than other dwarfs."
            in 9..12 ->	"You are average in height and build."
            in 13..15 -> "You have a magnificent belly."
            16, 17 -> "You are tall."
            18 -> "You are tall and heavy."
            else -> "!!! Error: Wrong input parameter !!!"
        }
    }
}