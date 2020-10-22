package ru.systempla.sotdl_background_generator.model.changeling

import ru.systempla.sotdl_background_generator.model.GenerationTable

class ChangelingAncestryGenerationTable : GenerationTable {
    override var name = "Apparent Ancestry"
    override var usedDie = intArrayOf(3,6)
    override fun generateProperty(inputParameter: Int): String {
        return when (inputParameter) {
            3, 4 -> "You appear to be a goblin. Go to the Goblin ancestry " +
                    "entry to determine your age, build, and appearance."
            in 5..7 -> "You appear to be a dwarf. Go to the Dwarf ancestry " +
                    "entry to determine your age, build, and appearance."
            in 8..15 -> "You appear to be a human. Go to the Human ancestry " +
                    "entry to determine your age, build, and appearance."
            16, 17 -> "You appear to be an orc. Go to the Orc ancestry entry " +
                    "to determine your age, build, and appearance."
            18 -> "The GM determines your ancestry, age, build, and appearance."
            else -> "!!! Error: Wrong input parameter !!!"
        }
    }
}