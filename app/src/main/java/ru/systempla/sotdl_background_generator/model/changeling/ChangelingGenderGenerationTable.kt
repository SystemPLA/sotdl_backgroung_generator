package ru.systempla.sotdl_background_generator.model.changeling

import ru.systempla.sotdl_background_generator.model.GenerationTable

class ChangelingGenderGenerationTable : GenerationTable {
    override var name = "Apparent Gender"
    override var usedDie = intArrayOf(1,6)
    override fun generateProperty(inputParameter: Int): String {
        return when (inputParameter) {
            in 1..3 -> "You appear to be male."
            in 4..6 -> "You appear to be female."
            else -> "!!! Error: Wrong input parameter !!!"
        }
    }
}