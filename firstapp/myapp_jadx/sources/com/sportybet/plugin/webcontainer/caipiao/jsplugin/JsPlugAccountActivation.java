package com.sportybet.plugin.webcontainer.caipiao.jsplugin;

import android.text.TextUtils;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.account.AccountActivationData;
import com.sporty.android.core.model.account.ReactivateResult;
import com.sportybet.plugin.webcontainer.jsbridge.JsBridgeParams;
import com.sportybet.plugin.webcontainer.jsbridge.LDJSCallbackContext;
import com.sportybet.plugin.webcontainer.jsbridge.LDJSPlugin;
import com.sportybet.plugin.webcontainer.jsbridge.service.JSPluginService;
import com.sportybet.plugin.webcontainer.utils.WebViewActivityUtils;
import com.twilio.voice.EventKeys;
import defpackage.itf0;
import defpackage.psm;
import defpackage.uqm;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class JsPlugAccountActivation extends LDJSPlugin {
    private static final String DEACTIVATE_SELECT = "deactivateSelect";
    private static final String PLUGIN_NAME = "accountActivation";
    private static final String REACTIVATE_RESULT = "reactivateResult";
    private static final String REACTIVATE_SELECT = "reactivateSelect";
    private final uqm accountHelper;
    private final psm countryManager;

    public JsPlugAccountActivation(psm psmVar, uqm uqmVar) {
        this.countryManager = psmVar;
        this.accountHelper = uqmVar;
    }

    @Override // com.sportybet.plugin.webcontainer.jsbridge.LDJSPlugin
    public void addMappings(JSPluginService jSPluginService) {
        jSPluginService.addJsMapping(PLUGIN_NAME, DEACTIVATE_SELECT, "AFJsApi.account.deactivate_select", true, true);
        jSPluginService.addJsMapping(PLUGIN_NAME, REACTIVATE_SELECT, "AFJsApi.account.reactivate_select", true, true);
        jSPluginService.addJsMapping(PLUGIN_NAME, REACTIVATE_RESULT, "AFJsApi.account.reactivate_result", true, true);
    }

    @Override // com.sportybet.plugin.webcontainer.jsbridge.LDJSPlugin
    public boolean execute(String str, JsBridgeParams jsBridgeParams, LDJSCallbackContext lDJSCallbackContext) {
        AccountActivationData accountActivationDataCreate;
        JSONObject jSONObjectOptJSONObject;
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_JAVA_SCRIPT);
        aVar.a("class: %s, realMethod: %s", getClass().getSimpleName(), str);
        switch (String.valueOf(str)) {
            case "reactivateResult":
                AccountActivationData accountActivationDataCreate2 = AccountActivationData.INSTANCE.create("REACTIVATE_RESET_PASSWORD_DONE", this.countryManager.P());
                Object param = jsBridgeParams.getParam("response");
                if (param != null && !TextUtils.equals("null", param.toString())) {
                    JSONObject jSONObject = (JSONObject) param;
                    int iOptInt = jSONObject.optInt("bizCode", -1);
                    ReactivateResult reactivateResultCreate = ReactivateResult.INSTANCE.create(iOptInt, Integer.valueOf(this.accountHelper.getUserCertStatus()));
                    reactivateResultCreate.setMessage(jSONObject.optString(EventKeys.ERROR_MESSAGE, ""));
                    if (10000 == iOptInt && (jSONObjectOptJSONObject = jSONObject.optJSONObject("data")) != null) {
                        reactivateResultCreate.setAccessToken(jSONObjectOptJSONObject.optString("accessToken", ""));
                        reactivateResultCreate.setRefreshToken(jSONObjectOptJSONObject.optString("refreshToken", ""));
                        reactivateResultCreate.setUserId(jSONObjectOptJSONObject.optString("userId", ""));
                        if (jSONObjectOptJSONObject.has("userCert")) {
                            reactivateResultCreate.setUserCert(Integer.valueOf(jSONObjectOptJSONObject.getInt("userCert")));
                        }
                    }
                    accountActivationDataCreate2.setReactivateResult(reactivateResultCreate);
                }
                accountActivationDataCreate = accountActivationDataCreate2;
                break;
            case "reactivateSelect":
                accountActivationDataCreate = AccountActivationData.INSTANCE.create("REACTIVATE_SELECT_DONE", this.countryManager.P());
                Object param2 = jsBridgeParams.getParam("phone");
                if (param2 != null) {
                    accountActivationDataCreate.setPhoneNumber((String) param2);
                    break;
                }
                break;
            case "deactivateSelect":
                accountActivationDataCreate = AccountActivationData.INSTANCE.create("DEACTIVATE_SELECT_DONE", this.countryManager.P());
                Object param3 = jsBridgeParams.getParam("phone");
                if (param3 != null) {
                    accountActivationDataCreate.setPhoneNumber((String) param3);
                }
                Object param4 = jsBridgeParams.getParam("reasonId");
                if (param4 != null) {
                    accountActivationDataCreate.setReasonId((String) param4);
                    break;
                }
                break;
            default:
                return super.execute(str, jsBridgeParams, lDJSCallbackContext);
        }
        WebViewActivityUtils.onAccountActivationResult(accountActivationDataCreate);
        return true;
    }

    @Override // com.sportybet.plugin.webcontainer.jsbridge.LDJSPlugin
    public String getName() {
        return PLUGIN_NAME;
    }
}
