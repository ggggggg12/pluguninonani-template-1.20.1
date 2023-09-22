package net.qw09.pluguninonani.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.CropBlock;
import net.minecraft.item.ItemConvertible;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.qw09.pluguninonani.item.ModItems;

public class QuickOneCropBlock extends CropBlock {
    public static final int MAX_AGE = 2;
    public static final IntProperty AGE = IntProperty.of("age", 0, 2);
    public QuickOneCropBlock(Settings settings){
        super(settings);

    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return ModItems.QUICK_ONE;
    }

    @Override
    protected IntProperty getAgeProperty() {
        return AGE;
    }

    @Override
    public int getMaxAge() {
        return MAX_AGE;
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(AGE);

    }
}


