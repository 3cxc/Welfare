package nc.umtpcm.welfare.Update;

import nc.umtpcm.welfare.Logger.logger;
import nc.umtpcm.welfare.Welfare;
import nc.umtpcm.welfare.tools.SslUtils;
import org.bukkit.scheduler.BukkitRunnable;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

import static nc.umtpcm.welfare.Update.GITHUB_AND_GITEE.UpdateUrls;
import static nc.umtpcm.welfare.tools.statementWelfare.*;

public class Player {
    @SuppressWarnings("CharsetObjectCanBeUsed")
    public static void PlayerUpdate(org.bukkit.entity.Player player){
        new BukkitRunnable(){
            public void run() {
                String webver = "";
                String s = "";
                try {
                    URL url = new URL(UpdateUrls);
                    if (config.getConfig().getBoolean("noSSL")){//是否开启忽略证书功能
                        SslUtils.ignoreSsl();//忽略证书
                    }
                    InputStream is = url.openStream();
                    BufferedReader br = new BufferedReader(new InputStreamReader(is, "UTF-8"));
                    webver = br.readLine();
                    is.close();
                    br.close();
                }catch (Throwable e) {
                    e.printStackTrace();
                    s = "ERROR";
                    LocalTime time = LocalTime.now();
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
                    new logger().Log_error(time.format(formatter)+"检查更新失败");
                    player.sendMessage("§c错误！无法检查更新！");
                }
                if (!s.equals("ERROR")){
                    if (Objects.equals(version, webver)){
                        player.sendMessage("§b插件已是最新版本！");
                    }else{
                        player.sendMessage("§b发现了新版本：" + webver + " 请前往：" + github + " 获取最新版本！");
                    }
                }
            }
        }.runTaskAsynchronously(Welfare.getPlugin(Welfare.class));
    }
}
