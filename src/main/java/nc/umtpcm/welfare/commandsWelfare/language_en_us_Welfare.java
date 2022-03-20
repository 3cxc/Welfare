package nc.umtpcm.welfare.commandsWelfare;

import nc.umtpcm.welfare.languagesWelfare.Application_Language;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import static nc.umtpcm.welfare.languagesWelfare.Application_Language.Application_language;
import static nc.umtpcm.welfare.statementWelfare.Language;

public class language_en_us_Welfare implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player){
            Player player = (Player) sender;
            Language = "en-us";
            Application_language();
            player.sendMessage(ChatColor.AQUA+"Set to English");
        }else {
            Language = "en-us";
            Application_language();
            System.out.println(ChatColor.AQUA+"Set to English");
        }

        return false;
    }
}
