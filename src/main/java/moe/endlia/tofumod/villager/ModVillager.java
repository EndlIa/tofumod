package moe.endlia.tofumod.villager;

import com.google.common.collect.ImmutableSet;
import moe.endlia.tofumod.Tofumod;
import moe.endlia.tofumod.block.ModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.world.poi.PointOfInterestHelper;
import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.village.VillagerProfession;
import net.minecraft.world.poi.PointOfInterestType;

public class ModVillager {

    public static final RegistryKey<PointOfInterestType> SOUND_POI_KEY = poiKey("tofupoi");
    public static final PointOfInterestType SOUND_POI = registerPoi("tofupoi", ModBlocks.MOMEN_TOFU_BLOCK);

    public static final VillagerProfession TOFU_VILLAGER = registerProfession("tofu_villager", SOUND_POI_KEY);

    public static VillagerProfession registerProfession(String name, RegistryKey<PointOfInterestType> type) {
        return Registry.register(Registries.VILLAGER_PROFESSION, new Identifier(Tofumod.MOD_ID, name),
                new VillagerProfession(name, entry -> entry.matchesKey(type), entry -> entry.matchesKey(type),
                        ImmutableSet.of(), ImmutableSet.of(), SoundEvents.ENTITY_VILLAGER_WORK_LIBRARIAN));
    }

    public static PointOfInterestType registerPoi(String name, Block block) {
        return PointOfInterestHelper.register(new Identifier(Tofumod.MOD_ID, name), 1, 1, block);
    }

    public static RegistryKey<PointOfInterestType> poiKey(String name){
        return RegistryKey.of(RegistryKeys.POINT_OF_INTEREST_TYPE, new Identifier(Tofumod.MOD_ID, name));
    }

    public static void registerModVillagers() {
        Tofumod.LOGGER.info("Registering ModVillagers");
    }
}
