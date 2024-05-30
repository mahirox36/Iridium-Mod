package net.mahiro.iridium.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.mahiro.iridium.Iridium;
import net.mahiro.iridium.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup IridiumGroup = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Iridium.MOD_ID, "iridium_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ruby")).icon(() -> new ItemStack(ModItems.ruby)).entries(((displayContext, e) -> {

                //Adding the Items in the custom group
                e.add(ModItems.raw_ruby);
                e.add(ModItems.ruby);

                e.add(ModBlocks.RUBY_ORE);
                e.add(ModBlocks.RAW_RUBY_BLOCK);
                e.add(ModBlocks.RUBY_BLOCK);



            })).build());
    public static void registerItemsGroups(){
        Iridium.LOGGER.info("Registering Items groups for "+Iridium.MOD_ID);
    }
}
