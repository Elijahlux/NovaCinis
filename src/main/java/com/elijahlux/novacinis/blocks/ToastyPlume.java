package com.elijahlux.novacinis.blocks;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class ToastyPlume extends Block {
    public ToastyPlume() {
        super(Properties.create(Material.SAND)
                .sound(SoundType.SAND)
                .hardnessAndResistance(0.7f)
                .lightValue(5)
        );
        setRegistryName("toastyplume");
    }
}
