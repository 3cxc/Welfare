package nc.umtpcm.welfare.eventsWelfare;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import java.util.Objects;

public class Guimusic implements Listener {
    @EventHandler
    public void guimusic(InventoryClickEvent event) {
        if (event.getView().getTitle().equalsIgnoreCase(ChatColor.BLUE + "菜单"))//防止拿走了物品
            event.setCancelled(true);
        try {
            if (Objects.requireNonNull(event.getCurrentItem()).getType().equals(Material.JUKEBOX)) {
                if (event.getView().getTitle().equalsIgnoreCase(ChatColor.BLUE + "菜单")) {//进行判定是否有移动指定物品且是不是在名叫菜单的GUI里移动
                    Player player = (Player) event.getWhoClicked();
                    player.closeInventory();
                    player.sendMessage(ChatColor.BLUE + "音乐材质包地址，密码：BUGgugu");
                    player.sendMessage(ChatColor.BLUE + "https://mc-iec.lanzouv.com/b02ou5tef");
                }
            }
        } catch (NullPointerException ignored) {

        }
    }
}
