package nc.umtpcm.welfare;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.Objects;

import static nc.umtpcm.welfare.statementWelfare.*;

public class GuiHubWelfare {
    public static void main_gui(Player player){
        //新建物品栏（GUI）
        Inventory guiHubWelfare = Bukkit.createInventory(player,9, ChatColor.BLUE+gui_0);

        //新建物品

        //旧福利
        ItemStack zgui_oldbf_item = new ItemStack(Material.COAL);
        ItemMeta zgui_oldbf_item_meta = zgui_oldbf_item.getItemMeta();
        Objects.requireNonNull(zgui_oldbf_item_meta).setDisplayName(ChatColor.BLUE+gui_oldbf_1);
        ArrayList<String> zgui_oldbf_item_lore = new ArrayList<>();
        zgui_oldbf_item_lore.add(ChatColor.AQUA+gui_old_new_bf_1);
        zgui_oldbf_item_lore.add(ChatColor.AQUA+gui_old_new_bf_2);
        zgui_oldbf_item_meta.setLore(zgui_oldbf_item_lore);
        zgui_oldbf_item.setItemMeta(zgui_oldbf_item_meta);

        //新福利
        ItemStack zgui_newbf_item = new ItemStack(Material.COAL_BLOCK);
        ItemMeta zgui_newbf_item_meta = zgui_newbf_item.getItemMeta();
        Objects.requireNonNull(zgui_newbf_item_meta).setDisplayName(ChatColor.BLUE+gui_newbf_1);
        ArrayList<String> zgui_newbf_item_lore = new ArrayList<>();
        zgui_newbf_item_lore.add(ChatColor.AQUA+gui_old_new_bf_1);
        zgui_newbf_item_lore.add(ChatColor.AQUA+gui_old_new_bf_2);
        zgui_newbf_item_meta.setLore(zgui_newbf_item_lore);
        zgui_newbf_item.setItemMeta(zgui_newbf_item_meta);

        //音乐
        ItemStack zgui_music_item = new ItemStack(Material.JUKEBOX);
        ItemMeta zgui_music_item_meta = zgui_music_item.getItemMeta();
        Objects.requireNonNull(zgui_music_item_meta).setDisplayName(ChatColor.BLUE+gui_music_1);
        ArrayList<String> zgui_music_item_lore = new ArrayList<>();
        zgui_music_item_lore.add(ChatColor.AQUA+gui_music_2);
        zgui_music_item_lore.add(ChatColor.AQUA+gui_music_3);
        zgui_music_item_meta.setLore(zgui_music_item_lore);
        zgui_music_item.setItemMeta(zgui_music_item_meta);

        //彩蛋
        ItemStack zgui_404_item = new ItemStack(Material.BRICK);
        ItemMeta zgui_404_item_meta = zgui_404_item.getItemMeta();
        Objects.requireNonNull(zgui_404_item_meta).setDisplayName(ChatColor.RED+gui_kill_1);
        ArrayList<String> zgui_404_item_lore = new ArrayList<>();
        zgui_404_item_lore.add(ChatColor.RED+gui_kill_2);
        zgui_404_item_meta.setLore(zgui_404_item_lore);
        zgui_404_item.setItemMeta(zgui_404_item_meta);

        //Github
        ItemStack zgui_Git_item = new ItemStack(Material.CRAFTING_TABLE);
        ItemMeta zgui_Git_item_meta = zgui_Git_item.getItemMeta();
        Objects.requireNonNull(zgui_Git_item_meta).setDisplayName(ChatColor.AQUA+gui_Github_1);
        ArrayList<String> zgui_Git_item_lore = new ArrayList<>();
        zgui_Git_item_lore.add(ChatColor.AQUA+Github_1);
        zgui_Git_item_lore.add(ChatColor.AQUA+Github_2);
        zgui_Git_item_meta.setLore(zgui_Git_item_lore);
        zgui_Git_item.setItemMeta(zgui_Git_item_meta);

        //版本
        ItemStack zgui_ver_item = new ItemStack(Material.ENDER_CHEST);
        ItemMeta zgui_ver_item_meta = zgui_ver_item.getItemMeta();
        Objects.requireNonNull(zgui_ver_item_meta).setDisplayName(ChatColor.AQUA+gui_ver_1);
        ArrayList<String> zgui_ver_item_lore = new ArrayList<>();
        zgui_ver_item_lore.add(ChatColor.AQUA+gui_ver_2+version);
        zgui_ver_item_lore.add(ChatColor.AQUA+gui_ver_3);
        zgui_ver_item_meta.setLore(zgui_ver_item_lore);
        zgui_ver_item.setItemMeta(zgui_ver_item_meta);

        //

        //设置物品
        guiHubWelfare.setItem(0,zgui_oldbf_item);
        guiHubWelfare.setItem(1,zgui_newbf_item);
        guiHubWelfare.setItem(2,zgui_music_item);
        guiHubWelfare.setItem(3,zgui_404_item);
        guiHubWelfare.setItem(4,zgui_Git_item);
        guiHubWelfare.setItem(5,zgui_ver_item);

        //打开物品栏
        player.openInventory(guiHubWelfare);
    }
    public static void confirm_oldbf_gui(Player player){//旧 福利 的确认GUI
        //新建旧 福利 物品栏（GUI）
        Inventory confirm_oldbf_Gui = Bukkit.createInventory(player,9, ChatColor.AQUA+oldbf_1);

        //旧 福利 确认
        ItemStack confirm_oldbf_item = new ItemStack(Material.EMERALD);
        ItemMeta confirm_oldbf_meta = confirm_oldbf_item.getItemMeta();
        Objects.requireNonNull(confirm_oldbf_meta).setDisplayName(ChatColor.GREEN + gui_yes);
        confirm_oldbf_item.setItemMeta(confirm_oldbf_meta);

        //旧 福利 取消
        ItemStack cancel_oldbf_item = new ItemStack(Material.BARRIER);
        ItemMeta cancel_oldbf_meta = cancel_oldbf_item.getItemMeta();
        Objects.requireNonNull(cancel_oldbf_meta).setDisplayName(ChatColor.RED + gui_no);
        cancel_oldbf_item.setItemMeta(cancel_oldbf_meta);

        //设置旧 福利 物品
        confirm_oldbf_Gui.setItem(3,confirm_oldbf_item);
        confirm_oldbf_Gui.setItem(5,cancel_oldbf_item);

        //打开旧 福利 物品栏
        player.openInventory(confirm_oldbf_Gui);
    }
    public static void confirm_newbf_gui(Player player){//新 福利 的确认GUI
        //新建物品栏（GUI）
        Inventory confirm_newbf_Gui = Bukkit.createInventory(player,9, ChatColor.AQUA+newbf_1);

        //新 福利 确认
        ItemStack confirm_newbf_item = new ItemStack(Material.EMERALD);
        ItemMeta confirm_newbf_meta = confirm_newbf_item.getItemMeta();
        Objects.requireNonNull(confirm_newbf_meta).setDisplayName(ChatColor.GREEN + gui_yes);
        confirm_newbf_item.setItemMeta(confirm_newbf_meta);

        //新 福利 取消
        ItemStack cancel_newbf_item = new ItemStack(Material.BARRIER);
        ItemMeta cancel_newbf_meta = cancel_newbf_item.getItemMeta();
        Objects.requireNonNull(cancel_newbf_meta).setDisplayName(ChatColor.RED + gui_no);
        cancel_newbf_item.setItemMeta(cancel_newbf_meta);

        //设置新 福利 物品
        confirm_newbf_Gui.setItem(3,confirm_newbf_item);
        confirm_newbf_Gui.setItem(5,cancel_newbf_item);

        //打开新 福利 物品栏
        player.openInventory(confirm_newbf_Gui);
    }
}
