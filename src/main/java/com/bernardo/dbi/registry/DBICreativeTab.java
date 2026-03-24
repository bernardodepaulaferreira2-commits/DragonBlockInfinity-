package com.bernardo.dbi.registry;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class DBICreativeTab {

    public static final ItemGroup DBI_TAB = Registry.register(
            Registries.ITEM_GROUP,
            new Identifier("dragonblockinfinity", "dbi_tab"),
            FabricItemGroup.builder()
                    .displayName(Text.translatable("itemGroup.dbi_tab"))
                    .icon(() -> new ItemStack(DBIItems.BLOCK_DRAGONBALL1))
                    .entries((context, entries) -> {
                        entries.add(DBIItems.BLOCK_DRAGONBALL1);
                        entries.add(DBIItems.BLOCK_DRAGONBALL2);
                        entries.add(DBIItems.BLOCK_DRAGONBALL3);
                        entries.add(DBIItems.BLOCK_DRAGONBALL4);
                        entries.add(DBIItems.BLOCK_DRAGONBALL5);
                        entries.add(DBIItems.BLOCK_DRAGONBALL6);
                        entries.add(DBIItems.BLOCK_DRAGONBALL7);
                        entries.add(DBIItems.NAMEK_GRASS);
                        entries.add(DBIItems.NAMEK_DIRTY);
                        entries.add(DBIItems.DIRTY_STONE);
                        entries.add(DBIItems.DIRTY_STONE_COBBLESTONE);
                        entries.add(DBIItems.SENZU);
                        entries.add(DBIItems.DINO_MEAT);
                        entries.add(DBIItems.DINO_MEAT_COOKED);
                        entries.add(DBIItems.NIMBUS);
                        entries.add(DBIItems.RADAR);
                        entries.add(DBIItems.PESO);
                        entries.add(DBIItems.SCOUTER);
                    })
                    .build());

    public static void initialize() {}
}
