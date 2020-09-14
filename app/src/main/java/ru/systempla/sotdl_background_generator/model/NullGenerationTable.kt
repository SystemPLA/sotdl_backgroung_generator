package ru.systempla.sotdl_background_generator.model

class NullGenerationTable : GenerationTable {
    override var name: String = "NullData"
    override var usedDie = IntArray(0)
    override fun generateProperty(inputParameter: Int): String = "NullData"
}