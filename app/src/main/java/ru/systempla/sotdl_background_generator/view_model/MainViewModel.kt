package ru.systempla.sotdl_background_generator.view_model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import ru.systempla.sotdl_background_generator.model.Ancestry
import ru.systempla.sotdl_background_generator.model.factories.FactoryGenerator
import ru.systempla.sotdl_background_generator.model.human.HumanAncestry

class MainViewModel : ViewModel() {
    private val characterDesc = MutableLiveData<String>()

    private lateinit var character : Ancestry

    fun getCharacterDesc(): LiveData<String>{
        return characterDesc
    }

    private fun loadCharacterDesc() {
        CoroutineScope(Dispatchers.Main).launch() {
            characterDesc.value = character.toString()
        }
    }

    fun generateCharacter(ancestryString : String){
        when (ancestryString) {
            "Human" -> generateHuman()
            else -> {}
        }
        loadCharacterDesc()
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
