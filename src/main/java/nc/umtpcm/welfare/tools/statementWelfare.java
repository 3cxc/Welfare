package nc.umtpcm.welfare.tools;

import nc.umtpcm.welfare.Welfare;
import org.bukkit.plugin.Plugin;

import java.util.ArrayList;
import java.util.List;


public class statementWelfare {
    public static Plugin config = Welfare.getPlugin(Welfare.class);
    public static String version = config.getConfig().getString("Version");
    public static String vercon = "修复更新检查卡死的情况，删除部分彩蛋功能,增加异步线程,优化关于帮助的代码";
    public static String github = "https://github.com/3cxc/Welfare";
    public static int WelfareDev = 0;

    public static String Welprefix = "§6[Welfare]";//插件前缀

    public static List<String> HelpList = new ArrayList<>();
    public static void HelpList_Initialize(){
        HelpList.add("§bWelfare：命令帮助界面");
        HelpList.add("§bwelfare bf：获得福利(新版)");
        HelpList.add("§bwelfare version：检查插件版本");
        HelpList.add("§bwelfare open_gui：打开插件功能菜单");
        HelpList.add("§bwelfare help：获得命令帮助");
        HelpList.add("§bwelfare github：访问Github");
        HelpList.add("§bwelfare update：检查更新");
        HelpList.add("§bwelfare reload: 重载插件");
        HelpList.add("§c注：部分命令可在功能菜单里运行");
    }

    public static String Player_Error = "§c只有玩家可以执行";//错误

    }
