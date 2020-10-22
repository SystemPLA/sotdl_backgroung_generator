package ru.systempla.sotdl_background_generator.model.orc

import ru.systempla.sotdl_background_generator.model.GenerationTable
import ru.systempla.sotdl_background_generator.utiliities.ChildrenCounter
import ru.systempla.sotdl_background_generator.utiliities.DiceRoller

class OrcBackgroundGenerationTable : GenerationTable {
    override var name = "Background"
    override var usedDie = intArrayOf(1,20)
    override fun generateProperty(inputParameter: Int): String {
        return when (inputParameter) {
            1 -> "You butchered helpless people. You start the game " +
                    "with 2 Corruption."
            2 -> "You were briefly possessed by a demon. You start " +
                    "the game with 1 Corruption."
            3 -> "You spent ${DiceRoller.roll(6)} years in the fighting pit, testing your skills " +
                    "against other orcs for the amusement of the crowds."
            4 -> "You stayed loyal to the Empire and fought against " +
                    "other orcs. You were branded as a traitor and cast out."
            5 -> "You caught the rot and lost your nose and ears."
            6 -> "You were chained to the oars in a slave ship for ${DiceRoller.roll(6)} " +
                    "years."
            7 -> "You were made a eunuch and stood guard over the " +
                    "emperor’s concubines."
            8 -> "You have scar tissue over half your body from " +
                    "when you were caught in the blast of a spell."
            9 -> "You escaped your slavery and have lived in the " +
                    "wilderness ever since."
            10 -> "You earned a living working in your profession."
            11 -> "You fell in love with a human and were spurned for " +
                    "your affections."
            12 -> {val bornChildren = DiceRoller.roll(6,3)
                val deadChildren = DiceRoller.roll(6,3)
                val aliveChildren = if (bornChildren>deadChildren) bornChildren-deadChildren else 0
                "You sired or gave birth to $bornChildren children. $aliveChildren " +
                   " are still alive."
            }
            13 -> "You traveled extensively. You speak one additional " +
                    "language."
            14 -> "You received an education. You know how to read " +
                    "the Common Tongue."
            15 -> "You fought bravely for the Emperor and were " +
                    "awarded a medal for your courage."
            16 -> "You saved an important noble from an " +
                    "assassination attempt."
            17 -> "A human broke your chains and freed you to find " +
                    "your fortunes in the world."
            18 -> "You took a sword from the corpse of a warrior you " +
                    "killed."
            19 -> "The Gods of Blood and Iron visit you in your " +
                    "dreams. You start the game with 1 Insanity."
            20 -> "You came into money and start the game with ${DiceRoller.roll(6,2)} cp."
            else -> "!!! Error: Wrong input parameter !!!"
        }
    }
}