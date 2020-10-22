package ru.systempla.sotdl_background_generator.model.dwarf

import ru.systempla.sotdl_background_generator.model.GenerationTable
import ru.systempla.sotdl_background_generator.utiliities.ChildrenCounter
import ru.systempla.sotdl_background_generator.utiliities.DiceRoller

class DwarfHatredGenerationTable : GenerationTable {
    override var name = "Hatred"
    override var usedDie = intArrayOf(1,20)
    override fun generateProperty(inputParameter: Int): String {
        return when (inputParameter) {
            1, 2 -> "Ogres"
            3, 4 -> "Troglodytes"
            5, 6 -> "Beastmen"
            7, 8 -> "Orcs"
            9, 10 -> "Goblins"
            11, 12 -> "Elves"
            13, 14 -> "Trolls"
            15, 16 -> "Giants"
            17, 18 -> "Dragons"
            19, 20 -> "Demons"
            else -> "!!! Error: Wrong input parameter !!!"
        }
    }
}