package ru.systempla.sotdl_background_generator.model.clockwork

import ru.systempla.sotdl_background_generator.model.GenerationTable

class ClockworkPersonalityGenerationTable : GenerationTable {
    override var name = "Personality"
    override var usedDie = intArrayOf(3,6)
    override fun generateProperty(inputParameter: Int): String {
        return when (inputParameter) {
            3 -> "You hate living things and take pleasure in pulling " +
                    "them apart."
            4 -> "You are terrified of becoming dormant."
            in 5..7 ->	"Your body gives you power and strength. You use it " +
                    "to enforce your will on others."
            8 -> "You didn’t ask for this existence, but you make the " +
                    "most of it while you have it."
            in 9..13 ->	"You search for meaning in a world in which you have " +
                    "no place."
            14 -> "You were made to serve. You commit your " +
                    "existence to aiding others."
            15 -> "You don’t know how you fit into this world, but you " +
                    "will spend your life trying to find out."
            16, 17 -> "You obey the instructions of anyone you deem to be " +
                    "an authority."
            18 -> "Your maker gave you three commandments and you " +
                    "must obey them."
            else -> "!!! Error: Wrong input parameter !!!"
        }
    }
}