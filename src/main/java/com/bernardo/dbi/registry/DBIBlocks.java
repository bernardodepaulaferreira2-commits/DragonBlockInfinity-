package com.bernardo.dbi.registry;

import com.bernardo.dbi.block.DragonBallBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class DBIBlocks {

    public static final Block BLOCK_DRAGONBALL1 = register("block_dragonball1",
            new DragonBallBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.ORANGE)
                    .strength(3.0f, 6.0f)
                    .sounds(BlockSoundGroup.GLASS)
                    .nonOpaque()
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block BLOCK_DRAGONBALL2 = register("block_dragonball2",
            new DragonBallBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.ORANGE)
                    .strength(3.0f, 6.0f)
                    .sounds(BlockSoundGroup.GLASS)
                    .nonOpaque()
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block BLOCK_DRAGONBALL3 = register("block_dragonball3",
            new DragonBallBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.ORANGE)
                    .strength(3.0f, 6.0f)
                    .sounds(BlockSoundGroup.GLASS)
                    .nonOpaque()
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block BLOCK_DRAGONBALL4 = register("block_dragonball4",
            new DragonBallBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.ORANGE)
                    .strength(3.0f, 6.0f)
                    .sounds(BlockSoundGroup.GLASS)
                    .nonOpaque()
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block BLOCK_DRAGONBALL5 = register("block_dragonball5",
            new DragonBallBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.ORANGE)
                    .strength(3.0f, 6.0f)
                    .sounds(BlockSoundGroup.GLASS)
                    .nonOpaque()
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block BLOCK_DRAGONBALL6 = register("block_dragonball6",
            new DragonBallBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.ORANGE)
                    .strength(3.0f, 6.0f)
                    .sounds(BlockSoundGroup.GLASS)
                    .nonOpaque()
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block BLOCK_DRAGONBALL7 = register("block_dragonball7",
            new DragonBallBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.ORANGE)
                    .strength(3.0f, 6.0f)
                    .sounds(BlockSoundGroup.GLASS)
                    .nonOpaque()
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block NAMEK_GRASS = register("namek_grass",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.GREEN)
                    .strength(0.6f)
                    .sounds(BlockSoundGroup.GRASS)));

    public static final Block NAMEK_DIRTY = register("namek_dirty",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.DIRT_BROWN)
                    .strength(0.5f)
                    .sounds(BlockSoundGroup.GRAVEL)));

    public static final Block DIRTY_STONE = register("dirty_stone",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.STONE_GRAY)
                    .strength(1.5f, 6.0f)
                    .sounds(BlockSoundGroup.STONE)
                    .requiresTool()));

    public static final Block DIRTY_STONE_COBBLESTONE = register("dirty_stone_cobblestone",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.STONE_GRAY)
                    .strength(2.0f, 6.0f)
                    .sounds(BlockSoundGroup.STONE)
                    .requiresTool()));

    private static Block register(String name, Block block) {
        return Registry.register(Registries.BLOCK, new Identifier("dragonblockinfinity", name), block);
    }

    public static void initialize() {}
}
