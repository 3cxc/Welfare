package nc.umtpcm.welfare.Update;

import org.bukkit.ChatColor;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Objects;

import static nc.umtpcm.welfare.Update.GITHUB_AND_GITEE.UpdateUrls;
import static nc.umtpcm.welfare.tools.statementWelfare.*;

public class Player {
    public void run(){
        PlayerUpdate();
    }
    @SuppressWarnings("CharsetObjectCanBeUsed")
    public static void PlayerUpdate(){
        String webver = "";
        try {
            URL url = new URL(UpdateUrls);
            InputStream is = url.openStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is, "UTF-8"));
            webver = br.readLine();
        }catch (Exception e) {
            e.printStackTrace();
        }
        String latestVer = webver;
        if (Objects.equals(version, webver)){
            UpdatePlayer.sendMessage(ChatColor.AQUA + "插件已是最新版本！");
        }else{
            UpdatePlayer.sendMessage(ChatColor.AQUA + "发现了新版本：" + latestVer + " 请前往：" + github + " 获取最新版本！");
        }
    }
}
