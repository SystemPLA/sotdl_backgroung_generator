package ru.systempla.sotdl_background_generator.model.human

import ru.systempla.sotdl_background_generator.model.GenerationTable

class HumanReligionGenerationTable : GenerationTable {
    override var name = "Religion"
    override var usedDie = IntArray(2) {3;6}
    override fun generateProperty(inputParameter: Int): String {
        return when (inputParameter) {
            3 -> "You belong to a cult dedicated to a dark power."
            4 -> "You belong to a heretical sect."
            5, 6 -> "You were raised in the teachings of witchcraft."
            in 7..10 -> "You follow the tenets of the Old Faith."
            in 11..15 -> "You belong to the Cult of the New God."
            in 16..18 -> "You have no religion."
            else -> "!!! Error: Wrong input parameter !!!"
        }
    }
}