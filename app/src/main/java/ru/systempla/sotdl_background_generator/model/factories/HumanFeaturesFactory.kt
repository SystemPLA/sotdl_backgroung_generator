package ru.systempla.sotdl_background_generator.model.factories

import ru.systempla.sotdl_background_generator.model.GenerationTable
import ru.systempla.sotdl_background_generator.model.NullGenerationTable
import ru.systempla.sotdl_background_generator.model.human.*

class HumanFeaturesFactory : AncestryFeaturesFactory() {
    override fun getFeatureGenerationTable(featureName: String): GenerationTable {
        return when(featureName) {
            "Background" -> HumanBackgroundGenerationTable()
            "Age" -> HumanAgeGenerationTable()
            "Appearance" -> HumanAppearanceGenerationTable()
            "Build" -> HumanBuildGenerationTable()
            "Personality" -> HumanPersonalityGenerationTable()
            "Religion" -> HumanReligionGenerationTable()
            else -> NullGenerationTable()
        }
    }
}
