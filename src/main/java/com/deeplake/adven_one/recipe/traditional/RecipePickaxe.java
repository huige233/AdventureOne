package com.deeplake.adven_one.recipe.traditional;

import com.deeplake.adven_one.util.CraftUtil;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.crafting.ShapedRecipes;
import net.minecraft.util.NonNullList;
import net.minecraftforge.oredict.OreDictionary;

import java.util.Objects;

public class RecipePickaxe extends ShapedRecipes {

    public RecipePickaxe(Item gem, Item result) {
        super(CraftUtil.SUIT, 3, 3, NonNullList.create(), new ItemStack(result));
        Ingredient gemIng = Ingredient.fromItems(gem);
        Ingredient stickIng = CraftUtil.create(OreDictionary.getOres(CraftUtil.STICK_WOOD));

        recipeItems.add(gemIng);
        recipeItems.add(gemIng);
        recipeItems.add(gemIng);

        recipeItems.add(Ingredient.EMPTY);
        recipeItems.add(stickIng);
        recipeItems.add(Ingredient.EMPTY);

        recipeItems.add(Ingredient.EMPTY);
        recipeItems.add(stickIng);
        recipeItems.add(Ingredient.EMPTY);

        setRegistryName(Objects.requireNonNull(result.getRegistryName()));
    }
}
