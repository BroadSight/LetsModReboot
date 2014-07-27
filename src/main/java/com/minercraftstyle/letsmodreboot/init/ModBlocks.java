package com.minercraftstyle.letsmodreboot.init;

import com.minercraftstyle.letsmodreboot.block.BlockFlag;
import com.minercraftstyle.letsmodreboot.block.BlockLMRB;
import com.minercraftstyle.letsmodreboot.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockLMRB flag = new BlockFlag();

    public static void init()
    {
        GameRegistry.registerBlock(flag, "flag");
    }
}
