package mezz.jei.api.recipes;

import net.minecraft.util.StatCollector;

/* JEI's IRecipeTypes */
public enum RecipeType implements IRecipeType {
	CRAFTING_TABLE(116, 54, "gui.jei.craftingTableRecipes"),
	FURNACE(82, 54, "gui.jei.furnaceRecipes"),
	;

	private final String localizedName;
	private final int displayWidth;
	private final int displayHeight;

	private RecipeType(int displayWidth, int displayHeight, String unlocalizedName) {
		this.displayWidth = displayWidth;
		this.displayHeight = displayHeight;
		this.localizedName = StatCollector.translateToLocal(unlocalizedName);
	}

	@Override
	public String getLocalizedName() {
		return localizedName;
	}

	@Override
	public int displayWidth() {
		return displayWidth;
	}

	@Override
	public int displayHeight() {
		return displayHeight;
	}
}
