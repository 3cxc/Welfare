package nc.umtpcm.welfare.command;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;
import org.bukkit.entity.Player;

import java.util.List;

import static nc.umtpcm.welfare.command.Data_command.*;
import static nc.umtpcm.welfare.tools.statementWelfare.Player_Error;
import static nc.umtpcm.welfare.tools.statementWelfare.Welprefix;

public final class Main_command implements TabExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
            Player player = (Player) sender;
            if (args.length == 0){
                return false;
            }
            switch (args[0].toLowerCase()){

                case "help":
                    if (sender != null){
                        PlayerHelplist(player);
                    }else ConsoleHelplist();
                    break;

                case "bf":
                    if (sender != null){
                        getbf(player);
                    }else System.out.println(ChatColor.RED + Player_Error);
                    break;

                case "version":
                    if (sender != null){
                        VersionInfoPlayer(player);
                    }else VersionInfoConsole();
                    break;

                case "open_gui":
                    if (sender != null){
                        OpenGui(player);
                    }else System.out.println(ChatColor.RED + Player_Error);
                    break;

                case "github":
                    if (sender != null){
                        OpenGithubPlayer(player);
                    }else OpenGithubConsole();
                    break;

                case "reload":
                    if (sender != null){
                        ReloadPlayer(player);
                    }else ReloadConsole();
                    break;

                case "update":
                    if (sender != null){
                        PlayerUpdate(player);
                    }else ConsoleUpdate();
                    break;
                default:
                    sendMessage(sender, "未知的子命令！");
            }
        return true;
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, Command cmd, String alias, String[] args) {
        return TabComplete.getCompleteList(args, TabComplete.getTabList(args, cmd.getName()));
    }

    public static void sendMessage(CommandSender sender, String message) {
        sender.sendMessage(Welprefix + message);
    }
}
