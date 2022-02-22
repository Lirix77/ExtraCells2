package extracells.gui.widget;

import extracells.gui.widget.fluid.AbstractFluidWidget;
import extracells.gui.widget.fluid.WidgetFluidSelector;
import net.minecraftforge.fluids.FluidStack;

import java.util.Comparator;

public class FluidWidgetComparator implements Comparator<AbstractFluidWidget> {

	@Override
	public int compare(AbstractFluidWidget o1, AbstractFluidWidget o2) {
		return Long.compare((((WidgetFluidSelector) o2).getAmount()), ((WidgetFluidSelector) o1).getAmount());
	}
}
