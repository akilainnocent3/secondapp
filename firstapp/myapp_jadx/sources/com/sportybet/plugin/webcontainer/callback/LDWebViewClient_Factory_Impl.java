package com.sportybet.plugin.webcontainer.callback;

import defpackage.evp;
import defpackage.l730;
import defpackage.m730;
import defpackage.xnn;

/* JADX INFO: loaded from: classes7.dex */
public final class LDWebViewClient_Factory_Impl implements LDWebViewClient.Factory {
    private final C1459LDWebViewClient_Factory delegateFactory;

    public LDWebViewClient_Factory_Impl(C1459LDWebViewClient_Factory c1459LDWebViewClient_Factory) {
        this.delegateFactory = c1459LDWebViewClient_Factory;
    }

    public static m730<LDWebViewClient.Factory> create(C1459LDWebViewClient_Factory c1459LDWebViewClient_Factory) {
        return new xnn(new LDWebViewClient_Factory_Impl(c1459LDWebViewClient_Factory));
    }

    public static l730<LDWebViewClient.Factory> createFactoryProvider(C1459LDWebViewClient_Factory c1459LDWebViewClient_Factory) {
        return new xnn(new LDWebViewClient_Factory_Impl(c1459LDWebViewClient_Factory));
    }

    @Override // com.sportybet.plugin.webcontainer.callback.LDWebViewClient.Factory
    public LDWebViewClient create(evp evpVar) {
        return this.delegateFactory.get(evpVar);
    }
}
