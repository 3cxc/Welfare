package nc.umtpcm.welfare.command;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import static nc.umtpcm.welfare.tools.statementWelfare.*;

@SuppressWarnings("PointlessBooleanExpression")
public class bf implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (config.getConfig().getBoolean("Enable") == true){
                player.sendMessage(ChatColor.BLUE + "你获得了福利");
                ItemStack bf_item = new ItemStack(Material.COAL_BLOCK,64);//给予福利 煤块 一组
                player.getInventory().addItem(bf_item);
            }else player.sendMessage(ChatColor.RED + "功能已禁用！");
        }else {
            System.out.println(ChatColor.RED + Player_Error);
        }
        return false;
    }
}
