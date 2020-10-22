package ru.systempla.sotdl_background_generator.model.clockwork

import ru.systempla.sotdl_background_generator.model.GenerationTable

class ClockworkFormGenerationTable : GenerationTable {
    override var name = "Form"
    override var usedDie = intArrayOf(3,6)
    override fun generateProperty(inputParameter: Int): String {
        return when (inputParameter) {
            3 -> "You are a small winged clockwork. Reduce your\n" +
                    "Health by 5 and your Size to 1/2. You can fly, but\n" +
                    "you must land at the end of your movement or fall.\n" +
                    "You are 3 feet tall and weigh 50 pounds."
            4, 5 -> "You are a small spider-like clockwork with functional\n" +
                    "hands. Reduce your Size to 1/2. You ignore the\n" +
                    "effects of difficult terrain when you climb. You are 3\n" +
                    "feet tall and weigh 50 pounds."
            in 6..9 -> "You are a small humanoid clockwork. Reduce your\n" +
                    "Size to 1/2. You are 4 feet tall and weigh 75 pounds."
            in 10..15 -> "You are a humanoid clockwork. You are 6 feet tall\n" +
                    "and weigh 300 pounds."
            16, 17 -> "You are a large humanoid clockwork. Increase your\n" +
                    "Size to 2, but reduce your Speed and your Defense by\n" +
                    "2. You are 10 feet tall and weigh 750 pounds."
            18 -> "You are a large clockwork with the lower body of a\n" +
                    "horse. Increase your Size to 2 and your Speed by 2.\n" +
                    "However, reduce your Defense by 3. You are 6 feet\n" +
                    "long, 6 feet tall, and weigh 750 pounds."
            else -> "!!! Error: Wrong input parameter !!!"
        }
    }
}