package com.sportybet.plugin.webcontainer.caipiao.jsplugin;

import android.content.Context;
import android.content.Intent;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.plugin.webcontainer.jsbridge.JsBridgeParams;
import com.sportybet.plugin.webcontainer.jsbridge.LDJSCallbackContext;
import com.sportybet.plugin.webcontainer.jsbridge.LDJSPlugin;
import com.sportybet.plugin.webcontainer.jsbridge.service.JSPluginService;
import com.sportybet.plugin.webcontainer.utils.Tools;
import com.twilio.voice.EventKeys;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class JsPluginIdentity extends LDJSPlugin {
    private static final String INTENT_VERIFY_END_BROADCAST = "verify_end_broadcast";
    private static final String PLUGIN_NAME = "Identity";
    private static final String VERIFY = "Verify";
    private final Context appContext;

    public JsPluginIdentity(Context context) {
        this.appContext = context;
    }

    @Override // com.sportybet.plugin.webcontainer.jsbridge.LDJSPlugin
    public void addMappings(JSPluginService jSPluginService) {
        jSPluginService.addJsMapping(PLUGIN_NAME, VERIFY, "AFJsApi.Identity.Verify", true, false);
    }

    @Override // com.sportybet.plugin.webcontainer.jsbridge.LDJSPlugin
    public boolean execute(String str, JsBridgeParams jsBridgeParams, LDJSCallbackContext lDJSCallbackContext) throws JSONException {
        if (!VERIFY.equals(str)) {
            new JSONObject().put(EventKeys.ERROR_CODE, 404);
            return true;
        }
        String str2 = (String) jsBridgeParams.getParam(AnalyticsParam.EVENT_PARAM_RESULT);
        Intent broadCast = Tools.getBroadCast(INTENT_VERIFY_END_BROADCAST);
        broadCast.putExtra("identity_verify", str2);
        this.appContext.sendBroadcast(broadCast);
        return true;
    }

    @Override // com.sportybet.plugin.webcontainer.jsbridge.LDJSPlugin
    public String getName() {
        return PLUGIN_NAME;
    }
}
