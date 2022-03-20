package nc.umtpcm.welfare.eventsWelfare;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import java.util.Objects;

import static nc.umtpcm.welfare.statementWelfare.*;

public class GuiGithub implements Listener {
    @EventHandler
    public void guiGithub(InventoryClickEvent event) {
        if (event.getView().getTitle().equalsIgnoreCase(ChatColor.BLUE + "菜单"))//防止拿走了物品
            event.setCancelled(true);
        try {
            if (Objects.requireNonNull(event.getCurrentItem()).getType().equals(Material.CRAFTING_TABLE)) {
                if (event.getView().getTitle().equalsIgnoreCase(ChatColor.BLUE + "菜单")) {//进行判定是否有移动指定物品且是不是在名叫菜单的GUI里移动
                    Player player = (Player) event.getWhoClicked();
                    player.closeInventory();
                    player.sendMessage(ChatColor.AQUA + Github_1);
                    player.sendMessage(ChatColor.AQUA + Github_2);
                    player.sendMessage(ChatColor.AQUA + github);
                }
            }
        } catch (NullPointerException ignored) {

        }
    }
}
