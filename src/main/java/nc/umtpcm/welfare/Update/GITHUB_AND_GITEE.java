package nc.umtpcm.welfare.Update;

import java.util.Objects;

import static nc.umtpcm.welfare.tools.statementWelfare.config;

public class GITHUB_AND_GITEE {
    public static String UpdateUrls = null;
    public static void GITHUB_AND_GITEE_NAIN(){
        if (Objects.equals(config.getConfig().getString("UpdateUrl"), "Github")){
            UpdateUrls = "https://raw.githubusercontent.com/3cxc/Welfare/master/version.txt";
            System.out.println("当前从Github检测更新,如果检测更新失败可尝试切换Gitee");
        }else if (Objects.equals(config.getConfig().getString("UpdateUrl"), "Gitee")){
            UpdateUrls = "https://gitee.com/VMOD3cxc/Welfarever/raw/master/version.txt";
            System.out.println("当前从Gitee检测更新,如果检测更新失败可尝试切换Github");
        }else{
            UpdateUrls = "https://raw.githubusercontent.com/3cxc/Welfare/master/version.txt";
            System.out.println("由于配置设置错误,将从Github检测更新,如果检测更新失败可尝试切换Gitee");
        }
    }
}
