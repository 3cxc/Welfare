package nc.umtpcm.welfare.commandsWelfare;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import static nc.umtpcm.welfare.statementWelfare.*;

public class versionWelfare implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;//输出信息
            player.sendMessage(ChatColor.BLUE + ver_1 + version);//Message可以防止某人刷信息到全服玩家的消息框
            player.sendMessage(ChatColor.AQUA + ver_2 + vercon);
        } else {
            System.out.println(ChatColor.BLUE + ver_1 + version);
            System.out.println(ChatColor.AQUA + ver_2 + vercon);
        }
        return false;
    }
}
