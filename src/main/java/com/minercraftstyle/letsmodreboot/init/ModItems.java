package com.minercraftstyle.letsmodreboot.init;

import com.minercraftstyle.letsmodreboot.item.ItemLMRB;
import com.minercraftstyle.letsmodreboot.item.ItemMapleLeaf;
import com.minercraftstyle.letsmodreboot.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemLMRB mapleLeaf = new ItemMapleLeaf();

    public static void init()
    {
        GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
    }
}
