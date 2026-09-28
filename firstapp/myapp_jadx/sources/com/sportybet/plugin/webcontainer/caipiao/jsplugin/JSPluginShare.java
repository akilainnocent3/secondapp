package com.sportybet.plugin.webcontainer.caipiao.jsplugin;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.plugin.webcontainer.jsbridge.JsBridgeParams;
import com.sportybet.plugin.webcontainer.jsbridge.LDJSCallbackContext;
import com.sportybet.plugin.webcontainer.jsbridge.LDJSPlugin;
import com.sportybet.plugin.webcontainer.jsbridge.service.JSPluginService;
import defpackage.fbh0;
import defpackage.fdt;
import defpackage.hp0;
import defpackage.o7d;
import defpackage.wae;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/* JADX INFO: loaded from: classes7.dex */
public class JSPluginShare extends LDJSPlugin {
    private static final String PLUGIN_NAME = "share";
    private static final String SHARE = "share";
    private final fbh0 uiRouterManager;

    public JSPluginShare(fbh0 fbh0Var) {
        this.uiRouterManager = fbh0Var;
    }

    private String null2Empty(String str) {
        if (str == null) {
            return "";
        }
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return "";
        }
    }

    @Override // com.sportybet.plugin.webcontainer.jsbridge.LDJSPlugin
    public void addMappings(JSPluginService jSPluginService) {
        jSPluginService.addJsMapping("share", "share", "AFJsApi.share.share", true, true);
    }

    @Override // com.sportybet.plugin.webcontainer.jsbridge.LDJSPlugin
    public boolean execute(String str, JsBridgeParams jsBridgeParams, final LDJSCallbackContext lDJSCallbackContext) {
        if (!"share".equals(str)) {
            return super.execute(str, jsBridgeParams, lDJSCallbackContext);
        }
        if (lDJSCallbackContext != null) {
            fdt.a(hp0.A).b(new BroadcastReceiver() { // from class: com.sportybet.plugin.webcontainer.caipiao.jsplugin.JSPluginShare.1
                boolean called;

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    if (this.called) {
                        return;
                    }
                    this.called = true;
                    if (context != null) {
                        try {
                            fdt.a(context).d(this);
                        } catch (Exception unused) {
                        }
                    }
                    String stringExtra = intent.getStringExtra(AnalyticsParam.EVENT_PARAM_RESULT);
                    if (TextUtils.isEmpty(stringExtra)) {
                        return;
                    }
                    lDJSCallbackContext.success(stringExtra);
                }
            }, new IntentFilter("JSPluginShare"));
        }
        this.uiRouterManager.e(o7d.a(wae.SHARE) + "?imageUri" + null2Empty((String) jsBridgeParams.getParam("imageUri")) + "&linkUrl=" + null2Empty((String) jsBridgeParams.getParam("linkUrl")) + "&hideCopy=" + null2Empty((String) jsBridgeParams.getParam("hideCopy")) + "&quote=" + null2Empty((String) jsBridgeParams.getParam("quote")) + "&hashtag=" + null2Empty((String) jsBridgeParams.getParam("hashtag")) + "&type=" + null2Empty((String) jsBridgeParams.getParam("type")));
        return true;
    }

    @Override // com.sportybet.plugin.webcontainer.jsbridge.LDJSPlugin
    public String getName() {
        return "share";
    }
}
