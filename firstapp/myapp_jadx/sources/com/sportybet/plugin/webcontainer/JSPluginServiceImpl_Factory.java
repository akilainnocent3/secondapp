package com.sportybet.plugin.webcontainer;

import com.sportybet.plugin.webcontainer.jsbridge.LDJSPlugin;
import defpackage.l730;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class JSPluginServiceImpl_Factory implements l730 {
    private final l730<Set<LDJSPlugin>> pluginsProvider;

    private JSPluginServiceImpl_Factory(l730<Set<LDJSPlugin>> l730Var) {
        this.pluginsProvider = l730Var;
    }

    public static JSPluginServiceImpl_Factory create(l730<Set<LDJSPlugin>> l730Var) {
        return new JSPluginServiceImpl_Factory(l730Var);
    }

    public static JSPluginServiceImpl newInstance(Set<LDJSPlugin> set) {
        return new JSPluginServiceImpl(set);
    }

    @Override // defpackage.m730
    public JSPluginServiceImpl get() {
        return newInstance(this.pluginsProvider.get());
    }
}
