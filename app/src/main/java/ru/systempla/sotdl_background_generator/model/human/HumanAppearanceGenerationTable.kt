package ru.systempla.sotdl_background_generator.model.human

import ru.systempla.sotdl_background_generator.model.GenerationTable

class HumanAppearanceGenerationTable : GenerationTable {
    override var name = "Appearance"
    override var usedDie = IntArray(2) {3;6}
    override fun generateProperty(inputParameter: Int): String {
        return when (inputParameter) {
            3 -> "You are hideous. You look like a monster. Children cry when they encounter you, the weak of heart faint when they see you, and one person vomited after getting a good look at your face."
            4 -> "You are ugly, and people find your visage unpleasant thanks to a scar, wen, beetling brows, boils, piles, a wandering or weeping eye, or something else of a similar magnitude."
            5, 6 ->	"Most consider you homely: not quite ugly, but a bit worse than plain."
            7, 8 ->	"You are plain and uninteresting to look upon. People notice you, but your appearance fails to make an impression."
            in 9..12 -> "You are perfectly average in appearance. You look like everyone else."
            13, 14 -> "You have a physical quality that makes you attractive to others. You might have pretty eyes, lips, hair, shape, or something else."
            15, 16 -> "You have several attractive physical qualities that make you quite comely."
            17 -> "You are one of the great beauties in the land, an individual of almost unsurpassed form and appearance. People notice you."
            18 -> "You put beautiful people to shame. You are so striking, heads turn to follow you wherever you go. People become infatuated with you, stumbling over their words and feeling flustered when you show them attention. There’s a fine line between love and hate. Should you spurn the attentions of people you enamor, their affection might sour to resentment and even hatred."
            else -> "!!! Error: Wrong input parameter !!!"
        }
    }
}