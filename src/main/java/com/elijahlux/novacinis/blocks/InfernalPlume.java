package com.elijahlux.novacinis.blocks;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class InfernalPlume extends Block {
    public InfernalPlume() {
        super(Properties.create(Material.SAND)
                .sound(SoundType.SAND)
                .hardnessAndResistance(0.9f)
                .lightValue(12)
        );
        setRegistryName("infernalplume");
    }
}
