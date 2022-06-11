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
            player.sendMessage(ChatColor.BLUE + "你获得了福利");
            ItemStack bf_item = new ItemStack(Material.COAL_BLOCK,64);//给予福利 煤块 一组
            player.getInventory().addItem(bf_item);
        }else player.sendMessage(ChatColor.RED + "功能已禁用！");
    }

    public static void OpenGui(Player player){//打开GUI
        if (config.getConfig().getBoolean("Enable")){
            try{
                Gui_Hub.main_gui(player);//打开GUI
            }catch (NullPointerException ignored){

            }
        }else player.sendMessage(ChatColor.RED + "功能已禁用！");
    }

    public static void ConsoleHelplist(){//瞎搞的分割 XD
        System.out.println(ChatColor.AQUA + help_1);//控制台的帮助
        System.out.println(ChatColor.AQUA + help_3);
        System.out.println(ChatColor.AQUA + help_4);
        System.out.println(ChatColor.AQUA + help_5);
        System.out.println(ChatColor.AQUA + help_7);
        System.out.println(ChatColor.AQUA + help_9);
        System.out.println(ChatColor.AQUA + help_10);
        System.out.println(ChatColor.AQUA + help_11);
        System.out.println(ChatColor.AQUA + help_12);
        System.out.println(ChatColor.RED + help_13);
    }

    public static void PlayerHelplist(Player player){//瞎搞的分割 XD
        player.sendMessage(ChatColor.AQUA + help_1);//玩家的帮助
        player.sendMessage(ChatColor.AQUA + help_3);
        player.sendMessage(ChatColor.AQUA + help_4);
        player.sendMessage(ChatColor.AQUA + help_5);
        player.sendMessage(ChatColor.AQUA + help_7);
        player.sendMessage(ChatColor.AQUA + help_9);
        player.sendMessage(ChatColor.AQUA + help_10);
        player.sendMessage(ChatColor.AQUA + help_11);
        player.sendMessage(ChatColor.AQUA + help_12);
        player.sendMessage(ChatColor.RED + help_13);
    }

    public static void OpenGithubPlayer(Player player){//Github地址
        if (config.getConfig().getBoolean("Enable")){//检测功能是否开启
            player.sendMessage(ChatColor.AQUA + "想要告诉我们插件的问题？");//访问 Github
            player.sendMessage(ChatColor.AQUA + "访问下面的网址来给我们提出建议吧！");
            player.sendMessage(ChatColor.AQUA + github);
        }else player.sendMessage(ChatColor.RED + "功能已禁用！");
    }

    public static void OpenGithubConsole(){//Github地址
        if (config.getConfig().getBoolean("Enable")){//检测功能是否开启
            System.out.println(ChatColor.AQUA + "想要告诉我们插件的问题？");//访问 Github
            System.out.println(ChatColor.AQUA + "访问下面的网址来给我们提出建议吧！");
            System.out.println(ChatColor.AQUA + github);
        }else System.out.println();
    }

    public static void ReloadPlayer(Player player){//重载配置
        if (player.hasPermission("Welfare.admin.reload")){//检查是否有权限
            try {
                Welfare.instant.reloadConfig();//重载配置文件
                Reload_Data.Reload_Data_main();
                player.sendMessage(ChatColor.GREEN + "[Welfare]插件重载完成！");
            }catch (Throwable e){
                player.sendMessage(ChatColor.RED + "[Welfare]插件重载失败！");
                e.printStackTrace();
            }
        }else {
            player.sendMessage(ChatColor.RED+"[Welfare]您没有权限！");
        }
    }

    public static void ReloadConsole(){//重载配置
        try {
            Welfare.instant.reloadConfig();//重载配置文件
            Reload_Data.Reload_Data_main();
            System.out.println("插件重载完成");

        }catch (Throwable e){
            System.out.println("插件重载失败！原因应该已经显示在后台！");
            e.printStackTrace();
        }
    }

    public static void VersionInfoPlayer(Player player){//版本号
        if (config.getConfig().getBoolean("Enable")){//检测功能是否开启
            player.sendMessage(ChatColor.BLUE + "Welfare 当前版本：" + version);
            player.sendMessage(ChatColor.AQUA + "更新内容：" + vercon);
        }else player.sendMessage(ChatColor.RED + "功能已禁用！");
    }

    public static void VersionInfoConsole(){//版本号
        System.out.println(ChatColor.BLUE + "Welfare 当前版本：" + version);
        System.out.println(ChatColor.AQUA + "更新内容：" + vercon);
    }

    public static void PlayerUpdate(Player player){//检测更新
        if (WelfareDev == 0){//检查是否是测试版本
            if (player.hasPermission("Welfare.admin.update")){//检查是否有权限
                new nc.umtpcm.welfare.Update.Player().UpdatePlayer(player);
            }else player.sendMessage(ChatColor.RED + Welprefix + "您没有权限！");
        }else player.sendMessage(ChatColor.RED+ Welprefix +"错误：测试版本无法检查更新！");
    }

    public static void ConsoleUpdate(){//检测更新
        if (WelfareDev == 0){//检查是否是测试版本
            new Console().UpdateConsole();
        }else System.out.println(ChatColor.RED+ Welprefix +"错误：测试版本无法检查更新！");
    }
}
