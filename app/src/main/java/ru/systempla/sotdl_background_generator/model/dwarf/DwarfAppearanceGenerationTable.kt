package ru.systempla.sotdl_background_generator.model.dwarf

import ru.systempla.sotdl_background_generator.model.GenerationTable

class DwarfAppearanceGenerationTable : GenerationTable {
    override var name = "Appearance"
    override var usedDie = intArrayOf(3,6)
    override fun generateProperty(inputParameter: Int): String {
        return when (inputParameter) {
            3, 4 -> "You have a monstrous appearance, likely due to " +
                    "hard living and several near misses. Your face is " +
                    "a mass of scar tissue, probably missing an ear, an " +
                    "eye, or your nose. You also display some unusual " +
                    "habit, such as pounding nails into your skull or " +
                    "greasing your body with troll fat."
            5, 6 -> "You have several interesting features that work " +
                    "together to make you one ugly brute. Filth from " +
                    "digging in the dirt, mites infesting your hair, skin " +
                    "lashed with healing scars, and a rich aroma of " +
                    "vomit—all these contribute to your distinctive " +
                    "style."
            7, 8 ->	"You look like a typical dwarf, being hairy, portly, " +
                    "and grubby."
            in 9..11 -> "You take a bit better care of yourself and keep " +
                    "your facial hair well groomed."
            in 12..15 -> "You take pride in your appearance. You stay " +
                    "clean, oil your facial hair, and perhaps braid it or " +
                    "tie it with metal rings."
            in 16..18 -> "You are quite fetching for a dwarf. You have regal\n" +
                    "features, good bearing, and a deep voice. Like" +
                    "other dwarfs, you take pride in your appearance."
            else -> "!!! Error: Wrong input parameter !!!"
        }
    }
}