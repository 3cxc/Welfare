package nc.umtpcm.welfare.commandsWelfare;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import static nc.umtpcm.welfare.statementWelfare.*;

public class helpWelfare implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player){
            Player player = (Player) sender;
            player.sendMessage(ChatColor.AQUA + help_1);
            player.sendMessage(ChatColor.AQUA + help_2);
            player.sendMessage(ChatColor.AQUA + help_3);
            player.sendMessage(ChatColor.AQUA + help_4);
            player.sendMessage(ChatColor.AQUA + help_5);
            player.sendMessage(ChatColor.AQUA + help_6);
            player.sendMessage(ChatColor.AQUA + help_7);
            player.sendMessage(ChatColor.AQUA + help_8);
            player.sendMessage(ChatColor.AQUA + help_9);
            player.sendMessage(ChatColor.AQUA + help_10);
            System.out.println(ChatColor.AQUA + help_12);
            System.out.println(ChatColor.AQUA + help_13);
            player.sendMessage(ChatColor.RED + help_11);
        }else {
            System.out.println(ChatColor.AQUA + help_1);
            System.out.println(ChatColor.AQUA + help_2);
            System.out.println(ChatColor.AQUA + help_3);
            System.out.println(ChatColor.AQUA + help_4);
            System.out.println(ChatColor.AQUA + help_5);
            System.out.println(ChatColor.AQUA + help_6);
            System.out.println(ChatColor.AQUA + help_7);
            System.out.println(ChatColor.AQUA + help_8);
            System.out.println(ChatColor.AQUA + help_9);
            System.out.println(ChatColor.AQUA + help_10);
            System.out.println(ChatColor.AQUA + help_12);
            System.out.println(ChatColor.AQUA + help_13);
            System.out.println(ChatColor.RED + help_11);
        }
        return false;
    }
}
