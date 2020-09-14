package ru.systempla.sotdl_background_generator.model.human

import ru.systempla.sotdl_background_generator.model.GenerationTable

class HumanPersonalityGenerationTable : GenerationTable {
    override var name = "Personality"
    override var usedDie = IntArray(2) {3;6}
    override fun generateProperty(inputParameter: Int): String {
        return when (inputParameter) {
            3 -> "You are cruel, wicked, and self-serving. You enjoy making others suffer."
            4 -> "You are erratic and unpredictable. You have a hard time keeping your word and tend toward capricious behavior."
            5, 6 ->	"Might makes right. Obedience to authority is the highest ideal."
            7, 8 ->	"You look after yourself first and foremost. You’re not above double-crossing friends."
            in 9..12 ->	"You put your interests and those of your friends above all else."
            13, 14 -> "You help others because it’s the right thing to do."
            15, 16 -> "You try to do what you think is right, even if it breaks laws and social conventions."
            17 -> "Your honor and duty guide everything you do."
            18 -> "You are committed to good and noble causes, and you never stray from your beliefs even if your refusal would cost you your life."
            else -> "!!! Error: Wrong input parameter !!!"
        }
    }
}