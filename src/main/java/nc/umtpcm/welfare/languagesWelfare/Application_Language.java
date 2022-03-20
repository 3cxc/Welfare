package nc.umtpcm.welfare.languagesWelfare;

import static nc.umtpcm.welfare.languagesWelfare.en.language_en_us;
import static nc.umtpcm.welfare.languagesWelfare.zh.language_zh_cn;
import static nc.umtpcm.welfare.statementWelfare.Language;

public class Application_Language{
    public static String Application_language(){
        String zh_cn = "zh-cn";
        String en_us = "en-us";
        if (Language == zh_cn){
            language_zh_cn();//中文
        }else if (Language == en_us){
            language_en_us();//英文
        }
        return "false";
    }
}
