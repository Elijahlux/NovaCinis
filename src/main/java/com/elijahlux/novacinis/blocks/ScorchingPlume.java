package com.elijahlux.novacinis.blocks;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class ScorchingPlume extends Block {
    public ScorchingPlume() {
        super(Properties.create(Material.SAND)
                .sound(SoundType.SAND)
                .hardnessAndResistance(0.8f)
                .lightValue(8)
        );
        setRegistryName("scorchingplume");
    }
}
