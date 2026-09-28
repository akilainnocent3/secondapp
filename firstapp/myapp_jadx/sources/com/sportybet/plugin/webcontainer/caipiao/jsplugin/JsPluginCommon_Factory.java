package com.sportybet.plugin.webcontainer.caipiao.jsplugin;

import android.content.Context;
import com.sporty.android.core.model.json.JsonSerializeService;
import defpackage.d0n;
import defpackage.eje0;
import defpackage.fbh0;
import defpackage.iym;
import defpackage.l730;
import defpackage.psm;

/* JADX INFO: loaded from: classes7.dex */
public final class JsPluginCommon_Factory implements l730 {
    private final l730<Context> appContextProvider;
    private final l730<psm> countryManagerProvider;
    private final l730<JsonSerializeService> jsonSerializeServiceProvider;
    private final l730<iym> openTelemetryLoggerProvider;
    private final l730<eje0> surveyVisibilityManagerProvider;
    private final l730<fbh0> uiRouterManagerProvider;
    private final l730<d0n> utilsProvider;

    private JsPluginCommon_Factory(l730<Context> l730Var, l730<eje0> l730Var2, l730<JsonSerializeService> l730Var3, l730<psm> l730Var4, l730<d0n> l730Var5, l730<fbh0> l730Var6, l730<iym> l730Var7) {
        this.appContextProvider = l730Var;
        this.surveyVisibilityManagerProvider = l730Var2;
        this.jsonSerializeServiceProvider = l730Var3;
        this.countryManagerProvider = l730Var4;
        this.utilsProvider = l730Var5;
        this.uiRouterManagerProvider = l730Var6;
        this.openTelemetryLoggerProvider = l730Var7;
    }

    public static JsPluginCommon_Factory create(l730<Context> l730Var, l730<eje0> l730Var2, l730<JsonSerializeService> l730Var3, l730<psm> l730Var4, l730<d0n> l730Var5, l730<fbh0> l730Var6, l730<iym> l730Var7) {
        return new JsPluginCommon_Factory(l730Var, l730Var2, l730Var3, l730Var4, l730Var5, l730Var6, l730Var7);
    }

    public static JsPluginCommon newInstance(Context context, eje0 eje0Var, JsonSerializeService jsonSerializeService, psm psmVar, d0n d0nVar, fbh0 fbh0Var, iym iymVar) {
        return new JsPluginCommon(context, eje0Var, jsonSerializeService, psmVar, d0nVar, fbh0Var, iymVar);
    }

    @Override // defpackage.m730
    public JsPluginCommon get() {
        return newInstance(this.appContextProvider.get(), this.surveyVisibilityManagerProvider.get(), this.jsonSerializeServiceProvider.get(), this.countryManagerProvider.get(), this.utilsProvider.get(), this.uiRouterManagerProvider.get(), this.openTelemetryLoggerProvider.get());
    }
}
