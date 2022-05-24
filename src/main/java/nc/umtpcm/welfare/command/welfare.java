package nc.umtpcm.welfare.command;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import static nc.umtpcm.welfare.tools.statementWelfare.version;


@SuppressWarnings("ConstantConditions")
public class welfare implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;
        if (sender instanceof Player){
            player.sendMessage(ChatColor.AQUA + "插件当前版本：" + version);
        }else {
            System.out.println(ChatColor.AQUA + "插件当前版本：" + version);
        }

        return false;
    }
}
