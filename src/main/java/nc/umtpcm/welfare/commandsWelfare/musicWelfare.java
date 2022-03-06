package nc.umtpcm.welfare.commandsWelfare;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class musicWelfare implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player){
            Player player = (Player) sender;
            player.sendMessage(ChatColor.BLUE + "音乐材质包地址，密码：BUGgugu");
            player.sendMessage(ChatColor.BLUE + "https://mc-iec.lanzouv.com/b02ou5tef");
        }else {
            System.out.println(ChatColor.RED + "只有玩家可以执行");
        }
        return false;
    }
}
