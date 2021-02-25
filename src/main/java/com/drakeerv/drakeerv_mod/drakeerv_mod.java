package com.drakeerv.drakeerv_mod;

import com.drakeerv.drakeerv_mod.generator.modgenerate;
import com.drakeerv.drakeerv_mod.registry.moditems;
import com.drakeerv.drakeerv_mod.registry.modblocks;
import net.fabricmc.api.ModInitializer;

public class drakeerv_mod implements ModInitializer{

    public static final String MOD_ID = "drakeervmod";

    @Override
    public void onInitialize() {
        moditems.registerItems();
        modblocks.registerBlocks();
        modgenerate.registerGenerator();
    }
    
}
