package ru.systempla.sotdl_background_generator.model.goblin

import ru.systempla.sotdl_background_generator.model.GenerationTable

class GoblinPersonalityGenerationTable : GenerationTable {
    override var name = "Personality"
    override var usedDie = intArrayOf(3,6)
    override fun generateProperty(inputParameter: Int): String {
        return when (inputParameter) {
            3 -> "You are a bully and enjoy tormenting things that\n" +
                    "are weaker than you."
            4 -> "You like violence, especially when it’s random and\n" +
                    "senseless."
            5, 6 ->	"You try to rise above the filth and squalor of your\n" +
                    "people to do good in the world."
            7, 8 ->	"You love playing tricks on other people and find\n" +
                    "their pain hilarious!"
            in 9..12 ->	"You look out for yourself. To hell with everyone else!"
            13, 14 -> "You’re just trying to stay alive!"
            15, 16 -> "Your people didn’t deserve exile, but exile you got.\n" +
                    "You believe you will make places for yourselves\n" +
                    "and prove to those stinking elves they were wrong."
            17 -> "You live to serve the strong and mighty."
            18 -> "You hope to redeem your people in the eyes of\n" +
                    "the Faerie Queen."
            else -> "!!! Error: Wrong input parameter !!!"
        }
    }
}