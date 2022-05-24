package nc.umtpcm.welfare.command;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import static nc.umtpcm.welfare.tools.statementWelfare.*;

public class helpWelfare implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player){
            Player player = (Player) sender;
            player.sendMessage(ChatColor.AQUA + help_1);
            player.sendMessage(ChatColor.AQUA + help_3);
            player.sendMessage(ChatColor.AQUA + help_4);
            player.sendMessage(ChatColor.AQUA + help_5);
            player.sendMessage(ChatColor.AQUA + help_7);
            player.sendMessage(ChatColor.AQUA + help_9);
            player.sendMessage(ChatColor.AQUA + help_10);
            player.sendMessage(ChatColor.AQUA + help_11);
            player.sendMessage(ChatColor.AQUA + help_12);
            player.sendMessage(ChatColor.RED + help_13);
        }else {
            System.out.println(ChatColor.AQUA + help_1);
            System.out.println(ChatColor.AQUA + help_3);
            System.out.println(ChatColor.AQUA + help_4);
            System.out.println(ChatColor.AQUA + help_5);
            System.out.println(ChatColor.AQUA + help_7);
            System.out.println(ChatColor.AQUA + help_9);
            System.out.println(ChatColor.AQUA + help_10);
            System.out.println(ChatColor.AQUA + help_11);
            System.out.println(ChatColor.AQUA + help_12);
            System.out.println(ChatColor.RED + help_13);
        }
        return false;
    }
}
