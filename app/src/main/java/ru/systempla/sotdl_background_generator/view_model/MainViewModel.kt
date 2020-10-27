package ru.systempla.sotdl_background_generator.view_model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import ru.systempla.sotdl_background_generator.model.Ancestries
import ru.systempla.sotdl_background_generator.model.Ancestry
import ru.systempla.sotdl_background_generator.model.changeling.ChangelingAncestry
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

    fun generateCharacter(ancestryString : Ancestries){
        generateAncestry(ancestryString)
        loadCharacterDesc()
    }

    private fun generateAncestry(ancestryString: Ancestries) {
        when (ancestryString) {
            Ancestries.HUMAN -> generateHuman()
            Ancestries.CLOCKWORK -> generateClockwork()
            Ancestries.ORC-> generateOrc()
            Ancestries.DWARF -> generateDwarf()
            Ancestries.GOBLIN -> generateGoblin()
            Ancestries.CHANGELING -> generateChangeling()
            Ancestries.RANDOM-> generateRandomAncestry()
        }
    }

    private fun generateRandomAncestry() {
        generateAncestry(Ancestries.values().random())
    }

    private fun generateChangeling() {
        val changelingFeaturesFactory = FactoryGenerator.getAncestryFeaturesFactory("Changeling")
        character = ChangelingAncestry.Builder()
            .setName("Test Character")
            .newFeature(changelingFeaturesFactory.getFeatureGenerationTable("Background"))
            .newFeature(changelingFeaturesFactory.getFeatureGenerationTable("Age"))
            .newFeature(changelingFeaturesFactory.getFeatureGenerationTable("Appearance"))
            .newFeature(changelingFeaturesFactory.getFeatureGenerationTable("Gender"))
            .newFeature(changelingFeaturesFactory.getFeatureGenerationTable("Personality"))
            .newFeature(changelingFeaturesFactory.getFeatureGenerationTable("Quirk"))
            .create()

        if (character.featuresMap["Apparent Ancestry"]!!.contains("orc")) {
            val orcFeaturesFactory = FactoryGenerator.getAncestryFeaturesFactory("Orc")
            character = ChangelingAncestry.Builder(character)
                .newFeature(orcFeaturesFactory.getFeatureGenerationTable("Age"))
                .newFeature(orcFeaturesFactory.getFeatureGenerationTable("Build"))
                .newFeature(orcFeaturesFactory.getFeatureGenerationTable("Appearance"))
                .create()
        }

        if (character.featuresMap["Apparent Ancestry"]!!.contains("goblin")) {
            val goblinFeaturesFactory = FactoryGenerator.getAncestryFeaturesFactory("Goblin")
            character = ChangelingAncestry.Builder(character)
                .newFeature(goblinFeaturesFactory.getFeatureGenerationTable("Age"))
                .newFeature(goblinFeaturesFactory.getFeatureGenerationTable("Build"))
                .newFeature(goblinFeaturesFactory.getFeatureGenerationTable("Appearance"))
                .create()
        }

        if (character.featuresMap["Apparent Ancestry"]!!.contains("dwarf")) {
            val dwarfFeaturesFactory = FactoryGenerator.getAncestryFeaturesFactory("Dwarf")
            character = ChangelingAncestry.Builder(character)
                .newFeature(dwarfFeaturesFactory.getFeatureGenerationTable("Age"))
                .newFeature(dwarfFeaturesFactory.getFeatureGenerationTable("Build"))
                .newFeature(dwarfFeaturesFactory.getFeatureGenerationTable("Appearance"))
                .create()
        }

        if (character.featuresMap["Apparent Ancestry"]!!.contains("human")) {
            val humanFeaturesFactory = FactoryGenerator.getAncestryFeaturesFactory("Human")
            character = ChangelingAncestry.Builder(character)
                .newFeature(humanFeaturesFactory.getFeatureGenerationTable("Age"))
                .newFeature(humanFeaturesFactory.getFeatureGenerationTable("Build"))
                .newFeature(humanFeaturesFactory.getFeatureGenerationTable("Appearance"))
                .create()
        }

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
