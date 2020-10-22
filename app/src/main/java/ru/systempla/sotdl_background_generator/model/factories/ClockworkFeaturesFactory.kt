package ru.systempla.sotdl_background_generator.model.factories

import ru.systempla.sotdl_background_generator.model.GenerationTable
import ru.systempla.sotdl_background_generator.model.NullGenerationTable
import ru.systempla.sotdl_background_generator.model.clockwork.*

class ClockworkFeaturesFactory : AncestryFeaturesFactory() {
    override fun getFeatureGenerationTable(featureName: String): GenerationTable {
        return when(featureName) {
            "Background" -> ClockworkBackgroundGenerationTable()
            "Age" -> ClockworkAgeGenerationTable()
            "Appearance" -> ClockworkAppearanceGenerationTable()
            "Personality" -> ClockworkPersonalityGenerationTable()
            "Form" -> ClockworkFormGenerationTable()
            "Purpose" -> ClockworkPurposeGenerationTable()
            else -> NullGenerationTable()
        }
    }
}
