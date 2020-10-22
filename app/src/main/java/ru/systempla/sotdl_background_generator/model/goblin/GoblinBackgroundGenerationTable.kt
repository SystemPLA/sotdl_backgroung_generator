package ru.systempla.sotdl_background_generator.model.goblin

import ru.systempla.sotdl_background_generator.model.GenerationTable
import ru.systempla.sotdl_background_generator.utiliities.ChildrenCounter
import ru.systempla.sotdl_background_generator.utiliities.DiceRoller

class GoblinBackgroundGenerationTable : GenerationTable {
    override var name = "Background"
    override var usedDie = intArrayOf(1,20)
    override fun generateProperty(inputParameter: Int): String {
        return when (inputParameter) {
            1 -> "You spent the last ${DiceRoller.roll(6)} years in a drunken stupor. " +
                    "You’re not proud"
            2 -> "The Goblin King turned you into a toad. You " +
                    "escaped that fate after you convinced an elf maiden " +
                    "to kiss you. When she did and screamed, you killed " +
                    "her. You start the game with 1 Corruption."
            3 -> "You accidentally got your entire tribe killed."
            4 -> "You were orphaned and raised by giant rats."
            5 -> "You accidentally released a demon into the world."
            6 -> "You spent two days believing you were a fearsome " +
                    "dog. You start the game with 1 Insanity."
            7 -> "A hag made you her love slave for ${DiceRoller.roll(6)} years."
            8 -> "Dwarfs almost wiped out your tribe. You are one of " +
                    "${DiceRoller.roll(6)} survivors."
            9 -> "You nearly drowned when the sewers flooded."
            10 -> "You earned a living working in your profession"
            11 -> "Choose a character. He or she saved your life and " +
                    "you now owe that character a debt."
            12 -> "You are an unrepentant criminal. Add a random " +
                    "criminal profession to your list of professions."
            13 -> "You traveled extensively. You speak one additional " +
                    "language."
            14 -> "You stole a knife from a dashing knight."
            15 -> "You snuck into Alfheim and stole a lock of hair from " +
                    "the Faerie Queen."
            16 -> "You killed and ate 100 diseased rats."
            17 -> "You were a henchman to a powerful wizard."
            18 -> "You found a signet ring in a sewer."
            19 -> "You are the seventeenth son or daughter of the " +
                    "Goblin King."
            20 -> "You came into money and start the game with ${DiceRoller.roll(6,2)} cp."
            else -> "!!! Error: Wrong input parameter !!!"
        }
    }
}