package ru.systempla.sotdl_background_generator.utiliities

import kotlin.math.abs

class ChildrenCounter {
    companion object Static {
        fun countChildren (baseNumber:Int, excludeNumber:Int) : Int {
            return if (baseNumber<=abs(excludeNumber)) 0
            else baseNumber-excludeNumber
        }
    }
}