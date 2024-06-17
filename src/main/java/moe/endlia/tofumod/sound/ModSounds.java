package moe.endlia.tofumod.sound;

import moe.endlia.tofumod.Tofumod;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {

    public static final SoundEvent TOFU_BUGLE = registerSoundEvent("tofu_bugle");

    public static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(Tofumod.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));

    }

    public static void registerSounds() {
        Tofumod.LOGGER.info("Registering ModSounds for" + Tofumod.MOD_ID);
    }
}
