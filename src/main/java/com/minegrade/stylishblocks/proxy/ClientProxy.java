package com.minegrade.stylishblocks.proxy;

import com.minegrade.stylishblocks.init.ModBlocks;
import com.minegrade.stylishblocks.init.ModItems;

public class ClientProxy extends CommonProxy {
	
	@Override
	public void registerRenders() {
		ModBlocks.registerRenders();
		ModItems.registerRenders();
	}
}
