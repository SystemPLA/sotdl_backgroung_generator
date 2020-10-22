package ru.systempla.sotdl_background_generator.model.changeling

import ru.systempla.sotdl_background_generator.model.GenerationTable
import ru.systempla.sotdl_background_generator.utiliities.ChildrenCounter
import ru.systempla.sotdl_background_generator.utiliities.DiceRoller

class ChangelingQuirkGenerationTable : GenerationTable {
    override var name = "Quirk"
    override var usedDie = intArrayOf(1,20)
    override fun generateProperty(inputParameter: Int): String {
        return when (inputParameter) {
            1 -> "You always speak in the third person."
            2 -> "Your eyes glow green in the dark."
            3 -> "Animals become nervous around you."
            4 -> "You can adopt only male forms or only female forms."
            5 -> "You are wild and impulsive."
            6 -> "You can always revert to the first form you adopted."
            7 -> "The scent of iron sickens you."
            8 -> "You have terrible nightmares."
            9 -> "You sometimes hear voices."
            10 -> "You tend to lose small, inconsequential things."
            11 -> "One night each year, you lose your Steal Identity " +
                    "talent."
            12 -> "You can only assume the appearance of dead people."
            13 -> "You speak in whispers."
            14 -> "You give off an odd, earthy smell"
            15 -> "You can never keep your clothes clean."
            16 -> "You cannot get drunk."
            17 -> "You must always speak the truth as you know it."
            18 -> "You find meat repulsive."
            19 -> "You laugh at inappropriate times."
            20 -> "Forms you adopt have no hair or fingernails."
            else -> "!!! Error: Wrong input parameter !!!"
        }
    }
}