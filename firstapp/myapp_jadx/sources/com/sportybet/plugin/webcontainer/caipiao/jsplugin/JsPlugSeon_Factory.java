package com.sportybet.plugin.webcontainer.caipiao.jsplugin;

import defpackage.k5b;
import defpackage.l730;
import defpackage.sc80;
import defpackage.v5b;

/* JADX INFO: loaded from: classes7.dex */
public final class JsPlugSeon_Factory implements l730 {
    private final l730<v5b> applicationScopeProvider;
    private final l730<k5b> mainDispatcherProvider;
    private final l730<sc80> sessionProvider;

    private JsPlugSeon_Factory(l730<sc80> l730Var, l730<v5b> l730Var2, l730<k5b> l730Var3) {
        this.sessionProvider = l730Var;
        this.applicationScopeProvider = l730Var2;
        this.mainDispatcherProvider = l730Var3;
    }

    public static JsPlugSeon_Factory create(l730<sc80> l730Var, l730<v5b> l730Var2, l730<k5b> l730Var3) {
        return new JsPlugSeon_Factory(l730Var, l730Var2, l730Var3);
    }

    public static JsPlugSeon newInstance(sc80 sc80Var, v5b v5bVar, k5b k5bVar) {
        return new JsPlugSeon(sc80Var, v5bVar, k5bVar);
    }

    @Override // defpackage.m730
    public JsPlugSeon get() {
        return newInstance(this.sessionProvider.get(), this.applicationScopeProvider.get(), this.mainDispatcherProvider.get());
    }
}
