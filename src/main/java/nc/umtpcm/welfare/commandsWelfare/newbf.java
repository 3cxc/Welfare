package nc.umtpcm.welfare.commandsWelfare;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import static nc.umtpcm.welfare.statementWelfare.Player_Error;
import static nc.umtpcm.welfare.statementWelfare.oldbf_1;

public class newbf implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            player.sendMessage(ChatColor.BLUE + oldbf_1);
            ItemStack newbf_item = new ItemStack(Material.COAL_BLOCK,64);//给予福利 煤块 一组
            player.getInventory().addItem(newbf_item);
        }else {
            System.out.println(ChatColor.RED + Player_Error);
        }
        return false;
    }
}
