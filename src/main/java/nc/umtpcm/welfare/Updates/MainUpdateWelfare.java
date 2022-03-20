package nc.umtpcm.welfare.Updates;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import static nc.umtpcm.welfare.Updates.CongetLatestVersions.CongetLatestVersion;
import static nc.umtpcm.welfare.Updates.PlayerLatestVersions.PlayergetLatestVersion;
import static nc.umtpcm.welfare.statementWelfare.*;

public class MainUpdateWelfare implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player){
            UpdatePlayer = (Player) sender;
            if (WelfareDev == 0){
                PlayergetLatestVersion();
            }else UpdatePlayer.sendMessage(ChatColor.RED+ Welprefix +ConUp_0);
        }else{
            if (WelfareDev == 0){
                CongetLatestVersion();
            }else System.out.println(ChatColor.RED+ Welprefix +ConUp_0);
        }
        return false;
    }
}


