package ru.systempla.sotdl_background_generator.model.factories

import ru.systempla.sotdl_background_generator.model.GenerationTable
import ru.systempla.sotdl_background_generator.model.NullGenerationTable
import ru.systempla.sotdl_background_generator.model.changeling.*
import ru.systempla.sotdl_background_generator.model.human.*

class ChangelingFeaturesFactory : AncestryFeaturesFactory() {
    override fun getFeatureGenerationTable(featureName: String): GenerationTable {
        return when(featureName) {
            "Background" -> ChangelingBackgroundGenerationTable()
            "Age" -> ChangelingAgeGenerationTable()
            "Appearance" -> ChangelingAncestryGenerationTable()
            "Personality" -> ChangelingPersonalityGenerationTable()
            "Quirk" -> ChangelingQuirkGenerationTable()
            "Gender" -> ChangelingGenderGenerationTable()
            else -> NullGenerationTable()
        }
    }
}
