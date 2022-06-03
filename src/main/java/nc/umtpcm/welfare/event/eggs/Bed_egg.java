package nc.umtpcm.welfare.event.eggs;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedLeaveEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Objects;
import java.util.Random;

import static nc.umtpcm.welfare.tools.statementWelfare.config;

public class Bed_egg implements Listener {
    @EventHandler
    public void Bed_Egg(PlayerBedLeaveEvent event){
        if (config.getConfig().getBoolean("Egg")){
            Player player = event.getPlayer();
            int temp = 0;
            Random rd = new Random();
            for (int i=0;i<1;i++){
                temp = rd.nextInt(10000);
            }
            if (temp >= 4000){
                player.kickPlayer(ChatColor.GREEN+"恭喜你抽中了彩蛋，然后你 被 踢 了 ！ 惊不惊喜?意不意外？");
            }else if (temp < 1350){
                    player.sendMessage(ChatColor.GREEN + "你获得了彩蛋奖励哦~");
                    ItemStack Egg_item = new ItemStack(Material.NETHERITE_INGOT,1);
                    ItemMeta Egg_meta = Egg_item.getItemMeta();
                    Objects.requireNonNull(Egg_meta).setDisplayName(ChatColor.AQUA+"彩蛋奖励");
                    Egg_item.setItemMeta(Egg_meta);
                    player.getInventory().addItem(Egg_item);
            }else {
                player.sendMessage(ChatColor.GREEN + "你什么也没得到哦~");
            }
        }
    }
}
