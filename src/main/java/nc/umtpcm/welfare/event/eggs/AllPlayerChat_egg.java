package nc.umtpcm.welfare.event.eggs;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import static nc.umtpcm.welfare.tools.statementWelfare.config;

public class AllPlayerChat_egg implements Listener {
    @EventHandler
    public void AllPlayer_Egg(AsyncPlayerChatEvent event){
        Player player = event.getPlayer();
        if (config.getConfig().getBoolean("WordsEnable")){
            if (event.getMessage().contains("2022")){
                player.sendMessage(ChatColor.GREEN+"2022,一起向未来！");
            }
        }
    }
}
