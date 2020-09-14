package ru.systempla.sotdl_background_generator.model

abstract class Ancestry {
    lateinit var characterName : String
    lateinit var featuresMap: Map<String, String>
    fun getFullInfo () : StringBuffer {
        var info = StringBuffer()
        info.append("Name: $characterName\n")
        for (i in featuresMap) {
            info.append("${i.key} : +${i.value}\n")
        }
        return info
    }
}