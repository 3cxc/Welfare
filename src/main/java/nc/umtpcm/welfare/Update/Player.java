package nc.umtpcm.welfare.Update;

import nc.umtpcm.welfare.tools.SslUtils;
import org.bukkit.ChatColor;
import org.bukkit.plugin.Plugin;
import org.bukkit.scheduler.BukkitRunnable;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Objects;

import static nc.umtpcm.welfare.Update.GITHUB_AND_GITEE.UpdateUrls;
import static nc.umtpcm.welfare.tools.statementWelfare.*;

public class Player {
    public void UpdatePlayer(org.bukkit.entity.Player player){
        new BukkitRunnable(){
            public void run(){
                PlayerUpdate(player);
            }
        }.runTaskAsynchronously((Plugin) this);
    }
    @SuppressWarnings("CharsetObjectCanBeUsed")
    public static void PlayerUpdate(org.bukkit.entity.Player player){
        String webver = "";
        try {
            URL url = new URL(UpdateUrls);
            if (config.getConfig().getBoolean("noSSL")){//是否开启忽略证书功能
                SslUtils.ignoreSsl();//忽略证书
            }
            InputStream is = url.openStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is, "UTF-8"));
            webver = br.readLine();
        }catch (Exception e) {
            e.printStackTrace();
        }
        String latestVer = webver;
        if (Objects.equals(version, webver)){
            player.sendMessage(ChatColor.AQUA + "插件已是最新版本！");
        }else{
            player.sendMessage(ChatColor.AQUA + "发现了新版本：" + latestVer + " 请前往：" + github + " 获取最新版本！");
        }
    }
}
