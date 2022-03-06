package nc.umtpcm.welfare.eventsWelfare;

import nc.umtpcm.welfare.GuiHubWelfare;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

import java.util.Objects;

public class Guinewbf implements Listener {
    @EventHandler
    public void guinewbf(InventoryClickEvent event) {
        if (event.getView().getTitle().equalsIgnoreCase(ChatColor.BLUE + "菜单")){
            event.setCancelled(true);//防止拿走了物品
            try {
                if (Objects.requireNonNull(event.getCurrentItem()).getType().equals(Material.COAL_BLOCK)) {
                    if (event.getView().getTitle().equalsIgnoreCase(ChatColor.BLUE + "菜单")) {//进行判定是否有移动指定物品且是不是在名叫菜单的GUI里移动
                        Player player = (Player) event.getWhoClicked();//判断是否有点击
                        GuiHubWelfare.confirm_newbf_gui(player);//打开新 福利 确认菜单
                    }
                }
            } catch (NullPointerException ignored) {//防止Null报错

            }
        }else if (event.getView().getTitle().equalsIgnoreCase(ChatColor.AQUA+"你确认要得到煤块吗？")) {//新 福利 确认菜单
            event.setCancelled(true);
            try {
                Player player = (Player) event.getWhoClicked();
                if (Objects.requireNonNull(event.getCurrentItem()).getType().equals(Material.EMERALD)){//新 福利 确认
                    if (event.getView().getTitle().equalsIgnoreCase(ChatColor.AQUA+"你确认要得到煤块吗？")) {//进行判定是否有移动指定物品且是不是在名叫 你确认要得到煤块吗？的GUI里移动
                        player.closeInventory();//关闭物品栏(GUI)
                        player.sendMessage(ChatColor.BLUE + "你获得了福利");
                        ItemStack newbf_item = new ItemStack(Material.COAL_BLOCK,64);//给予福利 煤块 一组
                        player.getInventory().addItem(newbf_item);
                    }
                }else if (event.getCurrentItem().getType().equals(Material.BARRIER)){//新 福利 取消
                    if (event.getView().getTitle().equalsIgnoreCase(ChatColor.AQUA+"你确认要得到煤块吗？")){//进行判定是否有移动指定物品且是不是在名叫 你确认要得到煤块吗？的GUI里移动
                        GuiHubWelfare.main_gui(player);//返回到主菜单
                    }

                }
            }catch (NullPointerException ignored) {//防止Null报错

            }
        }


    }
}
