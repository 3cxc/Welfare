package nc.umtpcm.welfare.Update;

import nc.umtpcm.welfare.tools.SslUtils;
import org.bukkit.ChatColor;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

import static nc.umtpcm.welfare.tools.statementWelfare.*;

public class CongetLatestVersions {
    @SuppressWarnings("CharsetObjectCanBeUsed")
    public static String CongetLatestVersion() {
        try {
            URL Upurl = new URL("https://gitee.com/VMOD3cxc/Welfarever/raw/master/version");
            SslUtils.ignoreSsl();//信任所有证书
            InputStream is = Upurl.openStream();//打开更新站
            BufferedReader br= new BufferedReader (new InputStreamReader(is,"UTF-8"));//获取数据
            webver = Integer.parseInt(br.readLine());
        }catch (Exception e){//解决错误
            e.printStackTrace();
        }
        latestVer = webver;
            if (version == latestVer) {
                System.out.println(ChatColor.AQUA + "您使用的是最新版本！");
            } else if (version < latestVer) {
                System.out.println(ChatColor.AQUA + "发现了新版本：" + latestVer + " 请前往：" + github + " 获取最新版本！");
            }

        return String.valueOf(webver);
    }

}
