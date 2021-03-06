package com.kashdeya.tinyprogressions.proxy;

import net.minecraftforge.fml.common.registry.GameRegistry;

import com.kashdeya.tinyprogressions.handlers.FuelHandler;
import com.kashdeya.tinyprogressions.recipes.Recipes;
import com.kashdeya.tinyprogressions.tiles.TileEntityBlazeCobblegen;
import com.kashdeya.tinyprogressions.tiles.TileEntityCobblegen;
import com.kashdeya.tinyprogressions.tiles.TileEntityDiamondCobblegen;
import com.kashdeya.tinyprogressions.tiles.TileEntityEmeraldCobblegen;
import com.kashdeya.tinyprogressions.tiles.TileEntityGrowth;
import com.kashdeya.tinyprogressions.tiles.TileEntityGrowthUpgrade;
import com.kashdeya.tinyprogressions.tiles.TileEntityGrowthUpgradeTwo;
import com.kashdeya.tinyprogressions.tiles.TileEntityIronCobblegen;
import com.kashdeya.tinyprogressions.util.RemoveItems;

public class CommonProxy {

	public void registerTileEntities() {
    	// Tile Entities
    	GameRegistry.registerTileEntity(TileEntityCobblegen.class, "tileEntityCobblegen");
    	GameRegistry.registerTileEntity(TileEntityIronCobblegen.class, "tileEntityIronCobblegen");
    	GameRegistry.registerTileEntity(TileEntityDiamondCobblegen.class, "tileEntityDiamondCobblegen");
    	GameRegistry.registerTileEntity(TileEntityEmeraldCobblegen.class, "tileEntityEmeraldCobblegen");
    	GameRegistry.registerTileEntity(TileEntityBlazeCobblegen.class, "tileEntityBlazeCobblegen");
    	GameRegistry.registerTileEntity(TileEntityGrowth.class, "tileEntityGrowth");
    	GameRegistry.registerTileEntity(TileEntityGrowthUpgrade.class, "tileEntityGrowthUpgrade");
    	GameRegistry.registerTileEntity(TileEntityGrowthUpgradeTwo.class, "tileEntityGrowthUpgradeTwo");
		
	}

    public void init() {
    	// Recipes
    	Recipes.registerRecipes();
    	RemoveItems.initRemove();
    	
    	// FuelHandler
    	GameRegistry.registerFuelHandler(new FuelHandler());
    	
    	// Load WorldGeneration

    }

	public void registerRenderers() {
		//unused - only called clientside
	}

}
