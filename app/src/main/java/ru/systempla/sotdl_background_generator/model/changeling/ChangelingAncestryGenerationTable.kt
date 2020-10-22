package ru.systempla.sotdl_background_generator.model.changeling

import ru.systempla.sotdl_background_generator.model.GenerationTable

class ChangelingAncestryGenerationTable : GenerationTable {
    override var name = "Apparent Ancestry"
    override var usedDie = intArrayOf(3,6)
    override fun generateProperty(inputParameter: Int): String {
        return when (inputParameter) {
            3, 4 -> "You appear to be a goblin."
            in 5..7 -> "You appear to be a dwarf."
            in 8..15 -> "You appear to be a human."
            16, 17 -> "You appear to be an orc."
            18 -> "The GM determines your ancestry, age, build, and appearance."
            else -> "!!! Error: Wrong input parameter !!!"
        }
    }
}