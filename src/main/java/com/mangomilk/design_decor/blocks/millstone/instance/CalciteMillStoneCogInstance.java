package com.mangomilk.design_decor.blocks.millstone.instance;

import com.mangomilk.design_decor.base.DecoPartialModels;
import com.mangomilk.design_decor.blocks.millstone.DecoMillStoneBlockEntity;
import com.simibubi.create.content.kinetics.base.SingleRotatingInstance;import com.jozufozu.flywheel.api.Instancer;
import com.jozufozu.flywheel.api.MaterialManager;
import com.simibubi.create.content.kinetics.base.flwdata.RotatingData;

public class CalciteMillStoneCogInstance extends SingleRotatingInstance<DecoMillStoneBlockEntity> {

    public CalciteMillStoneCogInstance(MaterialManager materialManager, DecoMillStoneBlockEntity blockEntity) {super(materialManager, blockEntity);}

    @Override
    protected Instancer<RotatingData> getModel() {
        return getRotatingMaterial().getModel(DecoPartialModels.CALCITE_MILLSTONE_COG, blockEntity.getBlockState());
    }
}
