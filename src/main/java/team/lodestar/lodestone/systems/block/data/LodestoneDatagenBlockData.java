package team.lodestar.lodestone.systems.block.data;

import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import team.lodestar.lodestone.handlers.ThrowawayBlockDataHandler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Various throwaway data stored in {@link ThrowawayBlockDataHandler#THROWAWAY_DATA_CACHE}, which is only ever instantiated during the data-generation process.
 */
public class LodestoneDatagenBlockData {

    public static final LodestoneDatagenBlockData EMPTY = new LodestoneDatagenBlockData();

    private final List<TagKey<Block>> tags = new ArrayList<>();

    public LodestoneDatagenBlockData addTags(TagKey<Block>... blockTagKeys) {
        tags.addAll(Arrays.asList(blockTagKeys));
        return this;
    }

    public List<TagKey<Block>> getTags() {
        return tags;
    }

    public LodestoneDatagenBlockData needsPickaxe() {
        return addTags(BlockTags.MINEABLE_WITH_PICKAXE);
    }

    public LodestoneDatagenBlockData needsAxe() {
        return addTags(BlockTags.MINEABLE_WITH_AXE);
    }

    public LodestoneDatagenBlockData needsShovel() {
        return addTags(BlockTags.MINEABLE_WITH_SHOVEL);
    }

    public LodestoneDatagenBlockData needsHoe() {
        return addTags(BlockTags.MINEABLE_WITH_HOE);
    }

    public LodestoneDatagenBlockData needsStone() {
        return addTags(BlockTags.NEEDS_STONE_TOOL);
    }

    public LodestoneDatagenBlockData needsIron() {
        return addTags(BlockTags.NEEDS_IRON_TOOL);
    }

    public LodestoneDatagenBlockData needsDiamond() {
        return addTags(BlockTags.NEEDS_DIAMOND_TOOL);
    }
}