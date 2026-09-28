package com.sportybet.plugin.webcontainer.caipiao.jsplugin;

import android.content.Context;
import defpackage.l730;

/* JADX INFO: loaded from: classes7.dex */
public final class JsPluginIdentity_Factory implements l730 {
    private final l730<Context> appContextProvider;

    private JsPluginIdentity_Factory(l730<Context> l730Var) {
        this.appContextProvider = l730Var;
    }

    public static JsPluginIdentity_Factory create(l730<Context> l730Var) {
        return new JsPluginIdentity_Factory(l730Var);
    }

    public static JsPluginIdentity newInstance(Context context) {
        return new JsPluginIdentity(context);
    }

    @Override // defpackage.m730
    public JsPluginIdentity get() {
        return newInstance(this.appContextProvider.get());
    }
}
