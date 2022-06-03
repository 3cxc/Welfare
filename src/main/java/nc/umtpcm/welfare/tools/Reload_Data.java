package nc.umtpcm.welfare.tools;

import nc.umtpcm.welfare.Update.GITHUB_AND_GITEE;
import nc.umtpcm.welfare.Welfare;

import static nc.umtpcm.welfare.tools.statementWelfare.*;

public class Reload_Data {
    public static void Reload_Data_main() {
        //重载一些变量
        version = config.getConfig().getInt("Version");
        config = Welfare.getPlugin(Welfare.class);
        //重载更新站设置
        GITHUB_AND_GITEE.GITHUB_AND_GITEE_NAIN();

        //重载更新变量，防止报错
        webver = 0;
        Pwebver = 0;
        latestVer = 0;
        PlatestVer = 0;
    }
}
