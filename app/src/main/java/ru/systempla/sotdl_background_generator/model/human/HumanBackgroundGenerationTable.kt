package ru.systempla.sotdl_background_generator.model.human

import ru.systempla.sotdl_background_generator.model.GenerationTable
import ru.systempla.sotdl_background_generator.utiliities.ChildrenCounter
import ru.systempla.sotdl_background_generator.utiliities.DiceRoller

class HumanBackgroundGenerationTable : GenerationTable {
    override var name = "Background"
    override var usedDie = intArrayOf(1,20)
    override fun generateProperty(inputParameter: Int): String {
        return when (inputParameter) {
            1 -> "You died and returned to life. You start the game with 1d6 Insanity."
            2 -> "You were briefly possessed by a demon. You start the game with 1 Corruption."
            3 -> "You spent ${DiceRoller.roll(6)} years as a prisoner in a dungeon."
            4 -> "You murdered someone in cold blood. You start the game with 1 Corruption."
            5 -> "You caught and recovered from a terrible disease."
            6 -> "You belonged to a strange cult and saw many strange things. You start the game with 1 Insanity."
            7 -> "The faerie held you prisoner for ${DiceRoller.roll(20)} years."
            8 -> "You lost a loved one and their loss haunts you still."
            9 -> "You lost a finger, a few teeth, or an ear, or you gained a scar."
            10 -> "You earned a living working in your profession."
            11 -> "You fell in love and the relationship ended well or is ongoing."
            12 -> "You have a spouse and ${ChildrenCounter.countChildren(DiceRoller.roll(6), -2)} children."
            13 -> "You traveled extensively. You speak one additional language."
            14 -> "You received an education. You know how to read the Common Tongue."
            15 -> "You saved your town from terrible monsters."
            16 -> "You foiled a plot to kill someone important or you brought a killer to justice."
            17 -> "You performed a great deed and are a hero to the people in your hometown."
            18 -> "You found an old treasure map."
            19 -> "Someone important and powerful owes you a favor."
            20 -> "You came into money and start the game with ${DiceRoller.roll(6,2)} cp."
            else -> "!!! Error: Wrong input parameter !!!"
        }
    }
}