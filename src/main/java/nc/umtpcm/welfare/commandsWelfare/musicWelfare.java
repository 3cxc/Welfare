package nc.umtpcm.welfare.commandsWelfare;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import static nc.umtpcm.welfare.statementWelfare.Music_1;
import static nc.umtpcm.welfare.statementWelfare.Player_Error;

public class musicWelfare implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player){
            Player player = (Player) sender;
            player.sendMessage(ChatColor.BLUE + Music_1);
            player.sendMessage(ChatColor.BLUE + "https://mc-iec.lanzouv.com/b02ou5tef");
        }else {
            System.out.println(ChatColor.RED + Player_Error);
        }
        return false;
    }
}
