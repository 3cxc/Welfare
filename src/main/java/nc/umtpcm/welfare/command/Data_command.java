package nc.umtpcm.welfare.command;

import nc.umtpcm.welfare.Update.Console;
import nc.umtpcm.welfare.Welfare;
import nc.umtpcm.welfare.gui.core.Gui_Hub;
import nc.umtpcm.welfare.tools.Reload_Data;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import static nc.umtpcm.welfare.tools.statementWelfare.*;

public class Data_command {//所有命令都在这里

    public static void getbf(Player player){//福利
        if (config.getConfig().getBoolean("Enable")){
            player.sendMessage("§9你获得了福利");
            ItemStack bf_item = new ItemStack(Material.COAL_BLOCK,64);//给予福利 煤块 一组
            player.getInventory().addItem(bf_item);
        }else player.sendMessage("§c功能已禁用！");
    }

    public static void OpenGui(Player player){//打开GUI
        if (config.getConfig().getBoolean("Enable")){
            try{
                Gui_Hub.main_gui(player);//打开GUI
            }catch (NullPointerException ignored){

            }
        }else player.sendMessage("§c功能已禁用！");
    }

    public static void ConsoleHelplist(){//瞎搞的分割 XD
        System.out.println(HelpList);
    }

    public static void PlayerHelplist(Player player){//瞎搞的分割 XD
        player.sendMessage(String.valueOf(HelpList));//玩家的帮助
    }

    public static void OpenGithubPlayer(Player player){//Github地址
        if (config.getConfig().getBoolean("Enable")){//检测功能是否开启
            player.sendMessage("§b想要告诉我们插件的问题？");//访问 Github
            player.sendMessage("§b访问下面的网址来给我们提出建议吧！");
            player.sendMessage("§b" + github);
        }else player.sendMessage(ChatColor.RED + "§c功能已禁用！");
    }

    public static void OpenGithubConsole(){//Github地址
        if (config.getConfig().getBoolean("Enable")){//检测功能是否开启
            System.out.println("§b想要告诉我们插件的问题？");//访问 Github
            System.out.println("§b访问下面的网址来给我们提出建议吧！");
            System.out.println("§b" + github);
        }else System.out.println("§c功能已禁用！");
    }

    public static void ReloadPlayer(Player player){//重载配置
        if (player.hasPermission("Welfare.admin.reload")){//检查是否有权限
            try {
                Welfare.instant.reloadConfig();//重载配置文件
                Reload_Data.Reload_Data_main();
                player.sendMessage(Welprefix+"§a插件重载完成！");
            }catch (Throwable e){
                player.sendMessage(Welprefix+"§c插件重载失败！");
                e.printStackTrace();
            }
        }else {
            player.sendMessage(Welprefix+"§c您没有权限！");
        }
    }

    public static void ReloadConsole(){//重载配置
        try {
            Welfare.instant.reloadConfig();//重载配置文件
            Reload_Data.Reload_Data_main();
            System.out.println("§a插件重载完成");

        }catch (Throwable e){
            System.out.println("§c插件重载失败！原因应该已经显示在后台！");
            e.printStackTrace();
        }
    }

    public static void VersionInfoPlayer(Player player){//版本号
        if (config.getConfig().getBoolean("Enable")){//检测功能是否开启
            player.sendMessage(ChatColor.BLUE + "§9Welfare 当前版本：" + version);
            player.sendMessage(ChatColor.AQUA + "§b更新内容：" + vercon);
        }else player.sendMessage(ChatColor.RED + "§c功能已禁用！");
    }

    public static void VersionInfoConsole(){//版本号
        System.out.println("§9Welfare 当前版本：" + version);
        System.out.println("§b更新内容：" + vercon);
    }

    public static void PlayerUpdate(Player player){//检测更新
        if (WelfareDev == 0){//检查是否是测试版本
            if (player.hasPermission("Welfare.admin.update")){//检查是否有权限
                nc.umtpcm.welfare.Update.Player.PlayerUpdate(player);
            }else player.sendMessage(ChatColor.RED + Welprefix + "§c您没有权限！");
        }else player.sendMessage(Welprefix +"§c错误：测试版本无法检查更新！");
    }

    public static void ConsoleUpdate(){//检测更新
        if (WelfareDev == 0){//检查是否是测试版本
            Console.ConsoleUpdate();
        }else System.out.println("§c错误：测试版本无法检查更新！");
    }
}
