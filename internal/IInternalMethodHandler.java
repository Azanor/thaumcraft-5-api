package thaumcraft.api.internal;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.golems.seals.ISeal;
import thaumcraft.api.golems.seals.ISealEntity;
import thaumcraft.api.golems.seals.SealPos;
import thaumcraft.api.golems.tasks.Task;

public interface IInternalMethodHandler {

	public boolean isResearchComplete(String username, String researchkey);
	public AspectList getObjectAspects(ItemStack is);
	public AspectList generateTags(Item item, int meta);
	public boolean consumeVisFromWand(ItemStack wand, EntityPlayer player, AspectList cost, boolean doit, boolean crafting);
	public boolean consumeVisFromInventory(EntityPlayer player, AspectList cost);
	public void addWarpToPlayer(EntityPlayer player, int amount, EnumWarpType type);
	public int getPlayerWarp(EntityPlayer player, EnumWarpType type);
	public void markRunicDirty(Entity entity);
	public boolean completeResearch(EntityPlayer player, String researchkey);
	public boolean drainAura(World world, BlockPos pos, Aspect aspect,int amount);
	public int drainAuraAvailable(World world, BlockPos pos, Aspect aspect, int amount);
	public void addAura(World world, BlockPos pos, Aspect aspect, int amount);
	public void pollute(World world, BlockPos pos, int amount, boolean showEffect);
	public int getAura(World world, BlockPos pos, Aspect aspect);
	public int getAuraBase(World world, BlockPos pos);	
	public void registerSeal(ISeal seal);
	public ISeal getSeal(String key);
	public ISealEntity getSealEntity(int dim, SealPos pos);
	public void addGolemTask(int dim, Task task);
	public boolean shouldPreserveAura(World world, EntityPlayer player, BlockPos pos, Aspect aspect);
	public ItemStack getSealStack(String key);
	
}
