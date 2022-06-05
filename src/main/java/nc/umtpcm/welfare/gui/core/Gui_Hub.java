package nc.umtpcm.welfare.gui.core;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.Objects;

import static nc.umtpcm.welfare.tools.statementWelfare.*;

public class Gui_Hub {
    public static void main_gui(Player player){
        //新建物品栏（GUI）
        Inventory guiHubWelfare = Bukkit.createInventory(player,9, ChatColor.BLUE+"菜单");
        //新建物品

        //福利
        ItemStack zgui_bf_item = new ItemStack(Material.COAL_BLOCK);
        ItemMeta zgui_bf_item_meta = zgui_bf_item.getItemMeta();
        Objects.requireNonNull(zgui_bf_item_meta).setDisplayName(ChatColor.BLUE+"免费福利");
        ArrayList<String> zgui_bf_item_lore = new ArrayList<>();
        zgui_bf_item_lore.add(ChatColor.AQUA+"点我获得免费福利");
        zgui_bf_item_lore.add(ChatColor.AQUA+"这些煤块应该足够你用了");
        zgui_bf_item_meta.setLore(zgui_bf_item_lore);
        zgui_bf_item.setItemMeta(zgui_bf_item_meta);


        //Github
        ItemStack zgui_Git_item = new ItemStack(Material.CRAFTING_TABLE);
        ItemMeta zgui_Git_item_meta = zgui_Git_item.getItemMeta();
        Objects.requireNonNull(zgui_Git_item_meta).setDisplayName(ChatColor.AQUA+"我们的GitHub");
        ArrayList<String> zgui_Git_item_lore = new ArrayList<>();
        zgui_Git_item_lore.add(ChatColor.AQUA+"想要告诉我们插件的问题？");
        zgui_Git_item_lore.add(ChatColor.AQUA+"访问下面的网址来给我们提出建议吧！");
        zgui_Git_item_meta.setLore(zgui_Git_item_lore);
        zgui_Git_item.setItemMeta(zgui_Git_item_meta);

        //版本
        ItemStack zgui_ver_item = new ItemStack(Material.ENDER_CHEST);
        ItemMeta zgui_ver_item_meta = zgui_ver_item.getItemMeta();
        Objects.requireNonNull(zgui_ver_item_meta).setDisplayName(ChatColor.AQUA+"插件版本");
        ArrayList<String> zgui_ver_item_lore = new ArrayList<>();
        zgui_ver_item_lore.add(ChatColor.AQUA+"插件当前版本："+version);
        zgui_ver_item_lore.add(ChatColor.AQUA+"点我查看更新日志");
        zgui_ver_item_meta.setLore(zgui_ver_item_lore);
        zgui_ver_item.setItemMeta(zgui_ver_item_meta);

        //

        //设置物品
        if (config.getConfig().getBoolean("Enable")){
            guiHubWelfare.setItem(0,zgui_bf_item);
            guiHubWelfare.setItem(1,zgui_Git_item);
            guiHubWelfare.setItem(2,zgui_ver_item);

            //打开物品栏
            player.openInventory(guiHubWelfare);
        }else player.sendMessage(ChatColor.RED + "功能已禁用！");
    }
    public static void confirm_bf_gui(Player player){//新 福利 的确认GUI
        //新建物品栏（GUI）
        Inventory confirm_bf_Gui = Bukkit.createInventory(player,9, ChatColor.AQUA+"你确认要得到煤块吗？");

        //确认
        ItemStack confirm_bf_item = new ItemStack(Material.EMERALD);
        ItemMeta confirm_bf_meta = confirm_bf_item.getItemMeta();
        Objects.requireNonNull(confirm_bf_meta).setDisplayName(ChatColor.GREEN + "确认");
        confirm_bf_item.setItemMeta(confirm_bf_meta);

        //取消
        ItemStack cancel_newbf_item = new ItemStack(Material.BARRIER);
        ItemMeta cancel_newbf_meta = cancel_newbf_item.getItemMeta();
        Objects.requireNonNull(cancel_newbf_meta).setDisplayName(ChatColor.RED + "取消");
        cancel_newbf_item.setItemMeta(cancel_newbf_meta);

        //设置物品
        confirm_bf_Gui.setItem(3,confirm_bf_item);
        confirm_bf_Gui.setItem(5,cancel_newbf_item);

        //打开物品栏
        player.openInventory(confirm_bf_Gui);
    }
}
