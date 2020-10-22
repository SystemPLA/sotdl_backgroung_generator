package ru.systempla.sotdl_background_generator.model.changeling

import ru.systempla.sotdl_background_generator.model.GenerationTable

class ChangelingPersonalityGenerationTable : GenerationTable {
    override var name = "Personality"
    override var usedDie = intArrayOf(3,6)
    override fun generateProperty(inputParameter: Int): String {
        return when (inputParameter) {
            3 -> "You steal the forms of others so you can do what\n" +
                    "you want without facing repercussions. You don’t\n" +
                    "care about how this affects other people."
            4, 5 -> "You enjoy taking on forms that let you work mischief."
            6 ->	"You adopt forms that give you power over others.\n" +
                    "Power ensures your safety."
            in 7..10 ->	"You take on other forms for profit, usually to gain\n" +
                    "access to places normally forbidden to you."
            in 11..13 ->	"You are careful about the forms you take. You try to\n" +
                    "stay out of trouble and keep your secrets safe"
            14 -> "You strive to do the right thing and use your\n" +
                    "disguises to help other people, as well as to protect\n" +
                    "yourself from your enemies."
            15, 16 -> "Your nature is a gift and you use it to do what you\n" +
                    "think is right, even if it means upsetting others\n" +
                    "along the way."
            17 -> "You tend to stick to one form as long as possible; you\n" +
                    "crave stability and would do anything to be “normal.”"
            18 -> "You use your talents to help others, to make the\n" +
                    "world a better place, and to right wrongs."
            else -> "!!! Error: Wrong input parameter !!!"
        }
    }
}