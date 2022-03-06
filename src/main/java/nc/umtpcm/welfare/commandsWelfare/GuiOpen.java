package nc.umtpcm.welfare.commandsWelfare;

import nc.umtpcm.welfare.GuiHubWelfare;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GuiOpen implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player =(Player) sender;
        GuiHubWelfare.main_gui(player);
        return false;
    }
}
