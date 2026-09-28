package com.sportybet.plugin.webcontainer.callback;

import android.content.Context;
import defpackage.d0n;
import defpackage.evp;
import defpackage.fbh0;
import defpackage.l730;
import defpackage.psm;
import defpackage.wsm;

/* JADX INFO: renamed from: com.sportybet.plugin.webcontainer.callback.LDWebViewClient_Factory, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C1459LDWebViewClient_Factory {
    private final l730<Context> contextProvider;
    private final l730<psm> countryManagerProvider;
    private final l730<wsm> crashlyticsHelperProvider;
    private final l730<fbh0> uiRouterManagerProvider;
    private final l730<d0n> utilsProvider;

    private C1459LDWebViewClient_Factory(l730<Context> l730Var, l730<psm> l730Var2, l730<d0n> l730Var3, l730<wsm> l730Var4, l730<fbh0> l730Var5) {
        this.contextProvider = l730Var;
        this.countryManagerProvider = l730Var2;
        this.utilsProvider = l730Var3;
        this.crashlyticsHelperProvider = l730Var4;
        this.uiRouterManagerProvider = l730Var5;
    }

    public static C1459LDWebViewClient_Factory create(l730<Context> l730Var, l730<psm> l730Var2, l730<d0n> l730Var3, l730<wsm> l730Var4, l730<fbh0> l730Var5) {
        return new C1459LDWebViewClient_Factory(l730Var, l730Var2, l730Var3, l730Var4, l730Var5);
    }

    public static LDWebViewClient newInstance(Context context, psm psmVar, d0n d0nVar, wsm wsmVar, fbh0 fbh0Var, evp evpVar) {
        return new LDWebViewClient(context, psmVar, d0nVar, wsmVar, fbh0Var, evpVar);
    }

    public LDWebViewClient get(evp evpVar) {
        return newInstance(this.contextProvider.get(), this.countryManagerProvider.get(), this.utilsProvider.get(), this.crashlyticsHelperProvider.get(), this.uiRouterManagerProvider.get(), evpVar);
    }
}
