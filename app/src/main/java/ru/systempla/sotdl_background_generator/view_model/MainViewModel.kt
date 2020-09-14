package ru.systempla.sotdl_background_generator.view_model

import androidx.lifecycle.ViewModel
import ru.systempla.sotdl_background_generator.model.Ancestry
import ru.systempla.sotdl_background_generator.model.factories.FactoryGenerator
import ru.systempla.sotdl_background_generator.model.human.HumanAncestry

class MainViewModel : ViewModel() {
    lateinit var character : Ancestry

    fun generateCharacter(ancestryString : String){
        when (ancestryString) {
            "Human" -> generateHuman()
            else -> {}
        }
    }

    private fun generateHuman() {
        val humanFeaturesFactory = FactoryGenerator.getAncestryFeaturesFactory("Human")
        character = HumanAncestry.Builder()
            .setName("Test Character")
            .newFeature(humanFeaturesFactory.getFeatureGenerationTable("Background"))
            .newFeature(humanFeaturesFactory.getFeatureGenerationTable("Age"))
            .newFeature(humanFeaturesFactory.getFeatureGenerationTable("Appearance"))
            .newFeature(humanFeaturesFactory.getFeatureGenerationTable("Build"))
            .newFeature(humanFeaturesFactory.getFeatureGenerationTable("Personality"))
            .newFeature(humanFeaturesFactory.getFeatureGenerationTable("Religion"))
            .create()
    }
}