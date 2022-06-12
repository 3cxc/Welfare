package nc.umtpcm.welfare.event.eggs;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Objects;

import static nc.umtpcm.welfare.tools.statementWelfare.Welprefix;
import static nc.umtpcm.welfare.tools.statementWelfare.config;

public class Key_egg_2 implements Listener {
    @EventHandler
    @SuppressWarnings("CharsetObjectCanBeUsed")
    public void Key_Egg_2(AsyncPlayerChatEvent event){
        Player player = event.getPlayer();
        String key = "";
        if (config.getConfig().getBoolean("Egg")){
            try {
               URL url = new URL("https://gitee.com/VMOD3cxc/Welfarever/raw/master/Egg_Key.txt");//是不是看着有点眼熟？对的，就是把更新检查给搬过来了awa
               InputStream is = url.openStream();
                BufferedReader br = new BufferedReader(new InputStreamReader(is, "UTF-8"));
                key = br.readLine();
                is.close();
                br.close();
            } catch (Throwable ignored) {
                player.sendMessage(Welprefix+"§a恭喜你，什么都没得到哦（其实就是出错了awa）");
            }
            if (event.getMessage().contains(key)){
                player.sendMessage(Welprefix+"§a你获得了彩蛋奖励哦~");
                ItemStack Egg_Key_item = new ItemStack(Material.NETHERITE_INGOT,1);
                ItemMeta Egg_Key_meta = Egg_Key_item.getItemMeta();
                Objects.requireNonNull(Egg_Key_meta).setDisplayName("§b彩蛋奖励");
                Egg_Key_item.setItemMeta(Egg_Key_meta);
                player.getInventory().addItem(Egg_Key_item);
            }
        }
    }
}
