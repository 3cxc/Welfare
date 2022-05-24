package nc.umtpcm.welfare.command;

import nc.umtpcm.welfare.gui.Gui_Hub;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GuiOpen implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player =(Player) sender;
        try{
            Gui_Hub.main_gui(player);//打开GUI
        }catch (NullPointerException ignored){

        }
        return false;
    }
}
