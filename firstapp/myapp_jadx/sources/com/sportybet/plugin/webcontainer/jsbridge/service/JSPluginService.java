package com.sportybet.plugin.webcontainer.jsbridge.service;

import com.sportybet.plugin.webcontainer.jsbridge.LDJSPlugin;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public interface JSPluginService {
    void addJsMapping(String str);

    void addJsMapping(String str, String str2, String str3, boolean z, boolean z2);

    HashMap<String, LDJSPlugin> getJSPlugins();

    List<String> getMappBuildStrings();
}
