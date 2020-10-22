package ru.systempla.sotdl_background_generator.model.changeling

import ru.systempla.sotdl_background_generator.model.GenerationTable
import ru.systempla.sotdl_background_generator.utiliities.ChildrenCounter
import ru.systempla.sotdl_background_generator.utiliities.DiceRoller

class ChangelingBackgroundGenerationTable : GenerationTable {
    override var name = "Background"
    override var usedDie = intArrayOf(1,20)
    override fun generateProperty(inputParameter: Int): String {
        return when (inputParameter) {
            1 -> "You only recently discovered your true nature, and\n" +
                    "you are having a difficult time adjusting to your\n" +
                    "new reality. You start the game with 1 Insanity."
            2 -> "You have no idea that you’re a changeling. You\n" +
                    "think you are a member of the ancestry whose form\n" +
                    "you adopted. Add an extra random profession. Until\n" +
                    "you become incapacitated or touch iron for the first\n" +
                    "time, you cannot use Steal Identity."
            3 -> "You were enslaved by a hag and forced to perform\n" +
                    "unspeakable acts as she commanded you. You\n" +
                    "start the game with 1 Corruption."
            4 -> "You murdered the person whose identity you stole\n" +
                    "so you could take over that person’s life. You start\n" +
                    "the game with 1 Corruption."
            5 -> "When your “parents” learned what you were, they\n" +
                    "cast you out from your home and you were forced\n" +
                    "to make your own way in the world."
            6 -> "You ran away from home when you learned what\n" +
                    "you were and lived among the faerie for many years."
            7 -> "You have earned the enmity of a witch hunter. This\n" +
                    "foe hunts you and will try to kill you if he or she\n" +
                    "ever finds you."
            8 -> "Fearful townsfolk drove you out of your\n" +
                    "hometown. You have grown to hate them and plot\n" +
                    "revenge."
            9 -> "The first time you stole someone’s identity, you\n" +
                    "also stole a few of that person’s memories."
            10 -> "You earned a living working in your profession."
            11 -> "You fell in love, and your lover is not aware of your\n" +
                    "true identity."
            12 -> "After being exiled from your hometown, a druid or\n" +
                    "witch took you in and cared for you. You always\n" +
                    "have a home with this character."
            13 -> "You worked as an informant for the Inquisition."
            14 -> "You received an education. You know how to read\n" +
                    "the Common Tongue."
            15 -> "You learned a terrible secret while masquerading\n" +
                    "as someone else. Work out the nature of that\n" +
                    "secret with your Game Master."
            16 -> "Your parents raised you even though they knew\n" +
                    "what you were. Their love and encouragement\n" +
                    "gave you the stability you needed to grow into a\n" +
                    "mature personality."
            17 -> "The elf who made you recently found you and\n" +
                    "befriended you. You can call in one favor from that\n" +
                    "elf by speaking into a shell he or she gave you. The\n" +
                    "extent of the favor’s power is subject to the GM’s\n" +
                    "discretion."
            18 -> "You adopted the form of someone famous,\n" +
                    "powerful, and important."
            19 -> "You have ties to a criminal organization after being\n" +
                    "recruited for your magical gifts."
            20 -> "You came into a quantity of money and start the\n" +
                    "game with ${DiceRoller.roll(6,2)} cp."
            else -> "!!! Error: Wrong input parameter !!!"
        }
    }
}