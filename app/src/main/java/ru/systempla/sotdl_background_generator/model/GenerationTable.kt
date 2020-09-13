package ru.systempla.sotdl_background_generator.model

interface GenerationTable {
    var usedDie: Array<Int>
    fun generateProperty(inputParameter: Int): String
}