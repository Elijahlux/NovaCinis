package com.elijahlux.novacinis.setup;

import net.minecraft.world.World;

public class ServerProxy implements IProxy{

    @Override
    public World getClientWorld(){
        throw new IllegalStateException("Only do this on a client!");
    }
}
