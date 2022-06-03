package nc.umtpcm.welfare.command;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import static nc.umtpcm.welfare.tools.statementWelfare.*;

public class HubGit implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player){
            Player player = (Player) sender;
            if (config.getConfig().getBoolean("Enable")){
                player.sendMessage(ChatColor.AQUA + "想要告诉我们插件的问题？");//访问 Github
                player.sendMessage(ChatColor.AQUA + "访问下面的网址来给我们提出建议吧！");
                player.sendMessage(ChatColor.AQUA + github);
            }else player.sendMessage(ChatColor.RED + "功能已禁用！");
        }
        return false;
    }
}
