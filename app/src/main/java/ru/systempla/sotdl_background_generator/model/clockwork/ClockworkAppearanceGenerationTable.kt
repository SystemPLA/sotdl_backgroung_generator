package ru.systempla.sotdl_background_generator.model.clockwork

import ru.systempla.sotdl_background_generator.model.GenerationTable
import ru.systempla.sotdl_background_generator.utiliities.DiceRoller

class ClockworkAppearanceGenerationTable : GenerationTable {
    override var name = "Appearance"
    override var usedDie = intArrayOf(3,6)
    override fun generateProperty(inputParameter: Int): String {
        return when (inputParameter) {
            3 -> "You have a strange and unsettling appearance."
            4 -> "You appear crude and ill-formed."
            5, 6 -> "You appear battered, broken, and in poor repair."
            7, 8 -> "You have no facial features or distinguishing markings."
            in 9..12 -> "You have a mere suggestion of facial features."
            13, 14 -> "You appear well made and in good working condition."
            15, 16 -> "You have a stylized and ornate body."
            17 -> "You have an ornate body festooned with etchings\n" +
                    "and ornamental jewels."
            18 -> "You have an exquisite body festooned with\n" +
                    "elaborate etchings and ornamental jewels, and\n" +
                    "trimmed in precious metals. If dismantled, your\n" +
                    "body parts are worth ${DiceRoller.roll(6)} gc."
            else -> "!!! Error: Wrong input parameter !!!"
        }
    }
}