package nc.umtpcm.welfare.tools;

import nc.umtpcm.welfare.Welfare;
import org.bukkit.plugin.Plugin;


public class statementWelfare {
    public static Plugin config = Welfare.getPlugin(Welfare.class);
    public static String version = config.getConfig().getString("Version");
    public static String vercon = "增加一个新功能";
    public static String github = "https://github.com/3cxc/Welfare";
    public static int WelfareDev = 0;
    public static String Egg_Web = "https://gitee.com/VMOD3cxc/Welfarever/raw/master/Egg_Key.txt";

    public static String Welprefix = "§6[Welfare]";//插件前缀

    public static String help_1 = "§bWelfare：命令帮助界面";//Help
    public static String help_3 = "§bwelfare bf：获得福利(新版)";
    public static String help_4 = "§bwelfare version：检查插件版本";
    public static String help_5 = "§bwelfare open_gui：打开插件功能菜单";
    public static String help_7 = "§bwelfare help：获得命令帮助";
    public static String help_9 = "§bwelfare github：访问Github";
    public static String help_10 = "§bwelfare update：检查更新";
    public static String help_11 = "§bwelfare reload: 重载插件";
    public static String help_12 = "§bWelfare: 插件主命令";
    public static String help_13 = "§c注：部分命令可在功能菜单里运行";

    public static String Player_Error = "§c只有玩家可以执行";//错误

    }
