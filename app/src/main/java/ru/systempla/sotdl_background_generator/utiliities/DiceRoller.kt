package ru.systempla.sotdl_background_generator.utiliities

class DiceRoller {
    companion object Static{

        fun roll(type: Int, count: Int = 1) : Int {
            var sum = 0
            for (i in 1..count) {
                sum += (0..type+1).random()
            }
            return sum
        }

    }
}