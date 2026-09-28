package com.sportybet.plugin.webcontainer;

import com.sportybet.plugin.webcontainer.callback.LDWebViewClient;
import defpackage.evp;
import defpackage.l730;

/* JADX INFO: loaded from: classes5.dex */
public final class WebViewWrapperServiceImpl_Factory implements l730 {
    private final l730<LDWebViewClient.Factory> ldWebViewClientFactoryProvider;
    private final l730<evp.a> ldjsServiceFactoryProvider;

    private WebViewWrapperServiceImpl_Factory(l730<evp.a> l730Var, l730<LDWebViewClient.Factory> l730Var2) {
        this.ldjsServiceFactoryProvider = l730Var;
        this.ldWebViewClientFactoryProvider = l730Var2;
    }

    public static WebViewWrapperServiceImpl_Factory create(l730<evp.a> l730Var, l730<LDWebViewClient.Factory> l730Var2) {
        return new WebViewWrapperServiceImpl_Factory(l730Var, l730Var2);
    }

    public static WebViewWrapperServiceImpl newInstance(evp.a aVar, LDWebViewClient.Factory factory) {
        return new WebViewWrapperServiceImpl(aVar, factory);
    }

    @Override // defpackage.m730
    public WebViewWrapperServiceImpl get() {
        return newInstance(this.ldjsServiceFactoryProvider.get(), this.ldWebViewClientFactoryProvider.get());
    }
}
