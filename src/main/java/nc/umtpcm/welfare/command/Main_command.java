package nc.umtpcm.welfare.command;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import static nc.umtpcm.welfare.command.Data_command.*;
import static nc.umtpcm.welfare.tools.statementWelfare.Player_Error;

public class Main_command implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
            Player player = (Player) sender;
            if (args.length == 0){
                return false;
            }
            switch (args[0].toLowerCase()){

                case "help":
                    if (sender != null){
                        PlayerHelplist(player);
                    }else ConsoleHelplist();

                case "bf":
                    if (sender != null){
                        getbf(player);
                    }else System.out.println(ChatColor.RED + Player_Error);

                case "version":
                    if (sender != null){
                        VersionInfoPlayer(player);
                    }else VersionInfoConsole();

                case "open_gui":
                    if (sender != null){
                        OpenGui(player);
                    }else System.out.println(ChatColor.RED + Player_Error);

                case "github":
                    if (sender != null){
                        OpenGithubPlayer(player);
                    }else OpenGithubConsole();

                case "reload":
                    if (sender != null){
                        ReloadPlayer(player);
                    }else ReloadConsole();

                case "update":
                    if (sender != null){
                        PlayerUpdate(player);
                    }else ConsoleUpdate();
            }

            if (sender != null){
                VersionInfoPlayer(player);
            }else VersionInfoConsole();
        return false;
    }
}
