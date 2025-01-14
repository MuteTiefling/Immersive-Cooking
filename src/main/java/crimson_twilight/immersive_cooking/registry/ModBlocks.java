package crimson_twilight.immersive_cooking.registry;

import crimson_twilight.immersive_cooking.ImmersiveCooking;
import crimson_twilight.immersive_cooking.blocks.CounterTop;
import crimson_twilight.immersive_cooking.blocks.PantryCounter;
import crimson_twilight.immersive_cooking.blocks.StoveHood;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks
{
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ImmersiveCooking.MODID);

    public static final RegistryObject<Block> GLAZED_TILES = BLOCKS.register("glazed_tiles",
            () -> new Block(Block.Properties.copy(Blocks.TERRACOTTA).strength(0.8f, 0.2f).harvestTool(ToolType.PICKAXE)));

    public static final RegistryObject<Block> STOVE_HOOD = BLOCKS.register("stove_hood",
            () -> new StoveHood(Block.Properties.copy(Blocks.IRON_BLOCK).strength(0.8f, 0.2f).harvestTool(ToolType.PICKAXE)));

    public static final RegistryObject<Block> STONE_COUNTERTOP = BLOCKS.register("stone_countertop",
            () -> new CounterTop(Block.Properties.copy(Blocks.SMOOTH_STONE).strength(0.8f, 0.2f).harvestTool(ToolType.PICKAXE)));
    public static final RegistryObject<Block> BLACKSTONE_COUNTERTOP = BLOCKS.register("blackstone_countertop",
            () -> new CounterTop(Block.Properties.copy(Blocks.POLISHED_BLACKSTONE).strength(0.8f, 0.2f).harvestTool(ToolType.PICKAXE)));
    public static final RegistryObject<Block> ANDESITE_COUNTERTOP = BLOCKS.register("andesite_countertop",
            () -> new CounterTop(Block.Properties.copy(Blocks.POLISHED_ANDESITE).strength(0.8f, 0.2f).harvestTool(ToolType.PICKAXE)));
    public static final RegistryObject<Block> DIORITE_COUNTERTOP = BLOCKS.register("diorite_countertop",
            () -> new CounterTop(Block.Properties.copy(Blocks.POLISHED_DIORITE).strength(0.8f, 0.2f).harvestTool(ToolType.PICKAXE)));
    public static final RegistryObject<Block> GRANITE_COUNTERTOP = BLOCKS.register("granite_countertop",
            () -> new CounterTop(Block.Properties.copy(Blocks.POLISHED_GRANITE).strength(0.8f, 0.2f).harvestTool(ToolType.PICKAXE)));

    public static final RegistryObject<Block> OAK_STONE_PANTRY = BLOCKS.register("oak_stone_pantry",
            () -> new PantryCounter(Block.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> BIRCH_STONE_PANTRY = BLOCKS.register("birch_stone_pantry",
            () -> new PantryCounter(Block.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> SPRUCE_STONE_PANTRY = BLOCKS.register("spruce_stone_pantry",
            () -> new PantryCounter(Block.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> JUNGLE_STONE_PANTRY = BLOCKS.register("jungle_stone_pantry",
            () -> new PantryCounter(Block.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> ACACIA_STONE_PANTRY = BLOCKS.register("acacia_stone_pantry",
            () -> new PantryCounter(Block.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> DARK_OAK_STONE_PANTRY = BLOCKS.register("dark_oak_stone_pantry",
            () -> new PantryCounter(Block.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> CRIMSON_STONE_PANTRY = BLOCKS.register("crimson_stone_pantry",
            () -> new PantryCounter(Block.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> WARPED_STONE_PANTRY = BLOCKS.register("warped_stone_pantry",
            () -> new PantryCounter(Block.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> OAK_BLACKSTONE_PANTRY = BLOCKS.register("oak_blackstone_pantry",
            () -> new PantryCounter(Block.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> BIRCH_BLACKSTONE_PANTRY = BLOCKS.register("birch_blackstone_pantry",
            () -> new PantryCounter(Block.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> SPRUCE_BLACKSTONE_PANTRY = BLOCKS.register("spruce_blackstone_pantry",
            () -> new PantryCounter(Block.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> JUNGLE_BLACKSTONE_PANTRY = BLOCKS.register("jungle_blackstone_pantry",
            () -> new PantryCounter(Block.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> ACACIA_BLACKSTONE_PANTRY = BLOCKS.register("acacia_blackstone_pantry",
            () -> new PantryCounter(Block.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> DARK_OAK_BLACKSTONE_PANTRY = BLOCKS.register("dark_oak_blackstone_pantry",
            () -> new PantryCounter(Block.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> CRIMSON_BLACKSTONE_PANTRY = BLOCKS.register("crimson_blackstone_pantry",
            () -> new PantryCounter(Block.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> WARPED_BLACKSTONE_PANTRY = BLOCKS.register("warped_blackstone_pantry",
            () -> new PantryCounter(Block.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> OAK_ANDESITE_PANTRY = BLOCKS.register("oak_andesite_pantry",
            () -> new PantryCounter(Block.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> BIRCH_ANDESITE_PANTRY = BLOCKS.register("birch_andesite_pantry",
            () -> new PantryCounter(Block.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> SPRUCE_ANDESITE_PANTRY = BLOCKS.register("spruce_andesite_pantry",
            () -> new PantryCounter(Block.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> JUNGLE_ANDESITE_PANTRY = BLOCKS.register("jungle_andesite_pantry",
            () -> new PantryCounter(Block.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> ACACIA_ANDESITE_PANTRY = BLOCKS.register("acacia_andesite_pantry",
            () -> new PantryCounter(Block.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> DARK_OAK_ANDESITE_PANTRY = BLOCKS.register("dark_oak_andesite_pantry",
            () -> new PantryCounter(Block.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> CRIMSON_ANDESITE_PANTRY = BLOCKS.register("crimson_andesite_pantry",
            () -> new PantryCounter(Block.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> WARPED_ANDESITE_PANTRY = BLOCKS.register("warped_andesite_pantry",
            () -> new PantryCounter(Block.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> OAK_DIORITE_PANTRY = BLOCKS.register("oak_diorite_pantry",
            () -> new PantryCounter(Block.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> BIRCH_DIORITE_PANTRY = BLOCKS.register("birch_diorite_pantry",
            () -> new PantryCounter(Block.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> SPRUCE_DIORITE_PANTRY = BLOCKS.register("spruce_diorite_pantry",
            () -> new PantryCounter(Block.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> JUNGLE_DIORITE_PANTRY = BLOCKS.register("jungle_diorite_pantry",
            () -> new PantryCounter(Block.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> ACACIA_DIORITE_PANTRY = BLOCKS.register("acacia_diorite_pantry",
            () -> new PantryCounter(Block.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> DARK_OAK_DIORITE_PANTRY = BLOCKS.register("dark_oak_diorite_pantry",
            () -> new PantryCounter(Block.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> CRIMSON_DIORITE_PANTRY = BLOCKS.register("crimson_diorite_pantry",
            () -> new PantryCounter(Block.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> WARPED_DIORITE_PANTRY = BLOCKS.register("warped_diorite_pantry",
            () -> new PantryCounter(Block.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> OAK_GRANITE_PANTRY = BLOCKS.register("oak_granite_pantry",
            () -> new PantryCounter(Block.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> BIRCH_GRANITE_PANTRY = BLOCKS.register("birch_granite_pantry",
            () -> new PantryCounter(Block.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> SPRUCE_GRANITE_PANTRY = BLOCKS.register("spruce_granite_pantry",
            () -> new PantryCounter(Block.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> JUNGLE_GRANITE_PANTRY = BLOCKS.register("jungle_granite_pantry",
            () -> new PantryCounter(Block.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> ACACIA_GRANITE_PANTRY = BLOCKS.register("acacia_granite_pantry",
            () -> new PantryCounter(Block.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> DARK_OAK_GRANITE_PANTRY = BLOCKS.register("dark_oak_granite_pantry",
            () -> new PantryCounter(Block.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> CRIMSON_GRANITE_PANTRY = BLOCKS.register("crimson_granite_pantry",
            () -> new PantryCounter(Block.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> WARPED_GRANITE_PANTRY = BLOCKS.register("warped_granite_pantry",
            () -> new PantryCounter(Block.Properties.copy(Blocks.BARREL)));
}
