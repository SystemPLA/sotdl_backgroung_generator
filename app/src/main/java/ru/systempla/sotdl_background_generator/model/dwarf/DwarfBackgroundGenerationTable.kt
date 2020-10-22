package ru.systempla.sotdl_background_generator.model.dwarf

import ru.systempla.sotdl_background_generator.model.GenerationTable
import ru.systempla.sotdl_background_generator.utiliities.ChildrenCounter
import ru.systempla.sotdl_background_generator.utiliities.DiceRoller

class DwarfBackgroundGenerationTable : GenerationTable {
    override var name = "Background"
    override var usedDie = intArrayOf(1,20)
    override fun generateProperty(inputParameter: Int): String {
        return when (inputParameter) {
            1 -> "You sold your soul to a devil to gain wealth. The " +
                    "devil betrayed you and left you penniless. You start " +
                    "the game with 1 Corruption."
            2 -> "Your ancestors appeared to you in a vision and sent " +
                    "you to recover a fabled relic."
            3 -> "You accidentally killed someone close to you."
            4 -> "You stole gold from a rival clan and the theft " +
                    "shames you."
            5 -> "You fought against the creatures you hate and lost."
            6 -> "You brought shame to yourself and your clan. You " +
                    "live as an exile, searching for redemption, even if " +
                    "that redemption comes with a glorious death."
            7 -> "You were taken prisoner by the creatures you hate. " +
                    "You lived as a slave for ${DiceRoller.roll(6,2)} years."
            8 -> "The creatures you hate overran your home and " +
                    "wiped out your clan."
            9 -> "You survived a cave-in and get a bit nervous when " +
                    "underground."
            10 -> "You earned a living working in your profession."
            11 -> "You are a sworn servant of the Dwarf King."
            12 -> "You are a gifted artisan. Add artisan (any one) to " +
                    "your list of professions."
            13 -> "You traveled extensively. You speak one additional " +
                    "language."
            14 -> "You inherited a battleaxe or a warhammer from an " +
                    "ancestor."
            15 -> "You discovered a vein of gold under your mountain " +
                    "home."
            16 -> "You hunted down and helped kill a creature you hate."
            17 -> "You performed a great deed, and you are a hero to " +
                    "your clan."
            18 -> "You have a key to an ancient treasure vault lost to " +
                    "the dwarfs long ago."
            19 -> "You are the rightful heir to a stronghold overrun by " +
                    "the enemies of your people."
            20 -> "You came into money and start the game with ${DiceRoller.roll(6,2)} cp."
            else -> "!!! Error: Wrong input parameter !!!"
        }
    }
}