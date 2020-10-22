package ru.systempla.sotdl_background_generator.model.dwarf

import ru.systempla.sotdl_background_generator.model.GenerationTable

class DwarfPersonalityGenerationTable : GenerationTable {
    override var name = "Personality"
    override var usedDie = intArrayOf(3,6)
    override fun generateProperty(inputParameter: Int): String {
        return when (inputParameter) {
            3 -> "Your hatred is a living thing. It drives you, gives you " +
                    "strength, and helps you triumph over your enemies."
            4 -> "You seek a glorious death killing your enemies."
            5, 6 ->	"You love gold more than anything. You love the way " +
                    "it feels, the sound it makes, and the taste of it."
            7, 8 ->	"You believe other people covet your wealth. It is " +
                    "your duty to protect what is yours—at any cost."
            in 9..12 ->	"Your honor is your life. You would never do anything " +
                    "to bring shame to your people."
            13, 14 -> "You surrender to the will of your ancestors, the " +
                    "customs of your people, and the good of all."
            15, 16 -> "You believe your people must rise above their greed " +
                    "and suspicion. In these dark times, you must band " +
                    "together to overcome the doom that awaits you all."
            17 -> "You don’t trust or like non-dwarfs, but they have " +
                    "their uses."
            18 -> "You have little use for the customs of your people. " +
                    "It’s time to move past the dusty caves and seek out " +
                    "fortunes elsewhere."
            else -> "!!! Error: Wrong input parameter !!!"
        }
    }
}