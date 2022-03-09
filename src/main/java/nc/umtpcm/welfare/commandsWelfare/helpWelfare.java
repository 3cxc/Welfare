package nc.umtpcm.welfare.commandsWelfare;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class helpWelfare implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player){
            Player player = (Player) sender;
            player.sendMessage(ChatColor.AQUA + "Welfare：命令帮助界面");
            player.sendMessage(ChatColor.AQUA + "welbfo：获得福利(旧版)" );
            player.sendMessage(ChatColor.AQUA + "welbfn：获得福利(新版)" );
            player.sendMessage(ChatColor.AQUA + "welver：检查插件版本");
            player.sendMessage(ChatColor.AQUA + "welgui：打开插件功能菜单");
            player.sendMessage(ChatColor.AQUA + "welmusic：获得音乐材质包");
            player.sendMessage(ChatColor.AQUA + "welhelp：获得命令帮助");
            player.sendMessage(ChatColor.AQUA + "wel404(welkill)：自杀(假的)");
            player.sendMessage(ChatColor.AQUA + "welGithub：访问Github");
            player.sendMessage(ChatColor.AQUA + "welup: 检查更新");
            player.sendMessage(ChatColor.RED + "注：部分命令可在功能菜单里运行");
        }else {
            System.out.println(ChatColor.AQUA + "Welfare 命令帮助界面");
            System.out.println(ChatColor.AQUA + "welbfo：获得福利(旧版)");
            System.out.println(ChatColor.AQUA + "welbfn：获得福利(新版)");
            System.out.println(ChatColor.AQUA + "welver：检查插件版本");
            System.out.println(ChatColor.AQUA + "welgui：打开插件功能菜单");
            System.out.println(ChatColor.AQUA + "welmusic：获得音乐材质包");
            System.out.println(ChatColor.AQUA + "welhelp：获得命令帮助");
            System.out.println(ChatColor.AQUA + "wel404(welkill)：自杀(假的)");
            System.out.println(ChatColor.AQUA + "welGithub：访问Github");
            System.out.println(ChatColor.AQUA + "welup: 检查更新");
            System.out.println(ChatColor.RED + "注：部分命令可在功能菜单里运行");
        }
        return false;
    }
}
