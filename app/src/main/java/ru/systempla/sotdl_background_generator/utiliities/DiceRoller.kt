package ru.systempla.sotdl_background_generator.utiliities

import android.util.Log

class DiceRoller {
    companion object Static{

        fun roll(type: Int, count: Int = 1) : Int {
            var sum = 0
            var counter = count
            while (counter>0) {
                sum += (1..type).random()
                counter -= 1
//                Log.d("ROLLER_ROLL", "$sum")
            }
//            Log.d("ROLLER_SUM", "$sum")
            return sum
        }

    }
}