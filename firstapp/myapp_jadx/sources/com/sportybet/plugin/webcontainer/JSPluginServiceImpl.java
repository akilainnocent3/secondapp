package com.sportybet.plugin.webcontainer;

import com.sportybet.plugin.webcontainer.jsbridge.LDJSPlugin;
import com.sportybet.plugin.webcontainer.jsbridge.service.JSPluginService;
import defpackage.hxa;
import defpackage.uf80;
import defpackage.ux5;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public class JSPluginServiceImpl implements JSPluginService {
    HashMap<String, LDJSPlugin> plugins = new HashMap<>();
    List<String> mappBuildStrings = new ArrayList(10);

    public JSPluginServiceImpl(Set<LDJSPlugin> set) {
        for (LDJSPlugin lDJSPlugin : set) {
            this.plugins.put(lDJSPlugin.getName(), lDJSPlugin);
            lDJSPlugin.addMappings(this);
        }
    }

    public static String makeMappingParam(String str, String str2, String str3, boolean z, boolean z2) {
        String str4;
        if (z && z2) {
            str4 = "e,t";
        } else {
            str4 = z ? "e" : "";
        }
        String strConcat = str4.length() > 0 ? ",".concat(str4) : str4;
        StringBuilder sbA = ux5.a("mapp.build(\"", str3, "\", { android : function (", str4, ") {  mapp.invoke(\"");
        hxa.c(sbA, str, "\", \"", str2, "\"");
        return uf80.a(sbA, strConcat, ")}})");
    }

    private static String mockJs() {
        return "mapp.build(\"mapp.ui.setActionButton\", {iOS: function(e, t) {typeof e != \"object\" && (e = {   title: e});var n = mapp.callback(t, !1, !0);e.callback = n,mapp.invoke(\"nav\", \"setActionButton\", e)},android: function(e, t) {var n = mapp.callback(t);e.hidden && (e.title = \"\"),e.callback = n, mapp.invoke(\"nav\", \"setActionButton\", e)},support: {   iOS: \"1.0\",  android: \"1.0\"}})";
    }

    @Override // com.sportybet.plugin.webcontainer.jsbridge.service.JSPluginService
    public void addJsMapping(String str, String str2, String str3, boolean z, boolean z2) {
        this.mappBuildStrings.add(makeMappingParam(str, str2, str3, z, z2));
    }

    @Override // com.sportybet.plugin.webcontainer.jsbridge.service.JSPluginService
    public HashMap<String, LDJSPlugin> getJSPlugins() {
        return this.plugins;
    }

    @Override // com.sportybet.plugin.webcontainer.jsbridge.service.JSPluginService
    public List<String> getMappBuildStrings() {
        return this.mappBuildStrings;
    }

    @Override // com.sportybet.plugin.webcontainer.jsbridge.service.JSPluginService
    public void addJsMapping(String str) {
        this.mappBuildStrings.add(str);
    }
}
