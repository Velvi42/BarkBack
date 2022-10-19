package me.velvi.barkback;

import org.bukkit.*;
import org.bukkit.block.Block;
import org.bukkit.block.data.BlockData;
import org.bukkit.block.data.Orientable;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class EventListener implements Listener {
    @EventHandler
    public void onBlockClick(PlayerInteractEvent e){
        Player player = e.getPlayer();
        Block block = e.getClickedBlock();
        ItemStack item = e.getItem();

        if(block == null || item == null) return;
        if(!(block.getBlockData() instanceof Orientable)) return;
        Axis axis = ((Orientable) block.getBlockData()).getAxis();
        if(e.getAction() != Action.RIGHT_CLICK_BLOCK) return;
        if(item.getType() == Material.WOODEN_AXE || item.getType() == Material.STONE_AXE || item.getType() == Material.GOLDEN_AXE || item.getType() == Material.IRON_AXE || item.getType() == Material.DIAMOND_AXE || item.getType() == Material.NETHERITE_AXE) {
            switch (block.getType()){
                case STRIPPED_OAK_LOG:
                    setBlockWithAxis(block, Material.OAK_LOG, axis);
                    player.playSound(player, Sound.ITEM_AXE_STRIP, SoundCategory.BLOCKS, 1.0F, 0.1F);
                    e.setCancelled(true);
                    
                    break;
                case STRIPPED_OAK_WOOD:
                    setBlockWithAxis(block, Material.OAK_WOOD, axis);
                    //block.setType(Material.OAK_WOOD);
                    player.playSound(player, Sound.ITEM_AXE_STRIP, SoundCategory.BLOCKS, 1.0F, 0.1F);
                    e.setCancelled(true);
                    
                    break;
                case STRIPPED_SPRUCE_LOG:
                    setBlockWithAxis(block, Material.SPRUCE_LOG, axis);
                    //block.setType(Material.SPRUCE_LOG);
                    player.playSound(player, Sound.ITEM_AXE_STRIP, SoundCategory.BLOCKS, 1.0F, 0.1F);
                    e.setCancelled(true);
                    
                    break;
                case STRIPPED_SPRUCE_WOOD:
                    setBlockWithAxis(block, Material.SPRUCE_WOOD, axis);
                    //block.setType(Material.SPRUCE_WOOD);
                    player.playSound(player, Sound.ITEM_AXE_STRIP, SoundCategory.BLOCKS, 1.0F, 0.1F);
                    e.setCancelled(true);
                    
                    break;
                case STRIPPED_BIRCH_LOG:
                    setBlockWithAxis(block, Material.BIRCH_LOG, axis);
                    //block.setType(Material.BIRCH_LOG);
                    player.playSound(player, Sound.ITEM_AXE_STRIP, SoundCategory.BLOCKS, 1.0F, 0.1F);
                    e.setCancelled(true);
                    
                    break;
                case STRIPPED_BIRCH_WOOD:
                    setBlockWithAxis(block, Material.BIRCH_WOOD, axis);
                    //block.setType(Material.BIRCH_WOOD);
                    player.playSound(player, Sound.ITEM_AXE_STRIP, SoundCategory.BLOCKS, 1.0F, 0.1F);
                    e.setCancelled(true);
                    
                    break;
                case STRIPPED_JUNGLE_LOG:
                    setBlockWithAxis(block, Material.JUNGLE_LOG, axis);
                    //block.setType(Material.JUNGLE_LOG);
                    player.playSound(player, Sound.ITEM_AXE_STRIP, SoundCategory.BLOCKS, 1.0F, 0.1F);
                    e.setCancelled(true);
                    
                    break;
                case STRIPPED_JUNGLE_WOOD:
                    setBlockWithAxis(block, Material.JUNGLE_WOOD, axis);
                    //block.setType(Material.JUNGLE_WOOD);
                    player.playSound(player, Sound.ITEM_AXE_STRIP, SoundCategory.BLOCKS, 1.0F, 0.1F);
                    e.setCancelled(true);
                    
                    break;
                case STRIPPED_ACACIA_LOG:
                    setBlockWithAxis(block, Material.ACACIA_LOG, axis);
                    //block.setType(Material.ACACIA_LOG);
                    player.playSound(player, Sound.ITEM_AXE_STRIP, SoundCategory.BLOCKS, 1.0F, 0.1F);
                    e.setCancelled(true);
                    
                    break;
                case STRIPPED_ACACIA_WOOD:
                    setBlockWithAxis(block, Material.ACACIA_WOOD, axis);
                    //block.setType(Material.ACACIA_WOOD);
                    player.playSound(player, Sound.ITEM_AXE_STRIP, SoundCategory.BLOCKS, 1.0F, 0.1F);
                    e.setCancelled(true);
                    
                    break;
                case STRIPPED_DARK_OAK_LOG:
                    setBlockWithAxis(block, Material.DARK_OAK_LOG, axis);
                    //block.setType(Material.DARK_OAK_LOG);
                    player.playSound(player, Sound.ITEM_AXE_STRIP, SoundCategory.BLOCKS, 1.0F, 0.1F);
                    e.setCancelled(true);
                    
                    break;
                case STRIPPED_DARK_OAK_WOOD:
                    setBlockWithAxis(block, Material.DARK_OAK_WOOD, axis);
                    //block.setType(Material.DARK_OAK_WOOD);
                    player.playSound(player, Sound.ITEM_AXE_STRIP, SoundCategory.BLOCKS, 1.0F, 0.1F);
                    e.setCancelled(true);
                    
                    break;
                case STRIPPED_MANGROVE_LOG:
                    setBlockWithAxis(block, Material.MANGROVE_LOG, axis);
                    //block.setType(Material.MANGROVE_LOG);
                    player.playSound(player, Sound.ITEM_AXE_STRIP, SoundCategory.BLOCKS, 1.0F, 0.1F);
                    e.setCancelled(true);
                    
                    break;
                case STRIPPED_MANGROVE_WOOD:
                    setBlockWithAxis(block, Material.MANGROVE_WOOD, axis);
                    //block.setType(Material.MANGROVE_WOOD);
                    player.playSound(player, Sound.ITEM_AXE_STRIP, SoundCategory.BLOCKS, 1.0F, 0.1F);
                    e.setCancelled(true);
                    
                    break;
                case STRIPPED_CRIMSON_HYPHAE:
                    setBlockWithAxis(block, Material.CRIMSON_HYPHAE, axis);
                    //block.setType(Material.CRIMSON_HYPHAE);
                    player.playSound(player, Sound.ITEM_AXE_STRIP, SoundCategory.BLOCKS, 1.0F, 0.1F);
                    e.setCancelled(true);
                    
                    break;
                case STRIPPED_CRIMSON_STEM:
                    setBlockWithAxis(block, Material.CRIMSON_STEM, axis);
                    //block.setType(Material.CRIMSON_STEM);
                    player.playSound(player, Sound.ITEM_AXE_STRIP, SoundCategory.BLOCKS, 1.0F, 0.1F);
                    e.setCancelled(true);
                    
                    break;
                case STRIPPED_WARPED_HYPHAE:
                    setBlockWithAxis(block, Material.WARPED_HYPHAE, axis);
                    //block.setType(Material.WARPED_HYPHAE);
                    player.playSound(player, Sound.ITEM_AXE_STRIP, SoundCategory.BLOCKS, 1.0F, 0.1F);
                    e.setCancelled(true);
                    
                    break;
                case STRIPPED_WARPED_STEM:
                    setBlockWithAxis(block, Material.WARPED_STEM, axis);
                    //block.setType(Material.WARPED_STEM);
                    player.playSound(player, Sound.ITEM_AXE_STRIP, SoundCategory.BLOCKS, 1.0F, 0.1F);
                    e.setCancelled(true);
                    
                    break;
            }
        }

    }
    public static void setBlockWithAxis(Block b, Material m, Axis axis){
        b.setType(m);
        BlockData bd = b.getBlockData();
        ((Orientable) bd).setAxis(axis);
        b.setBlockData(bd);
    }

}
