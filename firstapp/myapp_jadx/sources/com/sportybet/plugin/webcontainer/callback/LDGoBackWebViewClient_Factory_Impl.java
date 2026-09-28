package com.sportybet.plugin.webcontainer.callback;

import defpackage.evp;
import defpackage.l730;
import defpackage.m730;
import defpackage.xnn;

/* JADX INFO: loaded from: classes7.dex */
public final class LDGoBackWebViewClient_Factory_Impl implements LDGoBackWebViewClient.Factory {
    private final C1458LDGoBackWebViewClient_Factory delegateFactory;

    public LDGoBackWebViewClient_Factory_Impl(C1458LDGoBackWebViewClient_Factory c1458LDGoBackWebViewClient_Factory) {
        this.delegateFactory = c1458LDGoBackWebViewClient_Factory;
    }

    public static m730<LDGoBackWebViewClient.Factory> create(C1458LDGoBackWebViewClient_Factory c1458LDGoBackWebViewClient_Factory) {
        return new xnn(new LDGoBackWebViewClient_Factory_Impl(c1458LDGoBackWebViewClient_Factory));
    }

    public static l730<LDGoBackWebViewClient.Factory> createFactoryProvider(C1458LDGoBackWebViewClient_Factory c1458LDGoBackWebViewClient_Factory) {
        return new xnn(new LDGoBackWebViewClient_Factory_Impl(c1458LDGoBackWebViewClient_Factory));
    }

    @Override // com.sportybet.plugin.webcontainer.callback.LDGoBackWebViewClient.Factory
    public LDGoBackWebViewClient create(evp evpVar) {
        return this.delegateFactory.get(evpVar);
    }
}
