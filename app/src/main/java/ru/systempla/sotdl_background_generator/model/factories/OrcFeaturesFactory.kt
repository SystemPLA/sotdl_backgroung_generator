package ru.systempla.sotdl_background_generator.model.factories

import ru.systempla.sotdl_background_generator.model.GenerationTable
import ru.systempla.sotdl_background_generator.model.NullGenerationTable
import ru.systempla.sotdl_background_generator.model.human.*
import ru.systempla.sotdl_background_generator.model.orc.*

class OrcFeaturesFactory : AncestryFeaturesFactory() {
    override fun getFeatureGenerationTable(featureName: String): GenerationTable {
        return when(featureName) {
            "Background" -> OrcBackgroundGenerationTable()
            "Age" -> OrcAgeGenerationTable()
            "Appearance" -> OrcAppearanceGenerationTable()
            "Build" -> OrcBuildGenerationTable()
            "Personality" -> OrcPersonalityGenerationTable()
            else -> NullGenerationTable()
        }
    }
}
