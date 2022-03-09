package nc.umtpcm.welfare;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.scheduler.BukkitRunnable;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

import static nc.umtpcm.welfare.statementWelfare.*;
public class MainUpdateWelfare implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        getLatestVersion();
        //updateCheck();
        return false;
    }
    public String getLatestVersion(){
        try {
            URL Upurl = new URL("https://raw.githubusercontent.com/3cxc/Welfare/master/verison");
            InputStream is = Upurl.openStream();
            BufferedReader br= new BufferedReader (new InputStreamReader(is,"UTF-8"));
            webver = Double.parseDouble(br.readLine());
        }catch (Exception e){
            e.printStackTrace();
        }
        latestVer = webver;
        if (version < latestVer) {
            System.out.println(ChatColor.RED + "发现了更新！请前往 " + github + " 获取最新版本！");
        } else if (version == latestVer) {
            System.out.println(ChatColor.RED + "您使用的是最新版本！");
        } else if (version > latestVer) {
            int i = 1;
            //noinspection ConstantConditions
            while (i == 60) {
                ++i;
            }
            System.out.println(ChatColor.RED + "错误,获取的版本信息异常或超时！更新检查失败！");
        }
        return String.valueOf(webver);
    }
}


