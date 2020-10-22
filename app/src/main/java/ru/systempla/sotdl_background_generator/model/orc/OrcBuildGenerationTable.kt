package ru.systempla.sotdl_background_generator.model.orc

import ru.systempla.sotdl_background_generator.model.GenerationTable

class OrcBuildGenerationTable : GenerationTable {
    override var name = "Build"
    override var usedDie = intArrayOf(3,6)
    override fun generateProperty(inputParameter: Int): String {
        return when (inputParameter) {
            3 -> "You are short and wiry."
            4 -> "You are short and muscular."
            5, 6 -> "You are short."
            7, 8 -> "You are thin."
            in 9..12 ->	"You have an average height and weight."
            13, 14 -> "You are corpulent."
            15, 16 -> "You are tall."
            17 -> "You are tall and gaunt."
            18 -> "You are a giant among orcs."
            else -> "!!! Error: Wrong input parameter !!!"
        }
    }
}