package ru.systempla.sotdl_background_generator.model.clockwork

import ru.systempla.sotdl_background_generator.model.GenerationTable
import ru.systempla.sotdl_background_generator.utiliities.ChildrenCounter
import ru.systempla.sotdl_background_generator.utiliities.DiceRoller

class ClockworkPurposeGenerationTable : GenerationTable {
    override var name = "Purpose"
    override var usedDie = intArrayOf(1,20)
    override fun generateProperty(inputParameter: Int): String {
        return when (inputParameter) {
            in 1..4 -> "You were built for war. Increase your Strength or\n" +
                    "Agility by 2."
            in 5..8 -> "You were built to work. Increase your Strength by 2."
            in 9..12 -> "You were built to use magic. Increase your Intellect\n" +
                    "or Will by 2."
            in 13..16 -> "You were built to gather intelligence about or\n" +
                    "assassinate targets. Increase your Agility or\n" +
                    "Intellect by 2."
            in 17..20 -> "You were built for an inexplicable purpose. Increase\n" +
                    "one attribute of your choice by 2."
            else -> "!!! Error: Wrong input parameter !!!"
        }
    }
}