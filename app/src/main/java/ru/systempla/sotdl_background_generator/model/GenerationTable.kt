package ru.systempla.sotdl_background_generator.model

interface GenerationTable {
    var usedDie: IntArray
    fun generateProperty(inputParameter: Int): String
}