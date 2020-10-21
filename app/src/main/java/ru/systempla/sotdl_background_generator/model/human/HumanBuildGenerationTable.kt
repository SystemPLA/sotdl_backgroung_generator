package ru.systempla.sotdl_background_generator.model.human

import ru.systempla.sotdl_background_generator.model.GenerationTable

class HumanBuildGenerationTable : GenerationTable {
    override var name = "Build"
    override var usedDie = intArrayOf(3,6)
    override fun generateProperty(inputParameter: Int): String {
        return when (inputParameter) {
            3 -> "You are short and thin."
            4 -> "You are short and heavy."
            5, 6 -> "You are short."
            7, 8 -> "You are slender."
            in 9..12 ->	"You are average in height and weight."
            13, 14 -> "You are a bit overweight."
            15, 16 -> "You are tall."
            17 -> "You are tall and thin."
            18 -> "You are very tall and heavy."
            else -> "!!! Error: Wrong input parameter !!!"
        }
    }
}