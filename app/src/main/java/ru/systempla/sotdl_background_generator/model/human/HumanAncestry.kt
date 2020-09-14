package ru.systempla.sotdl_background_generator.model.human

import ru.systempla.sotdl_background_generator.model.Ancestry
import ru.systempla.sotdl_background_generator.model.GenerationTable
import ru.systempla.sotdl_background_generator.utiliities.DiceRoller

class HumanAncestry private constructor(private var name : String = "-", private val features: Map<String, String>): Ancestry() {

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
                    featureGenerationTable.usedDie[0],
                    featureGenerationTable.usedDie[1]
                )
            )
            return this
        }

        fun setName(name: String) : Builder {
            this.name = name
            return this
        }

        fun create(): HumanAncestry = HumanAncestry(this)
    }
}