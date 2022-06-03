package nc.umtpcm.welfare.Update;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import static nc.umtpcm.welfare.Update.CongetLatestVersions.CongetLatestVersion;
import static nc.umtpcm.welfare.Update.PlayerLatestVersions.PlayergetLatestVersion;
import static nc.umtpcm.welfare.tools.statementWelfare.*;

public class MainUpdateWelfare implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player){
            UpdatePlayer = (Player) sender;
            Player player = (Player) sender;
            if (WelfareDev == 0){
                if (player.hasPermission("Welfare.admin.reload")){
                    PlayergetLatestVersion();
                }else player.sendMessage(ChatColor.RED + Welprefix + "您没有权限！");
            }else player.sendMessage(ChatColor.RED+ Welprefix +"错误：测试版本无法检查更新！");
        }else{
            if (WelfareDev == 0){
                CongetLatestVersion();
            }else System.out.println(ChatColor.RED+ Welprefix +"错误：测试版本无法检查更新！");
        }
        return false;
    }
}


