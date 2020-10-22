package ru.systempla.sotdl_background_generator.model.orc

import ru.systempla.sotdl_background_generator.model.GenerationTable

class OrcPersonalityGenerationTable : GenerationTable {
    override var name = "Personality"
    override var usedDie = intArrayOf(3,6)
    override fun generateProperty(inputParameter: Int): String {
        return when (inputParameter) {
            3 -> "You fight to liberate your people from slavery."
            4 -> "Orcs are more than the killers the emperor made " +
                    "them to be. They are people, with hearts and " +
                    "souls, dreams and ambitions. You believe you " +
                    "must rise above the savagery and find your place."
            5, 6 ->	"The world is going to Hell. You say, let it."
            7, 8 ->	"You take care of yourself, take what you want, " +
                    "and do what you want."
            in 9..12 ->	"Kill!"
            13, 14 -> "You never question orders. You always do as " +
                    "you’re commanded."
            15, 16 -> "You want revenge and you’ll kill anyone that gets " +
                    "in your way."
            17 -> "You believe you were made for a reason. Without " +
                    "your chains, you have no purpose."
            18 -> "You believe your people have committed great " +
                    "acts of evil in the Empire’s name. You strive to " +
                    "right the wrongs."
            else -> "!!! Error: Wrong input parameter !!!"
        }
    }
}