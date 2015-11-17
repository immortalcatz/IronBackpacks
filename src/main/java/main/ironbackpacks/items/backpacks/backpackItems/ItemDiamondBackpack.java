package main.ironbackpacks.items.backpacks.backpackItems;


import main.ironbackpacks.items.backpacks.ItemBaseBackpack;
import main.ironbackpacks.util.ConfigHandler;
import main.ironbackpacks.util.IronBackpacksConstants;

public class ItemDiamondBackpack extends ItemBaseBackpack{

    public ItemDiamondBackpack() {
        super("diamondBackpack", ConfigHandler.useAlternateBackpackTextures ? "backpack_diamond_alt" : "backpack_diamond", ConfigHandler.enumDiamondBackpack.upgradePoints.getValue(), IronBackpacksConstants.Backpacks.DIAMOND_ID);
    }


}