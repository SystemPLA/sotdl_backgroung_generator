package ru.systempla.sotdl_background_generator.model

interface GenerationTable {
    var name: String
    var usedDie: IntArray
    fun generateProperty(inputParameter: Int): String
}