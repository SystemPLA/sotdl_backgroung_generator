package ru.systempla.sotdl_background_generator.model.factories

import ru.systempla.sotdl_background_generator.model.GenerationTable

abstract class AncestryFeaturesFactory {
    abstract fun getFeatureGenerationTable(featureName : String) : GenerationTable
}