package team.lodestar.lodestone.systems.worldgen;

import net.minecraft.util.RandomSource;
import team.lodestar.lodestone.registry.common.LodestonePlacementFillerRegistry;
import com.mojang.serialization.Codec;
import net.minecraft.core.BlockPos;
import net.minecraft.util.ExtraCodecs;
import net.minecraft.world.level.levelgen.placement.PlacementContext;
import net.minecraft.world.level.levelgen.placement.PlacementFilter;
import net.minecraft.world.level.levelgen.placement.PlacementModifierType;

import java.util.Random;

public class ChancePlacementFilter extends PlacementFilter {
   public static final Codec<ChancePlacementFilter> CODEC = ExtraCodecs.POSITIVE_FLOAT.fieldOf("chance").xmap(ChancePlacementFilter::new, (p_191907_) -> p_191907_.chance).codec();
   private final float chance;

   public ChancePlacementFilter(float chance) {
      this.chance = chance;
   }

   @Override
   protected boolean shouldPlace(PlacementContext pContext, RandomSource pRandom, BlockPos pPos) {
      return pRandom.nextFloat() < chance;
   }

   public PlacementModifierType<?> type() {
      return LodestonePlacementFillerRegistry.CHANCE;
   }
}