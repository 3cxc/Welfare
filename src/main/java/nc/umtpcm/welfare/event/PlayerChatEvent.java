package nc.umtpcm.welfare.event;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import static nc.umtpcm.welfare.tools.statementWelfare.config;

@SuppressWarnings("PointlessBooleanExpression")
public class PlayerChatEvent implements Listener {//此功能处于早期测试阶段
    @EventHandler
    public void ChatEvent(AsyncPlayerChatEvent event){
        Player EventPlayer = event.getPlayer();
        String Message = event.getMessage();
        if (config.getConfig().getBoolean("WordsEnable") == true){//检测是否开启功能
            for (int i = 0 ; i < config.getConfig().getStringList("Words").size() ; i++){//遍历文件
                if (Message.contains(config.getConfig().getStringList("Words").get(i))){//遍历文件
                    event.setCancelled(true);//撤回信息
                    EventPlayer.sendMessage(ChatColor.RED + "您发送的信息存在非法字符，已撤回！");
                }
            }
        }else {
            for (int i = 0 ; i < config.getConfig().getStringList("Words").size() ; i++){//遍历文件
                if (Message.contains(config.getConfig().getStringList("Words").get(i))){//遍历文件
                    EventPlayer.sendMessage(ChatColor.GREEN + "算你走运，要不是功能没开启，你的信息早就被我撤回了-x-");
                }
            }
        }
    }
}
