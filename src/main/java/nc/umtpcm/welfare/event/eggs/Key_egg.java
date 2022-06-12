package nc.umtpcm.welfare.event.eggs;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import static nc.umtpcm.welfare.tools.statementWelfare.*;

public class Key_egg implements Listener {
    @EventHandler
    public void Key_Egg(AsyncPlayerChatEvent event){
        Player player = event.getPlayer();
        if (config.getConfig().getBoolean("Egg")){
            if (event.getMessage().contains("Egg_key")){
                if (config.getConfig().getBoolean("Egg_AdminKey")){
                    if (player.hasPermission("Welfare.admin")){
                        player.sendMessage(Welprefix+"§a彩蛋密钥网址是："+Egg_Web);
                    }player.sendMessage(Welprefix+"§a彩蛋密钥网址是："+"§ksoid"+Egg_Web);
                }else player.sendMessage(Welprefix+"§a彩蛋密钥网址是："+Egg_Web);
            }
        }
    }
}
