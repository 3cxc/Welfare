package nc.umtpcm.welfare.tools;

import nc.umtpcm.welfare.Welfare;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;


public class statementWelfare {
    public static Plugin config = Welfare.getPlugin(Welfare.class);
    public static String version = config.getConfig().getString("Version");
    public static String vercon = "现在更新是异步的了(不卡线程),命令调用重写,插件大改,版本号更改";
    public static String github = "https://github.com/3cxc/Welfare";
    public static Player UpdatePlayer = null;
    public static int WelfareDev = 0;

    public static String Welprefix = "[Welfare]";//插件前缀

    public static String help_1 = "Welfare：命令帮助界面";//Help
    public static String help_3 = "welbfn：获得福利(新版)";
    public static String help_4 = "welver：检查插件版本";
    public static String help_5 = "welgui：打开插件功能菜单";
    public static String help_7 = "welhelp：获得命令帮助";
    public static String help_9 = "welGithub：访问Github";
    public static String help_10 = "welup：检查更新";
    public static String help_11 = "welreload 或 welrel : 重载插件";
    public static String help_12 = "Welfare: 插件主命令";
    public static String help_13 = "注：部分命令可在功能菜单里运行";

    public static String Player_Error = "只有玩家可以执行";//错误




    }
