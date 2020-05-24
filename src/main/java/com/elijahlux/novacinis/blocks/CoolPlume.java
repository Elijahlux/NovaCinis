package com.elijahlux.novacinis.blocks;
 import net.minecraft.block.Block;
 import net.minecraft.block.SoundType;
 import net.minecraft.block.material.Material;

 public class CoolPlume extends Block {
  public CoolPlume() {
     super(Properties.create(Material.SAND)
             .sound(SoundType.SAND)
             .hardnessAndResistance(0.5f)
     );
     setRegistryName("coolplume");
  }
}
