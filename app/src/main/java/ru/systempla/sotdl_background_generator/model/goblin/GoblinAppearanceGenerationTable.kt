package ru.systempla.sotdl_background_generator.model.goblin

import ru.systempla.sotdl_background_generator.model.GenerationTable
import ru.systempla.sotdl_background_generator.utiliities.ChildrenCounter
import ru.systempla.sotdl_background_generator.utiliities.DiceRoller

class GoblinAppearanceGenerationTable : GenerationTable {
    override var name = "Distinctive Appearance"
    override var usedDie = intArrayOf(1,20)
    override fun generateProperty(inputParameter: Int): String {
        return when (inputParameter) {
            1 -> "You have a long, pointed nose."
            2 -> "You have bright green or orange skin."
            3 -> "You have the head of a dog."
            4 -> "You have a reptilian appearance with small horns " +
                    "sprouting from the top of your head."
            5 -> "You have a wide, leering grin."
            6 -> "You have a pig’s snout in place of a nose."
            7 -> "You have long, slender fingers."
            8 -> "You have a tooth growing out from your forehead."
            9 -> "You have a tail."
            10 -> "Fur grows thickly on your arms and legs."
            11 -> "You are completely hairless."
            12 -> "You have all the warts."
            13 -> "A large cyst grows on your back."
            14 -> "You have an abnormally long and pointed chin."
            15 -> "A single horn grows out from the side of your head."
            16 -> "You have one eye."
            17 -> "You have ${DiceRoller.roll(6)} extra fingers, placed on your body\n" +
                    "wherever you wish."
            18 -> "You have enormous ears."
            19 -> "You have stubby little legs."
            20 -> "Make something up!"
            else -> "!!! Error: Wrong input parameter !!!"
        }
    }
}