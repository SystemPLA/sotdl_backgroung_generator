package ru.systempla.sotdl_background_generator.view_model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import ru.systempla.sotdl_background_generator.model.Ancestry
import ru.systempla.sotdl_background_generator.model.clockwork.ClockworkAncestry
import ru.systempla.sotdl_background_generator.model.dwarf.DwarfAncestry
import ru.systempla.sotdl_background_generator.model.factories.FactoryGenerator
import ru.systempla.sotdl_background_generator.model.goblin.GoblinAncestry
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
            "Clockwork" -> generateClockwork()
            "Orc" -> generateOrc()
            "Dwarf" -> generateDwarf()
            "Goblin" -> generateGoblin()
            "Changeling" -> generateChangeling()
            else -> {}
        }
        loadCharacterDesc()
    }

    private fun generateChangeling() {
        val changelingFeaturesFactory = FactoryGenerator.getAncestryFeaturesFactory("Changeling")
    }

    private fun generateGoblin() {
        val goblinFeaturesFactory = FactoryGenerator.getAncestryFeaturesFactory("Goblin")
        character = GoblinAncestry.Builder()
            .setName("Test Character")
            .newFeature(goblinFeaturesFactory.getFeatureGenerationTable("Background"))
            .newFeature(goblinFeaturesFactory.getFeatureGenerationTable("Age"))
            .newFeature(goblinFeaturesFactory.getFeatureGenerationTable("Appearance"))
            .newFeature(goblinFeaturesFactory.getFeatureGenerationTable("Build"))
            .newFeature(goblinFeaturesFactory.getFeatureGenerationTable("Personality"))
            .newFeature(goblinFeaturesFactory.getFeatureGenerationTable("Habit"))
            .create()
    }

    private fun generateDwarf() {
        val dwarfFeaturesFactory = FactoryGenerator.getAncestryFeaturesFactory("Dwarf")
        character = DwarfAncestry.Builder()
            .setName("Test Character")
            .newFeature(dwarfFeaturesFactory.getFeatureGenerationTable("Background"))
            .newFeature(dwarfFeaturesFactory.getFeatureGenerationTable("Age"))
            .newFeature(dwarfFeaturesFactory.getFeatureGenerationTable("Appearance"))
            .newFeature(dwarfFeaturesFactory.getFeatureGenerationTable("Build"))
            .newFeature(dwarfFeaturesFactory.getFeatureGenerationTable("Personality"))
            .newFeature(dwarfFeaturesFactory.getFeatureGenerationTable("Hatred"))
            .create()
    }

    private fun generateOrc() {
        val orcFeaturesFactory = FactoryGenerator.getAncestryFeaturesFactory("Orc")
        character = ClockworkAncestry.Builder()
            .setName("Test Character")
            .newFeature(orcFeaturesFactory.getFeatureGenerationTable("Background"))
            .newFeature(orcFeaturesFactory.getFeatureGenerationTable("Age"))
            .newFeature(orcFeaturesFactory.getFeatureGenerationTable("Build"))
            .newFeature(orcFeaturesFactory.getFeatureGenerationTable("Appearance"))
            .newFeature(orcFeaturesFactory.getFeatureGenerationTable("Personality"))
            .create()
    }

    private fun generateClockwork() {
        val clockworkFeaturesFactory = FactoryGenerator.getAncestryFeaturesFactory("Clockwork")
        character = ClockworkAncestry.Builder()
            .setName("Test Character")
            .newFeature(clockworkFeaturesFactory.getFeatureGenerationTable("Background"))
            .newFeature(clockworkFeaturesFactory.getFeatureGenerationTable("Age"))
            .newFeature(clockworkFeaturesFactory.getFeatureGenerationTable("Appearance"))
            .newFeature(clockworkFeaturesFactory.getFeatureGenerationTable("Purpose"))
            .newFeature(clockworkFeaturesFactory.getFeatureGenerationTable("Form"))
            .newFeature(clockworkFeaturesFactory.getFeatureGenerationTable("Personality"))
            .create()
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
