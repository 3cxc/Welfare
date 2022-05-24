package nc.umtpcm.welfare.command;

import nc.umtpcm.welfare.Welfare;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class reload implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player){
            Player player = (Player) sender;
        if (player.hasPermission("Welfare.admin.reload")){
            try {
                Welfare.instant.reloadConfig();
                player.sendMessage(ChatColor.GREEN + "[Welfare]插件重载完成！");
            }catch (Throwable e){
                player.sendMessage(ChatColor.RED + "[Welfare]插件重载失败！具体原因请查看后台！");
                e.printStackTrace();
            }
        }else {

            player.sendMessage(ChatColor.RED+"[Welfare]您没有权限！");
        }
        }else
            try {

            Welfare.instant.reloadConfig();
            System.out.println("插件重载完成");

        }catch (Throwable e){
            System.out.println("插件重载失败！原因应该已经显示在后台！");
            e.printStackTrace();
        }
        return false;
    }
}
