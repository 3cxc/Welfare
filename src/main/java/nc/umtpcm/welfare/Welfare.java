package nc.umtpcm.welfare;

import nc.umtpcm.welfare.Update.Console;
import nc.umtpcm.welfare.Update.GITHUB_AND_GITEE;
import nc.umtpcm.welfare.command.Main_command;
import nc.umtpcm.welfare.event.PlayerChatEvent;
import nc.umtpcm.welfare.event.eggs.AllPlayerChat_egg;
import nc.umtpcm.welfare.event.eggs.Bed_egg;
import nc.umtpcm.welfare.gui.GuiGithub;
import nc.umtpcm.welfare.gui.Guibf;
import nc.umtpcm.welfare.gui.Guiver;
import nc.umtpcm.welfare.tools.statementWelfare;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.util.Objects;

import static nc.umtpcm.welfare.tools.statementWelfare.HelpList_Initialize;
import static nc.umtpcm.welfare.tools.statementWelfare.WelfareDev;


//以下是该插件的开源许可证

//The following is the open source license for the plugin

// Licensed to the Apache Software Foundation (ASF) under one or more
// contributor license agreements.  See the NOTICE file distributed with
// this work for additional information regarding copyright ownership.
// The ASF licenses this file to You under the Apache License, Version 2.0
// (the "License"); you may not use this file except in compliance with
// the License.  You may obtain a copy of the License at

//     http://www.apache.org/licenses/LICENSE-2.0

// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.


public final class Welfare extends JavaPlugin {

    public File config;

    public static Welfare instant;
    public Welfare() {
        this.config = new File(getDataFolder() + File.separator + "config.yml");
        instant = this;
    }

    @Override
    public void onEnable() {
        //启动提示
        getLogger().info("§a插件已加载，作者:3cxc");
        getLogger().info("§c请确保您在使用的是开源的Welfare！未知来源的Welfare可能会破坏您的服务器！");
        getLogger().info("§b插件的Github地址：https://github.com/3cxc/Welfare");
        if (WelfareDev == 1){
            getLogger().info("§c警告：您目前正在使用不稳定的测试版本！您应该知道您在做什么！");
        }

        //加载配置文件及设置
        getConfig().options().copyDefaults();
        saveDefaultConfig();
        HelpList_Initialize();

        GITHUB_AND_GITEE.GITHUB_AND_GITEE_NAIN();

        getServer().getPluginManager().registerEvents(new Guibf(),this);//福利/
        getServer().getPluginManager().registerEvents(new GuiGithub(),this);//Github
        getServer().getPluginManager().registerEvents(new Guiver(),this);//查看版本
        getServer().getPluginManager().registerEvents(new PlayerChatEvent(),this);//屏蔽脏话
        getServer().getPluginManager().registerEvents(new Bed_egg(),this);//彩蛋01
        getServer().getPluginManager().registerEvents(new AllPlayerChat_egg(),this);//彩蛋02
        Objects.requireNonNull(getCommand("Welfare")).setExecutor(new Main_command());//插件主命令
        Objects.requireNonNull(getCommand("Welfare")).setTabCompleter(new Main_command());

        //检查更新
        if (WelfareDev == 0){
            Console.ConsoleUpdate();
        }
    }

    @Override
    public void onDisable() {
        getLogger().info("§a插件已卸载，作者:3cxc");
        if (WelfareDev == 1){
            getLogger().info("§c警告：您目前正在使用不稳定的测试版本！您应该知道您在做什么！");
        }
    }
}
