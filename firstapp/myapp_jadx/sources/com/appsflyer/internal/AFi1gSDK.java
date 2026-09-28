package com.appsflyer.internal;

import com.appsflyer.internal.platform_extension.Plugin;
import com.appsflyer.internal.platform_extension.PluginInfo;
import defpackage.kpu;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class AFi1gSDK implements AFi1lSDK {
    private PluginInfo getMediationNetwork = new PluginInfo(Plugin.NATIVE, "6.17.3", null, 4, null);

    @Override // com.appsflyer.internal.AFi1lSDK
    public final Map<String, Object> AFAdRevenueData() {
        LinkedHashMap linkedHashMapG = kpu.g(new Pair("platform", this.getMediationNetwork.getPlugin().getPluginName()), new Pair("version", this.getMediationNetwork.getVersion()));
        if (!this.getMediationNetwork.getAdditionalParams().isEmpty()) {
            linkedHashMapG.put("extras", this.getMediationNetwork.getAdditionalParams());
        }
        return linkedHashMapG;
    }

    @Override // com.appsflyer.internal.AFi1lSDK
    public final void getMediationNetwork(PluginInfo pluginInfo) {
        pluginInfo.getClass();
        this.getMediationNetwork = pluginInfo;
    }
}
