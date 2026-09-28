package com.sportybet.plugin.webcontainer.caipiao.jsplugin;

import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.account.RegistrationData;
import com.sportybet.android.account.RegistrationKYC$Result;
import com.sportybet.plugin.webcontainer.jsbridge.JsBridgeParams;
import com.sportybet.plugin.webcontainer.jsbridge.LDJSCallbackContext;
import com.sportybet.plugin.webcontainer.jsbridge.LDJSPlugin;
import com.sportybet.plugin.webcontainer.jsbridge.service.JSPluginService;
import com.sportybet.plugin.webcontainer.utils.WebViewActivityUtils;
import defpackage.itf0;

/* JADX INFO: loaded from: classes4.dex */
public class JsPlugRegistrationKYC extends LDJSPlugin {
    private static final String KYC_COMPLETED = "kycCollect";
    private static final String PLUGIN_NAME = "kyc";

    @Override // com.sportybet.plugin.webcontainer.jsbridge.LDJSPlugin
    public void addMappings(JSPluginService jSPluginService) {
        jSPluginService.addJsMapping(PLUGIN_NAME, KYC_COMPLETED, "AFJsApi.kyc_collect", true, true);
    }

    @Override // com.sportybet.plugin.webcontainer.jsbridge.LDJSPlugin
    public boolean execute(String str, JsBridgeParams jsBridgeParams, LDJSCallbackContext lDJSCallbackContext) {
        String str2;
        RegistrationData registrationData;
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_JAVA_SCRIPT);
        aVar.a("class: %s, realMethod: %s", getClass().getSimpleName(), str);
        if (!String.valueOf(str).equals(KYC_COMPLETED)) {
            return true;
        }
        aVar.q(MyLog.TAG_ACCOUNT);
        aVar.a("Registration KYC page result: %s", jsBridgeParams);
        if (jsBridgeParams != null) {
            str2 = (String) jsBridgeParams.getParam("source");
            registrationData = new RegistrationData();
            registrationData.accessToken = (String) jsBridgeParams.getParam("accessToken");
            registrationData.refreshToken = (String) jsBridgeParams.getParam("refreshToken");
            registrationData.userId = (String) jsBridgeParams.getParam("userId");
            registrationData.userCertStatus = getUserCertStatus(jsBridgeParams.getParam("userCertStatus"));
        } else {
            str2 = null;
            registrationData = null;
        }
        WebViewActivityUtils.onRegistrationKYCResult(new RegistrationKYC$Result(str2, true, registrationData));
        return true;
    }

    @Override // com.sportybet.plugin.webcontainer.jsbridge.LDJSPlugin
    public String getName() {
        return PLUGIN_NAME;
    }

    public int getUserCertStatus(Object obj) {
        try {
            return ((Integer) obj).intValue();
        } catch (Exception unused) {
            return 340;
        }
    }
}
