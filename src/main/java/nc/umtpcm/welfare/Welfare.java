package nc.umtpcm.welfare;

import nc.umtpcm.welfare.Updates.MainUpdateWelfare;
import nc.umtpcm.welfare.commandsWelfare.*;
import nc.umtpcm.welfare.eventsWelfare.*;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

import static nc.umtpcm.welfare.Updates.CongetLatestVersions.CongetLatestVersion;
import static nc.umtpcm.welfare.languagesWelfare.Application_Language.Application_language;
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

    @Override
    public void onEnable() {
        //检查语言
        Application_language();
        //检查更新
        CongetLatestVersion();
        // 添加事件
        getServer().getPluginManager().registerEvents(new Guioldbf(),this);
        getServer().getPluginManager().registerEvents(new Guinewbf(),this);
        getServer().getPluginManager().registerEvents(new Guimusic(),this);
        getServer().getPluginManager().registerEvents(new Guikick(),this);
        getServer().getPluginManager().registerEvents(new GuiGithub(),this);
        getServer().getPluginManager().registerEvents(new Guiver(),this);
        //添加命令
        Objects.requireNonNull(getCommand("welbfo")).setExecutor(new oldbf());
        Objects.requireNonNull(getCommand("welver")).setExecutor(new versionWelfare());
        Objects.requireNonNull(getCommand("welgui")).setExecutor(new GuiOpen());
        Objects.requireNonNull(getCommand("welmusic")).setExecutor(new musicWelfare());
        Objects.requireNonNull(getCommand("welhelp")).setExecutor(new helpWelfare());
        Objects.requireNonNull(getCommand("wel404")).setExecutor(new kickWelfare());
        Objects.requireNonNull(getCommand("welkill")).setExecutor(new kickWelfare());
        Objects.requireNonNull(getCommand("welGithub")).setExecutor(new HubGit());
        Objects.requireNonNull(getCommand("welbfn")).setExecutor(new newbf());
        Objects.requireNonNull(getCommand("welup")).setExecutor(new MainUpdateWelfare());
        Objects.requireNonNull(getCommand("welus")).setExecutor(new language_en_us_Welfare());
        Objects.requireNonNull(getCommand("welcn")).setExecutor(new language_zh_cn_Welfare());
    }


    @Override
    public void onDisable() {
    }
}
