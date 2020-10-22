package ru.systempla.sotdl_background_generator.model.factories

import ru.systempla.sotdl_background_generator.model.GenerationTable
import ru.systempla.sotdl_background_generator.model.NullGenerationTable
import ru.systempla.sotdl_background_generator.model.human.*

class GoblinFeaturesFactory : AncestryFeaturesFactory() {
    override fun getFeatureGenerationTable(featureName: String): GenerationTable {
        return when(featureName) {
            "Background" -> NullGenerationTable()
            "Age" -> NullGenerationTable()
            "Appearance" -> NullGenerationTable()
            "Build" -> NullGenerationTable()
            "Personality" -> NullGenerationTable()
            "Religion" -> NullGenerationTable()
            else -> NullGenerationTable()
        }
    }
}
