package nc.umtpcm.welfare.commandsWelfare;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import static nc.umtpcm.welfare.statementWelfare.vercon;
import static nc.umtpcm.welfare.statementWelfare.version;

public class versionWelfare implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;//输出信息
            player.sendMessage(ChatColor.BLUE + "Welfare 当前版本：" + version);//Message可以防止某人刷信息到全服玩家的消息框
            player.sendMessage(ChatColor.AQUA + "更新内容：" + vercon);
        } else {
            System.out.println(ChatColor.BLUE + "Welfare 当前版本：" + version);
            System.out.println(ChatColor.AQUA + "更新内容：" + vercon);
        }
        return false;
    }
}
