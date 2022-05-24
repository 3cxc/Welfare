package nc.umtpcm.welfare.tools;

import static java.lang.Thread.sleep;
import static nc.umtpcm.welfare.Update.CongetLatestVersions.CongetLatestVersion;
import static nc.umtpcm.welfare.tools.statementWelfare.WelfareDev;


public class UpdateTime {
        public void run(){
            if (WelfareDev != 1){
                try {
                    sleep(1800000);
                    CongetLatestVersion();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
}
