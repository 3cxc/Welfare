package nc.umtpcm.welfare;

import nc.umtpcm.welfare.Update.GITHUB_AND_GITEE;
import nc.umtpcm.welfare.Update.MainUpdateWelfare;
import nc.umtpcm.welfare.command.*;
import nc.umtpcm.welfare.event.PlayerChatEvent;
import nc.umtpcm.welfare.event.eggs.Bed_egg;
import nc.umtpcm.welfare.gui.GuiGithub;
import nc.umtpcm.welfare.gui.Guibf;
import nc.umtpcm.welfare.gui.Guiver;
import nc.umtpcm.welfare.tools.statementWelfare;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.util.Objects;

import static java.lang.Thread.sleep;
import static nc.umtpcm.welfare.Update.CongetLatestVersions.CongetLatestVersion;
import static nc.umtpcm.welfare.tools.statementWelfare.WelfareDev;

//以下是该插件的开源许可证

//The following is the open source license for the plugin

// Licensed to the Apache Software Foundation (ASF) under one or more
// contributor license agreements.  See the NOTICE file distributed with
// this work for additional information regarding copyright ownership.
// The ASF licenses this file to You under the Apache License, Version 2.0
// (the "License"); you may not use this file except in compliance with
// the License.  You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
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
    @SuppressWarnings("PointlessBooleanExpression")
    public void onEnable() {
        //启动提示
        getLogger().info("插件已加载，作者:3cxc");
        getLogger().info("请确保您在使用的是开源的Welfare！未知来源的Welfare可能会破坏您的服务器！");
        getLogger().info("插件的Github地址：https://github.com/3cxc/Welfare");
        if (WelfareDev == 1){
            getLogger().info("警告：您目前正在使用内部版本！您应该知道您在做什么！");
            getLogger().info("警告：我们不会对内部版本提供支持！如果使用内部版本发生任何问题我们不会处理！");
            getLogger().info("警告！该插件已停止更新！请使用正式版本：11 否则后果自负！");
        }



        //加载配置文件
        getConfig().options().copyDefaults();
        saveDefaultConfig();

        GITHUB_AND_GITEE.GITHUB_AND_GITEE_NAIN();

        getServer().getPluginManager().registerEvents(new Guibf(),this);//福利
        getServer().getPluginManager().registerEvents(new GuiGithub(),this);//Github
        getServer().getPluginManager().registerEvents(new Guiver(),this);//查看版本
        getServer().getPluginManager().registerEvents(new PlayerChatEvent(),this);//屏蔽脏话
        getServer().getPluginManager().registerEvents(new Bed_egg(),this);//彩蛋
        Objects.requireNonNull(getCommand("welver")).setExecutor(new versionWelfare());//查看版本
        Objects.requireNonNull(getCommand("welgui")).setExecutor(new GuiOpen());//GUI
        Objects.requireNonNull(getCommand("welhelp")).setExecutor(new helpWelfare());//帮助
        Objects.requireNonNull(getCommand("welGithub")).setExecutor(new HubGit());//访问Github
        Objects.requireNonNull(getCommand("welbfn")).setExecutor(new bf());//福利
        Objects.requireNonNull(getCommand("welup")).setExecutor(new MainUpdateWelfare());//检查更新
        Objects.requireNonNull(getCommand("welreload")).setExecutor(new reload());//重载
        Objects.requireNonNull(getCommand("welrel")).setExecutor(new reload());//重载
        Objects.requireNonNull(getCommand("Welfare")).setExecutor(new welfare());//插件主命令

        //检查更新
        CongetLatestVersion();

        //定时检查更新,每隔30分钟检测一次
        if (WelfareDev == 0) {//检测是否为测试版本
            if (statementWelfare.config.getConfig().getBoolean("TimeUpdate") == true) {//检测定时检查更新是否开启
                try {
                    sleep(1800000);
                    CongetLatestVersion();
                } catch (Throwable ignored) {

                }
            } else {
                getLogger().info("自动检查更新已禁用！");
            }
        }

    }

    @Override
    public void onDisable() {
        getLogger().info("插件已卸载，作者:3cxc");
        if (WelfareDev == 1){
            getLogger().info("警告：您目前正在使用内部版本！您应该知道您在做什么！");
            getLogger().info("警告：我们不会对内部版本提供支持！如果使用内部版本发生任何问题我们不会处理！");
            getLogger().info("警告！该插件已停止更新！请使用正式版本：11 否则后果自负！");
        }
    }
}
