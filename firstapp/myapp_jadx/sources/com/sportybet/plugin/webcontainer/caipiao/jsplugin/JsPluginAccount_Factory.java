package com.sportybet.plugin.webcontainer.caipiao.jsplugin;

import android.accounts.AccountManager;
import defpackage.fbh0;
import defpackage.l730;
import defpackage.uqm;
import defpackage.xxz;

/* JADX INFO: loaded from: classes5.dex */
public final class JsPluginAccount_Factory implements l730 {
    private final l730<uqm> accountHelperProvider;
    private final l730<AccountManager> accountManagerProvider;
    private final l730<xxz> patronApiServiceProvider;
    private final l730<fbh0> uiRouterManagerProvider;

    private JsPluginAccount_Factory(l730<uqm> l730Var, l730<AccountManager> l730Var2, l730<xxz> l730Var3, l730<fbh0> l730Var4) {
        this.accountHelperProvider = l730Var;
        this.accountManagerProvider = l730Var2;
        this.patronApiServiceProvider = l730Var3;
        this.uiRouterManagerProvider = l730Var4;
    }

    public static JsPluginAccount_Factory create(l730<uqm> l730Var, l730<AccountManager> l730Var2, l730<xxz> l730Var3, l730<fbh0> l730Var4) {
        return new JsPluginAccount_Factory(l730Var, l730Var2, l730Var3, l730Var4);
    }

    public static JsPluginAccount newInstance(uqm uqmVar, AccountManager accountManager, xxz xxzVar, fbh0 fbh0Var) {
        return new JsPluginAccount(uqmVar, accountManager, xxzVar, fbh0Var);
    }

    @Override // defpackage.m730
    public JsPluginAccount get() {
        return newInstance(this.accountHelperProvider.get(), this.accountManagerProvider.get(), this.patronApiServiceProvider.get(), this.uiRouterManagerProvider.get());
    }
}
