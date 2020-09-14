package ru.systempla.sotdl_background_generator.model

import ru.systempla.sotdl_background_generator.model.factories.AncestryFeaturesFactory

class NullAncestryFeaturesFactory : AncestryFeaturesFactory() {
    override fun getFeatureGenerationTable(featureName: String): GenerationTable = NullGenerationTable()
}
