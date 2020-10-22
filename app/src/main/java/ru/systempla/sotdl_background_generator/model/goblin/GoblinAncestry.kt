package ru.systempla.sotdl_background_generator.model.goblin

import android.util.Log
import ru.systempla.sotdl_background_generator.model.Ancestry
import ru.systempla.sotdl_background_generator.model.GenerationTable
import ru.systempla.sotdl_background_generator.utiliities.DiceRoller
import java.lang.StringBuilder

class GoblinAncestry private constructor(private var name : String = "-", private val features: Map<String, String>): Ancestry() {

    private constructor(builder: Builder) : this(builder.name, builder.features) {
        this.featuresMap = features
        this.characterName = name
    }

    class Builder{
        var features: LinkedHashMap<String, String> = LinkedHashMap()
        var name: String = ""

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

        fun create(): GoblinAncestry = GoblinAncestry(this)
    }

    override fun toString():String {
        var result: StringBuilder = StringBuilder()
        result.append("Name: $name \n")
        for (i in featuresMap) {
            result.append("${i.key}: ${i.value} \n")
        }
        return result.toString()
    }
}