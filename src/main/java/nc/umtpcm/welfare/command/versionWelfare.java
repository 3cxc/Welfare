package nc.umtpcm.welfare.command;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import static nc.umtpcm.welfare.tools.statementWelfare.*;

@SuppressWarnings("PointlessBooleanExpression")
public class versionWelfare implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;//输出信息
            if (config.getConfig().getBoolean("Enable") == true){
                player.sendMessage(ChatColor.BLUE + "Welfare 当前版本：" + version);//Message可以防止某人刷信息到全服玩家的消息框
                player.sendMessage(ChatColor.AQUA + "更新内容：" + vercon);
            }else player.sendMessage(ChatColor.RED + "功能已禁用！");
        } else {
            System.out.println(ChatColor.BLUE + "Welfare 当前版本：" + version);
            System.out.println(ChatColor.AQUA + "更新内容：" + vercon);
        }
        return false;
    }
}
