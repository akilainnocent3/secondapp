package com.sportybet.plugin.webcontainer.caipiao.jsplugin;

import android.accounts.Account;
import android.accounts.AccountManager;
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
import defpackage.bi50;
import defpackage.bjb0;
import defpackage.fbh0;
import defpackage.fdt;
import defpackage.gv5;
import defpackage.hp0;
import defpackage.o7d;
import defpackage.su5;
import defpackage.uqm;
import defpackage.wae;
import defpackage.xxz;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class JsPluginAccount extends LDJSPlugin {
    private static final String LOGIN = "login";
    private static final String ON_COOKIE_FINISHED = "onCookieFinished";
    private static final String PLUGIN_NAME = "account";
    private final uqm accountHelper;
    private final AccountManager accountManager;
    private LDJSCallbackContext callbackContext;
    private BroadcastReceiver mReceiver;
    private final xxz patronApiService;
    private final fbh0 uiRouterManager;
    private WeakReference<LDJSCallbackContext> weakRef;

    public JsPluginAccount(uqm uqmVar, AccountManager accountManager, xxz xxzVar, fbh0 fbh0Var) {
        this.accountHelper = uqmVar;
        this.accountManager = accountManager;
        this.patronApiService = xxzVar;
        this.uiRouterManager = fbh0Var;
    }

    private void onLoginResult(JSONObject jSONObject) {
        LDJSCallbackContext lDJSCallbackContext = this.callbackContext;
        if (lDJSCallbackContext != null) {
            lDJSCallbackContext.success(jSONObject);
            this.callbackContext = null;
        }
    }

    @Override // com.sportybet.plugin.webcontainer.jsbridge.LDJSPlugin
    public void addMappings(JSPluginService jSPluginService) {
        jSPluginService.addJsMapping(PLUGIN_NAME, "login", "AFJsApi.account.login", true, true);
        jSPluginService.addJsMapping(PLUGIN_NAME, ON_COOKIE_FINISHED, "AFJsApi.account.onCookieFinished", true, false);
    }

    @Override // com.sportybet.plugin.webcontainer.jsbridge.LDJSPlugin
    public boolean execute(String str, JsBridgeParams jsBridgeParams, LDJSCallbackContext lDJSCallbackContext) {
        if ("login".equals(str)) {
            this.callbackContext = lDJSCallbackContext;
            if (this.mReceiver != null) {
                try {
                    fdt.a(hp0.A).d(this.mReceiver);
                } catch (Exception unused) {
                }
                this.mReceiver = null;
            }
            this.weakRef = null;
            if (lDJSCallbackContext != null) {
                this.weakRef = new WeakReference<>(lDJSCallbackContext);
                this.mReceiver = new BroadcastReceiver() { // from class: com.sportybet.plugin.webcontainer.caipiao.jsplugin.JsPluginAccount.1
                    boolean called;

                    @Override // android.content.BroadcastReceiver
                    public void onReceive(Context context, Intent intent) {
                        final LDJSCallbackContext lDJSCallbackContext2;
                        if (this.called) {
                            return;
                        }
                        this.called = true;
                        if (context != null) {
                            try {
                                fdt.a(context).d(this);
                            } catch (Exception unused2) {
                            }
                        }
                        if (JsPluginAccount.this.weakRef == null || (lDJSCallbackContext2 = (LDJSCallbackContext) JsPluginAccount.this.weakRef.get()) == null) {
                            return;
                        }
                        String lastAccessToken = JsPluginAccount.this.accountHelper.getLastAccessToken();
                        Account account = JsPluginAccount.this.accountHelper.getAccount();
                        JsPluginAccount.this.patronApiService.o1(bjb0.S("/m"), lastAccessToken, account != null ? JsPluginAccount.this.accountManager.getPassword(account) : null).G(new gv5<String>() { // from class: com.sportybet.plugin.webcontainer.caipiao.jsplugin.JsPluginAccount.1.1
                            @Override // defpackage.gv5
                            public void onFailure(su5<String> su5Var, Throwable th) {
                                lDJSCallbackContext2.success();
                            }

                            @Override // defpackage.gv5
                            public void onResponse(su5<String> su5Var, bi50<String> bi50Var) {
                                lDJSCallbackContext2.success();
                            }
                        });
                    }
                };
                fdt.a(hp0.A).b(this.mReceiver, new IntentFilter("JsPluginAccount"));
            }
            this.uiRouterManager.e(o7d.a(wae.LOGIN));
            return true;
        }
        if (!ON_COOKIE_FINISHED.equals(str)) {
            return super.execute(str, jsBridgeParams, lDJSCallbackContext);
        }
        String str2 = (String) jsBridgeParams.getParam(AnalyticsParam.EVENT_PARAM_RESULT);
        String str3 = (String) jsBridgeParams.getParam("userName");
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put(AnalyticsParam.EVENT_PARAM_RESULT, str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                jSONObject.put("userName", str3);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        onLoginResult(jSONObject);
        return true;
    }

    @Override // com.sportybet.plugin.webcontainer.jsbridge.LDJSPlugin
    public String getName() {
        return PLUGIN_NAME;
    }
}
