package ru.systempla.sotdl_background_generator.model.orc

import ru.systempla.sotdl_background_generator.model.GenerationTable

class OrcAppearanceGenerationTable : GenerationTable {
    override var name = "Appearance"
    override var usedDie = intArrayOf(3,6)
    override fun generateProperty(inputParameter: Int): String {
        return when (inputParameter) {
            in 3..5 -> "You are grotesque. Your face is a mass of scar " +
                    "tissue. Thick scars crisscross your body, held " +
                    "together with crude, leather stitching. Swathes of " +
                    "open sores weep streams of pus, and you reek of " +
                    "excrement, blood, and rot."
            in 6..8 -> "You are monstrous, with thick, brutish features, " +
                    "weird growths sprouting from your skin, and nasty " +
                    "scars that cut jagged lines across your thick hide."
            in 9..12 ->	"You are ugly. You have thick tusks jutting from your " +
                    "broad jaw, a sloping forehead, and tiny eyes set " +
                    "deep in your skull."
            in 13..15 -> "You are an orc of typical appearance, dirty and " +
                    "unkempt."
            16, 17 -> "Your features are somewhat less brutish, though " +
                    "you might have odd skin coloration, extra fur, and " +
                    "thick features."
            18 -> "You stand out from other orcs. Your body is " +
                    "remarkably free from the scars and injuries that maim " +
                    "your fellows, and you are in pretty good health."
            else -> "!!! Error: Wrong input parameter !!!"
        }
    }
}