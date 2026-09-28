package com.sportybet.plugin.webcontainer.caipiao.jsplugin;

import defpackage.fbh0;
import defpackage.l730;

/* JADX INFO: loaded from: classes7.dex */
public final class JSPluginShare_Factory implements l730 {
    private final l730<fbh0> uiRouterManagerProvider;

    private JSPluginShare_Factory(l730<fbh0> l730Var) {
        this.uiRouterManagerProvider = l730Var;
    }

    public static JSPluginShare_Factory create(l730<fbh0> l730Var) {
        return new JSPluginShare_Factory(l730Var);
    }

    public static JSPluginShare newInstance(fbh0 fbh0Var) {
        return new JSPluginShare(fbh0Var);
    }

    @Override // defpackage.m730
    public JSPluginShare get() {
        return newInstance(this.uiRouterManagerProvider.get());
    }
}
