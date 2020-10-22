package ru.systempla.sotdl_background_generator.model.changeling

import ru.systempla.sotdl_background_generator.model.GenerationTable
import ru.systempla.sotdl_background_generator.utiliities.ChildrenCounter
import ru.systempla.sotdl_background_generator.utiliities.DiceRoller

class ChangelingBackgroundGenerationTable : GenerationTable {
    override var name = "Background"
    override var usedDie = intArrayOf(1,20)
    override fun generateProperty(inputParameter: Int): String {
        return when (inputParameter) {
            1 -> "You only recently discovered your true nature, and " +
                    "you are having a difficult time adjusting to your " +
                    "new reality. You start the game with 1 Insanity."
            2 -> "You have no idea that you’re a changeling. You " +
                    "think you are a member of the ancestry whose form " +
                    "you adopted. Add an extra random profession. Until " +
                    "you become incapacitated or touch iron for the first " +
                    "time, you cannot use Steal Identity."
            3 -> "You were enslaved by a hag and forced to perform " +
                    "unspeakable acts as she commanded you. You " +
                    "start the game with 1 Corruption."
            4 -> "You murdered the person whose identity you stole " +
                    "so you could take over that person’s life. You start " +
                    "the game with 1 Corruption."
            5 -> "When your “parents” learned what you were, they " +
                    "cast you out from your home and you were forced " +
                    "to make your own way in the world."
            6 -> "You ran away from home when you learned what " +
                    "you were and lived among the faerie for many years."
            7 -> "You have earned the enmity of a witch hunter. This " +
                    "foe hunts you and will try to kill you if he or she " +
                    "ever finds you."
            8 -> "Fearful townsfolk drove you out of your " +
                    "hometown. You have grown to hate them and plot " +
                    "revenge."
            9 -> "The first time you stole someone’s identity, you " +
                    "also stole a few of that person’s memories."
            10 -> "You earned a living working in your profession."
            11 -> "You fell in love, and your lover is not aware of your " +
                    "true identity."
            12 -> "After being exiled from your hometown, a druid or " +
                    "witch took you in and cared for you. You always " +
                    "have a home with this character."
            13 -> "You worked as an informant for the Inquisition."
            14 -> "You received an education. You know how to read " +
                    "the Common Tongue."
            15 -> "You learned a terrible secret while masquerading " +
                    "as someone else. Work out the nature of that " +
                    "secret with your Game Master."
            16 -> "Your parents raised you even though they knew " +
                    "what you were. Their love and encouragement " +
                    "gave you the stability you needed to grow into a " +
                    "mature personality."
            17 -> "The elf who made you recently found you and " +
                    "befriended you. You can call in one favor from that " +
                    "elf by speaking into a shell he or she gave you. The " +
                    "extent of the favor’s power is subject to the GM’s " +
                    "discretion."
            18 -> "You adopted the form of someone famous, " +
                    "powerful, and important."
            19 -> "You have ties to a criminal organization after being " +
                    "recruited for your magical gifts."
            20 -> "You came into a quantity of money and start the " +
                    "game with ${DiceRoller.roll(6,2)} cp."
            else -> "!!! Error: Wrong input parameter !!!"
        }
    }
}