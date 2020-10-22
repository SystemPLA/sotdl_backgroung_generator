package ru.systempla.sotdl_background_generator.model.goblin

import ru.systempla.sotdl_background_generator.model.GenerationTable
import ru.systempla.sotdl_background_generator.utiliities.ChildrenCounter
import ru.systempla.sotdl_background_generator.utiliities.DiceRoller

class GoblinHabitGenerationTable : GenerationTable {
    override var name = "Odd Habit"
    override var usedDie = intArrayOf(1,20)
    override fun generateProperty(inputParameter: Int): String {
        return when (inputParameter) {
            1 -> "You save all your secretions in small bottles and " +
                    "give them as gifts to people you like."
            2 -> "You never bathe."
            3 -> "You punctuate your sentences by spitting."
            4 -> "You have tremendous flatulence, yet you seem " +
                    "never to notice when you break wind."
            5 -> "You eat only candy."
            6 -> "You collect the genitals from creatures you kill " +
                    "and wear them as jewelry."
            7 -> "You lick things to claim them as your own."
            8 -> "You dress in fancy clothes."
            9 -> "You refuse to wear shoes."
            10 -> "You keep cockroaches as pets."
            11 -> "You always inspect your bowel movements, " +
                    "spreading the mess around with your fingers."
            12 -> "You keep a bit of iron on your person at all times."
            13 -> "You speak in a singsong voice."
            14 -> "You eat a bit of flesh from any living thing you kill."
            15 -> "You cry a lot."
            16 -> "You tell filthy jokes at inappropriate times."
            17 -> "You wear a child’s costume and refuse to take it off."
            18 -> "You keep a large collection of spoons."
            19 -> "You like to hide."
            20 -> "Make something up!"
            else -> "!!! Error: Wrong input parameter !!!"
        }
    }
}