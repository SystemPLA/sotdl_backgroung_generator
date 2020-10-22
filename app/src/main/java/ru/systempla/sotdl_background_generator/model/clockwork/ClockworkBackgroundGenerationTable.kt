package ru.systempla.sotdl_background_generator.model.clockwork

import ru.systempla.sotdl_background_generator.model.GenerationTable
import ru.systempla.sotdl_background_generator.utiliities.ChildrenCounter
import ru.systempla.sotdl_background_generator.utiliities.DiceRoller

class ClockworkBackgroundGenerationTable : GenerationTable {
    override var name = "Background"
    override var usedDie = intArrayOf(1,20)
    override fun generateProperty(inputParameter: Int): String {
        return when (inputParameter) {
            1 -> "Your soul came from Hell. Start the game with ${DiceRoller.roll(3)} Corruption."
            2 -> "Your soul was plucked from the Underworld before it could forget its former life. Start the game with ${DiceRoller.roll(6)} "+
                    "Insanity and add an extra profession."
            3 -> "You spent ${DiceRoller.roll(20)} years in a dormant state."
            4 -> "Your maker treated you poorly. You escaped and fear your maker will find you."
            5 -> "Fire, plague, or monsters destroyed your home and you are the sole survivor."
            6 -> "You were stolen from the workshop where you were made and lived as a slave for ${DiceRoller.roll(6)} years."
            7 -> "Goblins captured you and almost took you apart " +
                    "for scrap materials. You have replaced your missing " +
                    "components with bits of wood, old weapons, and " +
                    "other rubbish."
            8 -> "You were left to find your own way in the world " +
                    "when your maker died."
            9 -> "You fell off a boat and spent 2 years walking to shore."
            10 -> "You worked to fulfill your purpose for ${DiceRoller.roll(6)} years."
            11 -> "Choose a member of the group. That character " +
                    "found you and turned your key. You owe that " +
                    "character a debt."
            12 -> "You were one of ${DiceRoller.roll(6)} other clockworks made at the " +
                    "same time. You hope to find them one day."
            13 -> "You were made to be a translator. You can speak " +
                    "one additional language."
            14 -> "You were made to be a scribe. You know how to " +
                    "read and write the Common Tongue."
            15 -> "Your maker set you free to find your destiny."
            16 -> "You can’t remember your past. You don’t know " +
                    "where you came from or how you came to be where " +
                    "you are."
            17 -> "You built a lasting monument in your community."
            18 -> "You found a cryptic message inside your body. You " +
                    "have not yet deciphered its meaning."
            19 -> "You have a sword grafted to one of your arms."
            20 -> "You came into money and start the game with ${DiceRoller.roll(6,2)} cp."
            else -> "!!! Error: Wrong input parameter !!!"
        }
    }
}