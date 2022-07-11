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

public class Console {
    @SuppressWarnings("CharsetObjectCanBeUsed")
    public static void ConsoleUpdate(){
        new BukkitRunnable(){
            public void run(){
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
                    System.out.println("§c错误！无法检查更新！");
                }
                String latestVer = webver;
                if (!s.equals("ERROR")){
                    if (Objects.equals(version, webver)){
                        System.out.println("§b插件已是最新版本！");
                        System.gc();
                    }else{
                        System.out.println("§b发现了新版本：" + latestVer + " 请前往：" + github + " 获取最新版本！");
                        System.gc();
                    }
                }
            }
        }.runTaskAsynchronously(Welfare.getPlugin(Welfare.class));
    }
}
