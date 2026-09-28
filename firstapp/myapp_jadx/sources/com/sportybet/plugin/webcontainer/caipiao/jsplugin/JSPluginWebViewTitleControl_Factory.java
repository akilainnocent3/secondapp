package com.sportybet.plugin.webcontainer.caipiao.jsplugin;

import android.content.Context;
import defpackage.l730;

/* JADX INFO: loaded from: classes7.dex */
public final class JSPluginWebViewTitleControl_Factory implements l730 {
    private final l730<Context> contextProvider;

    private JSPluginWebViewTitleControl_Factory(l730<Context> l730Var) {
        this.contextProvider = l730Var;
    }

    public static JSPluginWebViewTitleControl_Factory create(l730<Context> l730Var) {
        return new JSPluginWebViewTitleControl_Factory(l730Var);
    }

    public static JSPluginWebViewTitleControl newInstance(Context context) {
        return new JSPluginWebViewTitleControl(context);
    }

    @Override // defpackage.m730
    public JSPluginWebViewTitleControl get() {
        return newInstance(this.contextProvider.get());
    }
}
