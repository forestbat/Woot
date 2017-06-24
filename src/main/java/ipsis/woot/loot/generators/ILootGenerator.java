package ipsis.woot.loot.generators;

import ipsis.woot.tileentity.ng.IFarmSetup;
import net.minecraftforge.fluids.capability.IFluidHandler;
import net.minecraftforge.items.IItemHandler;

import javax.annotation.Nonnull;
import java.util.List;

public interface ILootGenerator {

    void generate(@Nonnull List<IFluidHandler> fluidHandlerList, @Nonnull List<IItemHandler> itemHandlerList, @Nonnull IFarmSetup farmSetup);
}