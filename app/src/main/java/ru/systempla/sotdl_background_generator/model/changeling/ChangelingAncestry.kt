package ru.systempla.sotdl_background_generator.model.changeling

import ru.systempla.sotdl_background_generator.model.Ancestry
import ru.systempla.sotdl_background_generator.model.GenerationTable
import ru.systempla.sotdl_background_generator.utiliities.DiceRoller
import java.lang.StringBuilder

class ChangelingAncestry private constructor(private var name : String = "-", private val features: Map<String, String>): Ancestry() {

    val ancestry = "Changeling"

    private constructor(builder: Builder) : this(builder.name, builder.features) {
        this.featuresMap = features
        this.characterName = name
    }

    class Builder(){
        var features: LinkedHashMap<String, String> = LinkedHashMap()
        var name: String = ""

        constructor(ancestry: Ancestry) : this() {
            features = ancestry.featuresMap as LinkedHashMap<String, String>
            name = ancestry.characterName
        }

        fun newFeature(featureGenerationTable : GenerationTable) : Builder {
            features[featureGenerationTable.name] =
                featureGenerationTable.generateProperty(DiceRoller.roll(
                    featureGenerationTable.usedDie[1],
                    featureGenerationTable.usedDie[0]
                )
            )
            return this
        }

        fun setName(name: String) : Builder {
            this.name = name
            return this
        }

        fun create(): ChangelingAncestry = ChangelingAncestry(this)
    }

    override fun toString():String {
        var result: StringBuilder = StringBuilder()
        result.append("Name: $name \n")
        result.append("Ancestry: $ancestry \n")
        for (i in featuresMap) {
            result.append("${i.key}: ${i.value} \n")
        }
        return result.toString()
    }
}