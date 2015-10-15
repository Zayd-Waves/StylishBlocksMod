/* Useful package that will create all blocks all at once */

package com.minegrade.stylishblocks.init;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.minegrade.stylishblocks.Reference;
import com.minegrade.stylishblocks.Blocks.BlockTest;

public class ModBlocks {
	
	// My Block #1
	public static Block pokeball;
	
	// My Block #2
	public static Block basketball;
	
	// My Block #3
	public static Block skyBlock;
	
	// My Block #4
	public static Block fireBlock;
	
	// My Block #5
	public static Block iceBlock;
	

	public static void init() {
		// The original Block class is protected so we need to extend it with our own Block class
		pokeball = new BlockTest(Material.wood).setUnlocalizedName("pokeball");
		basketball = new BlockTest(Material.wood).setUnlocalizedName("basketball");
		skyBlock = new BlockTest(Material.wood).setUnlocalizedName("skyBlock");
		fireBlock = new BlockTest(Material.wood).setUnlocalizedName("fireBlock");
		iceBlock = new BlockTest(Material.wood).setUnlocalizedName("iceBlock");
	}
	
	public static void register() {
		GameRegistry.registerBlock(pokeball, pokeball.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(basketball, basketball.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(skyBlock, skyBlock.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(fireBlock, fireBlock.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(iceBlock, iceBlock.getUnlocalizedName().substring(5));
	}
	
	// To register the render in the inventory
	public static void registerRenders() {
		registerRender(pokeball);
		registerRender(basketball);
		registerRender(skyBlock);
		registerRender(fireBlock);
		registerRender(iceBlock);
	}
	
	public static void registerRender(Block block) {
		Item item = Item.getItemFromBlock(block);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));

	}
	
	public static void registerRecipes() {
		
		GameRegistry.addRecipe(new ItemStack(pokeball, 3), new Object[]{"   ", 
			                                                            " R ",
			                                                            " S ", 'R', Blocks.red_sandstone, 'S', Blocks.sandstone});

		GameRegistry.addRecipe(new ItemStack(basketball, 3), new Object[]{"O O", 
			                                                              " W ",
			                                                              "O O", 'O', Blocks.wool, 'W', Blocks.planks});

		GameRegistry.addRecipe(new ItemStack(skyBlock, 3), new Object[]{"O O", 
			                                                            " G ",
			                                                            "O O", 'O', Blocks.wool, 'G', Blocks.glass});

		GameRegistry.addRecipe(new ItemStack(fireBlock, 3), new Object[]{"   ", 
			                                                             " W ",
			                                                             " T ", 'W', Blocks.planks, 'T', Blocks.torch});

		GameRegistry.addRecipe(new ItemStack(iceBlock, 3), new Object[]{"   ", 
			                                                            " GW",
			                                                            "   ", 'G', Blocks.glass, 'W', Blocks.planks});

	}
}
