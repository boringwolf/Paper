package org.bukkit.inventory.meta.trim;

import org.bukkit.Keyed;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.Registry;
import org.bukkit.Translatable;

/**
 * Represents a material that may be used in an {@link ArmorTrim}.
 */
public interface TrimMaterial extends Keyed, Translatable {

    // Paper start - Generated/TrimMaterial
    // @GeneratedFrom 1.20.6
    TrimMaterial AMETHYST = Registry.TRIM_MATERIAL.get(NamespacedKey.minecraft("amethyst"));

    TrimMaterial COPPER = Registry.TRIM_MATERIAL.get(NamespacedKey.minecraft("copper"));

    TrimMaterial DIAMOND = Registry.TRIM_MATERIAL.get(NamespacedKey.minecraft("diamond"));

    TrimMaterial EMERALD = Registry.TRIM_MATERIAL.get(NamespacedKey.minecraft("emerald"));

    TrimMaterial GOLD = Registry.TRIM_MATERIAL.get(NamespacedKey.minecraft("gold"));

    TrimMaterial IRON = Registry.TRIM_MATERIAL.get(NamespacedKey.minecraft("iron"));

    TrimMaterial LAPIS = Registry.TRIM_MATERIAL.get(NamespacedKey.minecraft("lapis"));

    TrimMaterial NETHERITE = Registry.TRIM_MATERIAL.get(NamespacedKey.minecraft("netherite"));

    TrimMaterial QUARTZ = Registry.TRIM_MATERIAL.get(NamespacedKey.minecraft("quartz"));

    TrimMaterial REDSTONE = Registry.TRIM_MATERIAL.get(NamespacedKey.minecraft("redstone"));
    // Paper end - Generated/TrimMaterial

    // Paper start - adventure
    /**
     * Get the description of this {@link TrimMaterial}.
     *
     * @return the description
     */
    net.kyori.adventure.text.@org.jetbrains.annotations.NotNull Component description();

    /**
     * @deprecated this method assumes that {@link #description()} will
     * always be a translatable component which is not guaranteed.
     */
    @Override
    @Deprecated(forRemoval = true)
    @org.jetbrains.annotations.NotNull String getTranslationKey();
    // Paper end - adventure

    // Paper start - Registry#getKey
    /**
     * @deprecated use {@link Registry#getKey(Keyed)} and {@link Registry#TRIM_MATERIAL}. TrimMaterials
     * can exist without a key.
     */
    @Deprecated(forRemoval = true, since = "1.20.4")
    @Override
    org.bukkit.@org.jetbrains.annotations.NotNull NamespacedKey getKey();
    // Paper end - Registry#getKey
}
