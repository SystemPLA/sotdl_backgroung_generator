package ru.systempla.sotdl_background_generator.model.orc

import ru.systempla.sotdl_background_generator.model.GenerationTable

class OrcPersonalityGenerationTable : GenerationTable {
    override var name = "Personality"
    override var usedDie = intArrayOf(3,6)
    override fun generateProperty(inputParameter: Int): String {
        return when (inputParameter) {
            3 -> "You fight to liberate your people from slavery."
            4 -> "Orcs are more than the killers the emperor made\n" +
                    "them to be. They are people, with hearts and\n" +
                    "souls, dreams and ambitions. You believe you\n" +
                    "must rise above the savagery and find your place."
            5, 6 ->	"The world is going to Hell. You say, let it."
            7, 8 ->	"You take care of yourself, take what you want,\n" +
                    "and do what you want."
            in 9..12 ->	"Kill!"
            13, 14 -> "You never question orders. You always do as\n" +
                    "you’re commanded."
            15, 16 -> "You want revenge and you’ll kill anyone that gets\n" +
                    "in your way."
            17 -> "You believe you were made for a reason. Without\n" +
                    "your chains, you have no purpose."
            18 -> "You believe your people have committed great\n" +
                    "acts of evil in the Empire’s name. You strive to\n" +
                    "right the wrongs."
            else -> "!!! Error: Wrong input parameter !!!"
        }
    }
}