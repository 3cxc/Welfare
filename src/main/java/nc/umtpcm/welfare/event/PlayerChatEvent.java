package nc.umtpcm.welfare.event;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import static nc.umtpcm.welfare.tools.statementWelfare.config;

public class PlayerChatEvent implements Listener {//此功能处于早期测试阶段
    @EventHandler
    public void ChatEvent(AsyncPlayerChatEvent event){
        Player EventPlayer = event.getPlayer();
        String Message = event.getMessage();
        if (config.getConfig().getBoolean("WordsEnable")){//检测是否开启功能
            for (int i = 0 ; i < config.getConfig().getStringList("Words").size() ; i++){//遍历文件
                if (Message.contains(config.getConfig().getStringList("Words").get(i))){//遍历文件
                    if (EventPlayer.hasPermission("Welfare.admin.pass")){
                        EventPlayer.sendMessage("§a原来是管理员啊,不能撤回信息了-x-");
                    }else {
                        event.setCancelled(true);//撤回信息
                        EventPlayer.sendMessage("§c您发送的信息存在非法字符，已撤回！");
                    }
                }
            }
        }
    }
}
