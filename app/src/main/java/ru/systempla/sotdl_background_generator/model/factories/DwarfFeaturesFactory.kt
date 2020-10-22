package ru.systempla.sotdl_background_generator.model.factories

import ru.systempla.sotdl_background_generator.model.GenerationTable
import ru.systempla.sotdl_background_generator.model.NullGenerationTable
import ru.systempla.sotdl_background_generator.model.dwarf.*
import ru.systempla.sotdl_background_generator.model.human.*

class DwarfFeaturesFactory : AncestryFeaturesFactory() {
    override fun getFeatureGenerationTable(featureName: String): GenerationTable {
        return when(featureName) {
            "Background" -> DwarfBackgroundGenerationTable()
            "Age" -> DwarfAgeGenerationTable()
            "Appearance" -> DwarfAppearanceGenerationTable()
            "Build" -> DwarfBuildGenerationTable()
            "Personality" -> DwarfPersonalityGenerationTable()
            "Hatred" -> DwarfHatredGenerationTable()
            else -> NullGenerationTable()
        }
    }
}
