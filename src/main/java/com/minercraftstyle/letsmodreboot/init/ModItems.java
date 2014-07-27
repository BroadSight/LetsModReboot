package com.minercraftstyle.letsmodreboot.init;

import com.minercraftstyle.letsmodreboot.item.ItemLMRB;
import com.minercraftstyle.letsmodreboot.item.ItemMapleLeaf;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems
{
    public static final ItemLMRB mapleLeaf = new ItemMapleLeaf();

    public static void init()
    {
        GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
    }
}
