package nc.umtpcm.welfare.command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;

import static nc.umtpcm.welfare.command.Data_command.*;
import static nc.umtpcm.welfare.tools.statementWelfare.Player_Error;
import static nc.umtpcm.welfare.tools.statementWelfare.Welprefix;

public final class Main_command implements CommandExecutor,TabExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
            Player player = (Player) sender;
            if (args.length == 0){
                sender.sendMessage("输入/welfare help查看可用命令");
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
                    }else System.out.println(Player_Error);
                    break;

                case "version":
                    if (sender != null){
                        VersionInfoPlayer(player);
                    }else VersionInfoConsole();
                    break;

                case "open_gui":
                    if (sender != null){
                        OpenGui(player);
                    }else System.out.println(Player_Error);
                    break;

                case "github":
                    if (sender != null){
                        OpenGithubPlayer(player);
                    }else OpenGithubConsole();


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
                    sendMessage(sender, "§c未知的子命令！");
            }
        return true;
    }
    @Override
    public List<String> onTabComplete(CommandSender sender, Command cmd, String alias, String[] args) {
        if (args.length == 1){//当玩家开始输入命令时返回命令列表
            List<String> list = new ArrayList<>();
            list.add("help");
            list.add("bf");
            list.add("version");
            list.add("open_gui");
            list.add("github");
            list.add("reload");
            list.add("update");
            return list;
        }
        return null;
    }

    public static void sendMessage(CommandSender sender, String message) {
        sender.sendMessage(Welprefix + message);
    }
}
