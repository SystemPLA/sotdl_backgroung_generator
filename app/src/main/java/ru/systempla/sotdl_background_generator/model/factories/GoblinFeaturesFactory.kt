package ru.systempla.sotdl_background_generator.model.factories

import ru.systempla.sotdl_background_generator.model.GenerationTable
import ru.systempla.sotdl_background_generator.model.NullGenerationTable
import ru.systempla.sotdl_background_generator.model.goblin.*

class GoblinFeaturesFactory : AncestryFeaturesFactory() {
    override fun getFeatureGenerationTable(featureName: String): GenerationTable {
        return when(featureName) {
            "Background" -> GoblinBackgroundGenerationTable()
            "Age" -> GoblinAgeGenerationTable()
            "Appearance" -> GoblinAppearanceGenerationTable()
            "Build" -> GoblinBuildGenerationTable()
            "Personality" -> GoblinPersonalityGenerationTable()
            "Habit" -> GoblinHabitGenerationTable()
            else -> NullGenerationTable()
        }
    }
}
