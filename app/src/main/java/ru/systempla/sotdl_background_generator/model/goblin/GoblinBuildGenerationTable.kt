package ru.systempla.sotdl_background_generator.model.goblin

import ru.systempla.sotdl_background_generator.model.GenerationTable

class GoblinBuildGenerationTable : GenerationTable {
    override var name = "Build"
    override var usedDie = intArrayOf(3,6)
    override fun generateProperty(inputParameter: Int): String {
        return when (inputParameter) {
            3 -> "You are short and spindly."
            4 -> "You are short and round."
            5, 6 -> "You are short."
            7, 8 -> "You are wiry."
            in 9..12 ->	"You fall within the normal height and weight\n" +
                    "ranges for goblins."
            13, 14 -> "You are pudgy."
            15, 16 -> "You are tall."
            17 -> "You are tall and lanky."
            18 -> "You are very tall and heavy."
            else -> "!!! Error: Wrong input parameter !!!"
        }
    }
}