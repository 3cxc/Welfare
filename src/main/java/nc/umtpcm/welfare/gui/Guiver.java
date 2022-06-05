package nc.umtpcm.welfare.gui;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import java.util.Objects;

import static nc.umtpcm.welfare.tools.statementWelfare.*;

public class Guiver implements Listener {
    @EventHandler
    public void guiver(InventoryClickEvent event) {
        if (event.getView().getTitle().equalsIgnoreCase(ChatColor.BLUE + "菜单"))//防止拿走了物品
            event.setCancelled(true);
        try {
            if (Objects.requireNonNull(event.getCurrentItem()).getType().equals(Material.ENDER_CHEST)) {
                if (event.getView().getTitle().equalsIgnoreCase(ChatColor.BLUE + "菜单")) {//进行判定是否有移动指定物品且是不是在名叫菜单的GUI里移动
                    Player player = (Player) event.getWhoClicked();
                    player.closeInventory();
                    player.sendMessage(ChatColor.BLUE + "Welfare 当前版本：" + version);//Message可以防止某人刷信息到全服玩家的消息框
                    player.sendMessage(ChatColor.AQUA + "更新内容：" +vercon);
                }
            }
        } catch (NullPointerException ignored) {

        }
    }
}
