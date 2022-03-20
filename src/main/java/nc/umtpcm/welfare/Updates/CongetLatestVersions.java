package nc.umtpcm.welfare.Updates;

import org.bukkit.ChatColor;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

import static nc.umtpcm.welfare.statementWelfare.*;

public class CongetLatestVersions {
    public static String CongetLatestVersion(){
        try {
            URL Upurl = new URL("https://raw.githubusercontent.com/3cxc/Welfare/master/verison");
            SslUtils.ignoreSsl();//信任所有证书
            InputStream is = Upurl.openStream();//打开更新站
            BufferedReader br= new BufferedReader (new InputStreamReader(is,"UTF-8"));//获取数据
            webver = Double.parseDouble(br.readLine());
        }catch (Exception e){
            e.printStackTrace();
        }
        latestVer = webver;
        if (version < latestVer) {
            System.out.println(ChatColor.AQUA + ConUp_1_1 + latestVer + ConUp_1_3 + github + ConUp_1_2);
        } else if (version == latestVer) {
            System.out.println(ChatColor.AQUA + ConUp_2);
        } else if (version > latestVer) {
            System.out.println(ChatColor.RED + ConUp_3);
        }
        return String.valueOf(webver);
    }
}
