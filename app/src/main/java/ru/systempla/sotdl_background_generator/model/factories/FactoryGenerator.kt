package ru.systempla.sotdl_background_generator.model.factories

import ru.systempla.sotdl_background_generator.model.NullAncestryFeaturesFactory

class FactoryGenerator() {
    companion object {
        fun getAncestryFeaturesFactory(factory: String) : AncestryFeaturesFactory =
            when (factory) {
                "Human" -> HumanFeaturesFactory()
                "Clockwork" -> ClockworkFeaturesFactory()
                "Orc" -> OrcFeaturesFactory()
                "Dwarf" -> DwarfFeaturesFactory()
                "Goblin" -> GoblinFeaturesFactory()
                "Changeling" -> ChangelingFeaturesFactory()
                else -> NullAncestryFeaturesFactory()
            }
    }
}