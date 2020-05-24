package com.elijahlux.novacinis.blocks;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class WarmPlume extends Block {
    public WarmPlume() {
        super(Properties.create(Material.SAND)
                .sound(SoundType.SAND)
                .hardnessAndResistance(0.6f)
                .lightValue(3)
        );
        setRegistryName("warmplume");
    }
}
