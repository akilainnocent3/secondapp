package com.sportybet.plugin.webcontainer.jsbridge;

import android.webkit.WebView;
import com.sportybet.plugin.webcontainer.jsbridge.service.JSPluginService;

/* JADX INFO: loaded from: classes7.dex */
public abstract class LDJSPlugin {
    public WebView webView;

    public abstract void addMappings(JSPluginService jSPluginService);

    public boolean execute(String str, JsBridgeParams jsBridgeParams, LDJSCallbackContext lDJSCallbackContext) {
        return false;
    }

    public abstract String getName();

    public void pluginInitialize() {
    }

    public final void privateInitialize(WebView webView) {
        this.webView = webView;
        pluginInitialize();
    }
}
