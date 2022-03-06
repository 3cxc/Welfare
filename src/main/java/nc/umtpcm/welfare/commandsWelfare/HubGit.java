package nc.umtpcm.welfare.commandsWelfare;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HubGit implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player){
            Player player = (Player) sender;
            player.sendMessage(ChatColor.AQUA + "想要告诉我们插件的问题？");
            player.sendMessage(ChatColor.AQUA + "访问下面的网址来给我们提出建议吧！");
            player.sendMessage(ChatColor.AQUA + "https://github.com/3cxc/Welfare");
        }
        return false;
    }
}
