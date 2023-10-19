package com.mangomilk.design_decor.blocks.millstone.block;

import com.mangomilk.design_decor.registry.MmbBlockEntities;
import com.simibubi.create.content.kinetics.millstone.MillstoneBlock;
import com.simibubi.create.content.kinetics.millstone.MillstoneBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;

public class CalciteDecoMillStoneBlock extends MillstoneBlock {
    public CalciteDecoMillStoneBlock(Properties properties) {
        super(properties);
    }



    @Override
    public BlockEntityType<? extends MillstoneBlockEntity> getBlockEntityType() {
        return MmbBlockEntities.CALCITE_MILLSTONE.get();
    }
}
